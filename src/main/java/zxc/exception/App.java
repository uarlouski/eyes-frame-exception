package zxc.exception;

import java.util.function.BiConsumer;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.CoordinatesType;
import com.applitools.eyes.Region;
import com.applitools.eyes.StdoutLogHandler;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App
{
    public static void main(String[] args)
    {
        configure((eyes, wd) ->
        {
            wd.get("http://www.meteo.psu.edu/~jyh10/classes/meteo473/basic-frames.html");
            wd.switchTo().frame((WebElement) wd.findElement(By.xpath("/html/frameset/frame[3]")));
            WebElement target = wd.findElement(By.xpath("/html/body/font/p[1]"));
            Rectangle rect = target.getRect();
            Region region = new Region(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight(),
                    CoordinatesType.CONTEXT_RELATIVE);
            eyes.check("element", Target.region(region));
        });
    }

    private static void configure(BiConsumer<Eyes, WebDriver> configured)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = null;
        Eyes eyes = null;
        try
        {
            eyes = new Eyes();
            eyes.setLogHandler(new StdoutLogHandler(true));
            eyes.setApiKey(System.getenv("API_KEY"));
            driver = new ChromeDriver();
            eyes.open(driver, "get-exception", "get-exception-for-frame");
            configured.accept(eyes, driver);
        }
        finally
        {
            driver.close();
            eyes.abortIfNotClosed();
        }
    }
}
