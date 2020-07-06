package test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;


import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.TouchAction;
import static java.time.Duration.ofSeconds;



public class Gestures extends Base{

	public static void main(String[] args) throws MalformedURLException, Throwable {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=capabulities();

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		TouchAction t=new TouchAction(driver);

		WebElement ExpandableLists=driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");

		t.tap(tapOptions().withElement(element(ExpandableLists))).perform();

		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();

		WebElement peopleNames=driver.findElementByXPath("//android.widget.TextView[@text='People Names']");

		t.longPress( longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release().perform();
		Thread.sleep(5000);
		System.out.println("sample action is displayed :"+driver.findElementById("android:id/title").isDisplayed());
		



	}

}















