package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	//PageFactory
	@FindBy(xpath ="//input[@placeholder='User name or Email']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='lfpwd']")
	WebElement userPassword;
	
	@FindBy(xpath ="//button[@class='line-height-input btn-padding text-l auth-button login-button']")
	WebElement login;
	
	//ActionMethod
	public void loginApps(String userEmail, String password ) {
		userName.sendKeys(userEmail);
		userPassword.sendKeys(password);
		login.click();
		
	}
	
	
	
}
