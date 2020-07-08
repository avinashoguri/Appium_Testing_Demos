package test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RealDevice extends HybridBase{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.promolta.com/mobile");
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", "");
		
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Why Promolta?']")).getAttribute("class").contains("header"));
		System.out.println("done");
		   




	}

}
