package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;

public class ApiDemos {
	AndroidElement driver;
	public  ApiDemos(AndroidElement driver) {
		this.driver=driver;
		//PageFactory.initElements((AndroidElement) driver, this);
	}
	
	@FindBy(xpath="")
	AndroidElement references;
	
	public AndroidElement preference() {
		return references;
	}
	
	@FindBy(xpath="")
	AndroidElement preferencs;
	
	public AndroidElement peferences() {
		return preferencs;
	}
	@FindBy(xpath="")
	AndroidElement prerences;
	
	public AndroidElement peferencs() {
		return preferences;
	}
	
	@FindBy(xpath="")
	AndroidElement preferences;
	
	public AndroidElement preferences() {
		return preferences;
	}
	
	
	

}
