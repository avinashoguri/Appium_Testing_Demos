package test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import bsh.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridBase {


	public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
	AndroidDriver<AndroidElement>  driver;
	ChromeOptions chromeOptions = new ChromeOptions();

	// TODO Auto-generated method stub
	/* File appDir = new File("src");
	     File app = new File(appDir, "ApiDemos-debug.apk");*/
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	    
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY2224FLQR");
	     
	     capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
	    capabilities.setCapability("chromedriverExecutable","C:\\Users\\Malempati Parvathi\\Desktop\\original\\Appium_Testing_Demos\\drivers\\chromedriver.exe");
	    chromeOptions.setExperimentalOption("w3c", false);
	    capabilities.merge(chromeOptions);
	  //   capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			
			driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
			
	   return driver;
	}

	}



