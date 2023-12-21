package com.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.DriverUtility;
import io.appium.java_client.android.AndroidDriver;

public class FollowUsPage {

	AndroidDriver driver;
	
	public FollowUsPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(xpath = "(//android.widget.ImageButton)[1]")
	private WebElement option;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Follow us']")
	private WebElement followUs;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Pinterest']")
	private WebElement pinterest;
	
	public void followUs(DriverUtility dutil) {
	
		option.click();
		followUs.click();
		pinterest.click();
		dutil.context();
		dutil.switchContext("WEBVIEW_chrome");
		String title = driver.getTitle();
		System.out.println(title);
	}
}
