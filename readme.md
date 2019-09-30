# Steps
1. `git clone https://github.com/uarlouski/eyes-frame-exception.git`
2. `export API_KEY=<key>`
3. `./gradlew run`

# Listing
```
Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
  (Session info: chrome=77.0.3865.90)
For documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html
Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'
System info: host: 'Uladzislaus-MBP.minsk.epam.com', ip: 'fe80:0:0:0:1037:2651:b4a7:30c9%en0', os.name: 'Mac OS X', os.arch: 'x86_64', os.version: '10.13.6', java.version: '12.0.1'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 77.0.3865.90, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: /var/folders/qy/rbz62t5s5_b...}, goog:chromeOptions: {debuggerAddress: localhost:50786}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}
Session ID: e6a768707d33dc034e7ba120bd1d7844
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
	at com.applitools.eyes.selenium.positioning.ScrollPositionProvider.getCurrentPosition(ScrollPositionProvider.java:34)
	at com.applitools.eyes.selenium.positioning.ScrollPositionProvider.getCurrentPosition(ScrollPositionProvider.java:42)
	at com.applitools.eyes.selenium.positioning.ScrollPositionProvider.getState(ScrollPositionProvider.java:90)
	at com.applitools.eyes.selenium.SeleniumEyes.getScreenshot(SeleniumEyes.java:1705)
	at com.applitools.eyes.EyesBase.getAppOutputWithScreenshot(EyesBase.java:1381)
	at com.applitools.eyes.EyesBase.access$000(EyesBase.java:41)
	at com.applitools.eyes.EyesBase$2.getAppOutput(EyesBase.java:1066)
	at com.applitools.eyes.MatchWindowTask.tryTakeScreenshot(MatchWindowTask.java:495)
	at com.applitools.eyes.MatchWindowTask.takeScreenshot(MatchWindowTask.java:448)
	at com.applitools.eyes.MatchWindowTask.matchWindow(MatchWindowTask.java:363)
	at com.applitools.eyes.EyesBase.matchWindow(EyesBase.java:825)
	at com.applitools.eyes.EyesBase.checkWindowBase(EyesBase.java:752)
	at com.applitools.eyes.selenium.SeleniumEyes.check(SeleniumEyes.java:684)
	at com.applitools.eyes.selenium.SeleniumEyes.check(SeleniumEyes.java:603)
	at com.applitools.eyes.selenium.Eyes.check(Eyes.java:494)
	at zxc.exception.App.lambda$0(App.java:26)
	at zxc.exception.App.configure(App.java:42)
	at zxc.exception.App.main(App.java:21)
```
