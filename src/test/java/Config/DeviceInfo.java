package Config;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DeviceInfo {
	
	public static DesiredCapabilities getDefaultCapabilities(){
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "C4Y5T16328002345");
		cap.setCapability("platform", "Android");
		cap.setCapability("platformVersion", "8.0.0");
		cap.setCapability("noReset", true);  //启动后结束后不清空应用数据
		cap.setCapability("resetKeyboard", true);
		cap.setCapability("automationName", "Uiautomator2");
		cap.setCapability("skipServerInstallation", true);
		cap.setCapability("skipDeviceInitialization", true);
		//cap.setCapability("unicodeKeyboard", true);
		cap.setCapability("appPackage", "com.tencent.mm");
		cap.setCapability("appActivity", "com.tencent.mm.ui.LauncherUI");
		cap.setCapability("recreateChromeDriverSessions", true);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("androidProcess", "com.tencent.mm:appbrand0");
		options.addArguments("--no-sandbox");
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		cap.setCapability("browserName", "");
		
		return cap;
	}

}
