package zxc.exception;

import java.util.function.BiConsumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.Region;
import com.applitools.eyes.StdoutLogHandler;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.selenium.wrappers.EyesRemoteWebElement;
import com.applitools.eyes.selenium.wrappers.EyesWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App
{
    public static void main(String[] args)
    {
        configure((eyes, wd) ->
        {
            wd.get("http://127.0.0.1:9999");

            // precondition that actually performed long before the visual check
            WebElement targetFrame = wd.findElement(By.cssSelector("#documentIFrame"));
            wd.switchTo().frame(targetFrame);

            /**
             * please note that we perform few computations on our side in original code, that's why
             * we pass a region, not a web element
             */
            WebElement element = wd.findElement(By.cssSelector("body > #target"));
            Region region = new Region(element.getLocation().getX(),
                    element.getLocation().getY(),
                    element.getRect().getWidth(),
                    element.getRect().getHeight());
            WebElement frame = getFrame(eyes);
            wd.switchTo().defaultContent();
            // if we pass the element everything works well, but this is not an option for us
            eyes.check("element", Target.region(region).frame(frame));
        });
    }

    private static WebElement getFrame(Eyes eyes)
    {
        EyesWebDriver driver = (EyesWebDriver) eyes.getDriver();
        WebElement frame = (WebElement) driver.executeScript("return window.frameElement;");
        return new EyesRemoteWebElement(eyes.getLogger(), driver, frame);
    }

    private static void configure(BiConsumer<Eyes, WebDriver> configured)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = null;
        Eyes eyes = null;
        try
        {
            eyes = new Eyes();
            eyes.setSendDom(false);
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
