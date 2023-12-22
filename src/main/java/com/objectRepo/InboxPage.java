package com.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class InboxPage {

	AndroidDriver driver;
	public InboxPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath  = "//android.widget.TextView[@text='Inbox']")
	private WebElement inbox;
	
	@FindBy(xpath = "//android.widget.TextView[@text='No messages']")
	private WebElement message;
	
	@FindBy(xpath = "(//android.widget.ImageButton[@package='com.hm.goe'])[1]")
	private WebElement options;
	

	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getInbox() {
		return inbox;
	}

	public WebElement getMessage() {
		return message;
	}
	
	public void inbox() {
		options.click();
		inbox.click();
		String msg = message.getText();
		System.out.println(msg);
		
	}
}
