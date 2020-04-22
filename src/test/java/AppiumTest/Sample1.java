package AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Sample1 {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		
		try{
			sampleTest1();
			
		}catch(Exception exp){
			exp.getCause();
			exp.getMessage();
			exp.printStackTrace();
		}
				
	}
	
	public static void sampleTest1() throws Exception{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "XXX");
		cap.setCapability("udid", "XXX");
		cap.setCapability("platform", "Android");
		cap.setCapability("platformVersion", "7.1.2");
		cap.setCapability("appPackage", "com.myos.calculator2");
		cap.setCapability("appActivity", "com.myos.calculator2.calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Finished");
		
	}

}
