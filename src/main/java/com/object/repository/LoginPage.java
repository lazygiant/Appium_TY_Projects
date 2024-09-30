package com.object.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtilities.AndroidDriverUtility;
import com.genericUtilities.GestureUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	AndroidDriver driver;
	
	public LoginPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this );
	}
	
	@FindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
	private WebElement countryDropDown;

	@FindBy(id = "com.androidsample.generalstore:id/nameField")
	private WebElement NameTextField;
	
	@FindBy(id = "com.androidsample.generalstore:id/radioMale")
	private WebElement radioBtnMale;
	
	@FindBy(id = "com.androidsample.generalstore:id/radioFemale")
	private WebElement radioBtnFemale;

	@FindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	private WebElement letsShopBtn;
	
	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getNameTextField() {
		return NameTextField;
	}

	public WebElement getRadioBtnMale() {
		return radioBtnMale;
	}

	public WebElement getRadioBtnFemale() {
		return radioBtnFemale;
	}

	public WebElement getLetsShopBtn() {
		return letsShopBtn;
	}

	//business logics
	public void loginByAllFields(GestureUtility gutil, String country, String name) {
		countryDropDown.click();
		gutil.scrollByText(country).click();
		NameTextField.sendKeys(name);
		radioBtnFemale.click();
		letsShopBtn.click();
	}
	
	public void skipName(AndroidDriverUtility dutil) {
		letsShopBtn.click();
		dutil.toast();
	}
}
