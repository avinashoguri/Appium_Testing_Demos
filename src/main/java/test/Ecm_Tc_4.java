package test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecm_Tc_4 extends Base{

	public static void main(String[] args) throws MalformedURLException, Throwable {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabulities();

		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		//   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		
				
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		Thread.sleep(4000);

		int count=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		double sum=0;
		for(int i=0;i<count;i++) {
			String amount=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();
			sum+=getAmount(amount);
		}
		System.out.println("total sum : "+sum);

		String total=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		double totalAmount=getAmount(total);
		System.out.println("total amount "+totalAmount);
		
		Assert.assertEquals(totalAmount,sum);
		
		//Mobile Gestures

		WebElement checkbox=driver.findElement(By.className("android.widget.CheckBox"));
		TouchAction t=new TouchAction(driver);
		
		t.tap(tapOptions().withElement(element(checkbox))).perform();
		WebElement tc=driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));
		t.longPress(longPressOptions().withElement(element(tc)).withDuration(ofSeconds(2))).release().perform();
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();


	}
	public static double getAmount(String value) {

		return Double.parseDouble(value.substring(1));
		// return amount;
	}

}
