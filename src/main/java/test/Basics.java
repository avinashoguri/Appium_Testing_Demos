package test;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base{
	
	@Test
	public void demoTests() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=capabulities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementByXPath("//android.widget.CheckBox[@resource-id='android:id/checkbox']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
		driver.findElementByXPath("//android.widget.EditText[@resource-id='android:id/edit']").sendKeys("CHAITANYA");
		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		
	}

}
