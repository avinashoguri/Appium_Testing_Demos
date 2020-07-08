package test;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragAndDropDemo extends Base {

	public static void main(String[] args) throws MalformedURLException, Throwable {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=capabulities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		//TouchAction t=new TouchAction(driver);
		
		/*WebElement source=driver.findElementsByClassName("android.view.View").get(0);
		WebElement destination=driver.findElementsByClassName("android.view.View").get(1);
		Thread.sleep(3000);
		//t.longPress(element(soursc)).moveTo(element(destination)).release().perform();
		 //    t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
	     t.longPress(element(source)).moveTo(element(destination)).release().perform();
	  */
	     WebElement source=driver.findElementsByClassName("android.view.View").get(0);
	     WebElement destination=driver.findElementsByClassName("android.view.View").get(1);
	     
	     
	     TouchAction t = new TouchAction(driver);
	     //longpress(source)/move(destination)//release
	 //    t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
	     t.longPress(element(source)).moveTo(element(destination)).release().perform();
	     
	
		
		
	}

}
