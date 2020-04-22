package Config;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MobileNumAndCode {
	
	public static void inputMobileNum(AndroidDriver driver){
		//电话号码是18515833202
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_1));
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_8));
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_5));
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_1));
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_5));
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_8));
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_3));
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_3));
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_2));
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_0));
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_2));	
	}
	
	public static void inputCode(AndroidDriver driver){
		//验证码是9999
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_9));
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_9));
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_9));
		driver.pressKey(new KeyEvent(AndroidKey.NUMPAD_9));		
	}
	
	public static void inputDescription(AndroidDriver driver){
		
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.U));
		driver.pressKey(new KeyEvent(AndroidKey.T));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.M));
		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.T));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.O));
		driver.pressKey(new KeyEvent(AndroidKey.N));
		driver.pressKey(new KeyEvent(AndroidKey.SPACE));
		driver.pressKey(new KeyEvent(AndroidKey.T));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.S));
		driver.pressKey(new KeyEvent(AndroidKey.T));
	}

}
