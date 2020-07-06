package test;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiAutomatorTest extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=capabulities();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		int s=driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size();
		System.out.println(s);
	}

}
