package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.genericUtilities.BaseClass;
import com.object.repository.LoginPage;

public class LoginTest extends BaseClass {
	LoginPage lp = new LoginPage(driver);
	@Test
	public void tc1() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(lp.getCountryDropDown()));
		lp.loginByAllFields(gUtils, "India", "abcd");
	}
	
	@Test
	public void tc2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(lp.getCountryDropDown()));
		lp.getLetsShopBtn().click();
		dUtils.toast();
	}
}
