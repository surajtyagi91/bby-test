package ca.bby.ui.repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BbyLoginPage {
	
	WebDriver driver;
	
	public BbyLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEmailAddressTextbox() {
		return driver.findElement(By.xpath(".//*[@name='ctl00$CP$SignInUC1$UserNameContainer$txtUserName']"));
	}
	
	public WebElement getPasswordTextbox() {
		return driver.findElement(By.xpath(".//*[@type='password']"));
	}
	
	public WebElement getSignInButton() {
		return driver.findElement(By.xpath(".//*[@class='button-left btn-primary btn btn-lock']"));
	}

	public WebElement getForgotPasswordLink() {
		return driver.findElement(By.xpath("//a[text()='I forgot my password']"));
	}
	
	public void waitForPageLoadSignIn(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}

