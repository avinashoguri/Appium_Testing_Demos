package test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import bsh.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	
	public static AndroidDriver<AndroidElement> capabulities() throws MalformedURLException   {
		// TODO Auto-generated method stub

		File f=new File("src/main/java");
		File fs=new File(f,"General-Store.apk");
		//ApiDemos-debug
		//API Demos for Android_v1.9.0_apkpure.com.apk
		//General-Store.apk
		DesiredCapabilities cap=new DesiredCapabilities();

		//cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY2224FLQR");
		//AVIPie
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"AVIPie");
		
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		//cap.setCapability(MobileCapabilityType.VERSION, "5.1.1");//9.0
		cap.setCapability(MobileCapabilityType.VERSION, "9.0");//9.0
		
		cap.setCapability(MobileCapabilityType.PLATFORM, "Android");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
		
		return driver;

	}


}
