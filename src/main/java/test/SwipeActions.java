package test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class SwipeActions extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=capabulities();

		String dateWidgets="//android.widget.TextView[@text='Date Widgets']";
		String inLine="//android.widget.TextView[@text='2. Inline']";
		String hours="//*[@content-desc='9']";
		String first="//*[@content-desc='15']";
		String second="//*[@content-desc='45']";

		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByXPath(dateWidgets).click();
		driver.findElementByXPath(inLine).click();
		driver.findElementByXPath(hours).click();

		TouchAction t=new TouchAction(driver);

		WebElement Ta1=driver.findElementByXPath(first);

		WebElement Ta2=driver.findElementByXPath(second);

		TouchAction tc=new TouchAction(driver);

		//tap on 2 sec and move on second relese

		t.longPress(longPressOptions().withElement(element(Ta1)).withDuration(ofSeconds(2))).moveTo(element(Ta2)).release().perform();




	}

}




















