# Steps
1. `git clone https://github.com/uarlouski/eyes-frame-exception.git`
2. `node webapp/index.js &`
3. `export API_KEY=<key>`
4. `./gradlew run`

# Error traces
## Send dom error
```
Session ID: b9e769bf3735eb9aa332729d9725709d
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)
	at org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)
	at org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)
	at org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)
	at org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)
	at org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)
	at org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)
	at org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:489)
	at com.applitools.eyes.selenium.wrappers.EyesWebDriver.executeScript(EyesWebDriver.java:338)
	at com.applitools.eyes.selenium.SeleniumJavaScriptExecutor.executeScript(SeleniumJavaScriptExecutor.java:16)
	at com.applitools.eyes.selenium.positioning.ScrollPositionProvider.setPosition(ScrollPositionProvider.java:51)
	at com.applitools.eyes.selenium.positioning.ScrollPositionProvider.restoreState(ScrollPositionProvider.java:95)
	at com.applitools.eyes.selenium.capture.DomCapture.getFullWindowDom(DomCapture.java:78)
	at com.applitools.eyes.selenium.SeleniumEyes.tryCaptureDom(SeleniumEyes.java:627)
	at com.applitools.eyes.EyesBase.tryCaptureAndPostDom(EyesBase.java:775)
	at com.applitools.eyes.selenium.SeleniumEyes.getScreenshot(SeleniumEyes.java:1737)
	at com.applitools.eyes.EyesBase.getAppOutputWithScreenshot(EyesBase.java:1381)
	at com.applitools.eyes.EyesBase.access$000(EyesBase.java:41)
	at com.applitools.eyes.EyesBase$2.getAppOutput(EyesBase.java:1066)
	at com.applitools.eyes.MatchWindowTask.tryTakeScreenshot(MatchWindowTask.java:495)
	at com.applitools.eyes.MatchWindowTask.takeScreenshot(MatchWindowTask.java:448)
	at com.applitools.eyes.MatchWindowTask.matchWindow(MatchWindowTask.java:363)
	at com.applitools.eyes.EyesBase.matchWindow(EyesBase.java:825)
	at com.applitools.eyes.EyesBase.checkWindowBase(EyesBase.java:752)
	at com.applitools.eyes.selenium.SeleniumEyes.checkRegion(SeleniumEyes.java:1002)
	at com.applitools.eyes.selenium.SeleniumEyes.check(SeleniumEyes.java:698)
	at com.applitools.eyes.selenium.SeleniumEyes.check(SeleniumEyes.java:603)
	at com.applitools.eyes.selenium.Eyes.check(Eyes.java:494)
	at zxc.exception.App.lambda$0(App.java:43)
	at zxc.exception.App.configure(App.java:67)
	at zxc.exception.App.main(App.java:23)
```
## Custom region
```
Exception in thread "main" java.lang.IllegalArgumentException: height < 0
	at com.applitools.utils.ArgumentGuard.greaterThanOrEqualToZero(ArgumentGuard.java:69)
	at com.applitools.eyes.Region.<init>(Region.java:69)
	at com.applitools.eyes.selenium.SeleniumEyes$3.getRegion(SeleniumEyes.java:1030)
	at com.applitools.eyes.EyesBase.matchWindow(EyesBase.java:822)
	at com.applitools.eyes.EyesBase.checkWindowBase(EyesBase.java:752)
	at com.applitools.eyes.selenium.SeleniumEyes.checkRegion(SeleniumEyes.java:1002)
	at com.applitools.eyes.selenium.SeleniumEyes.checkFrameFluent(SeleniumEyes.java:770)
	at com.applitools.eyes.selenium.SeleniumEyes.check(SeleniumEyes.java:706)
	at com.applitools.eyes.selenium.SeleniumEyes.check(SeleniumEyes.java:603)
	at com.applitools.eyes.selenium.Eyes.check(Eyes.java:494)
	at zxc.exception.App.lambda$0(App.java:43)
	at zxc.exception.App.configure(App.java:67)
	at zxc.exception.App.main(App.java:23)
```