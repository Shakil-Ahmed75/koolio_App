package pageObjectModel;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadAudioFile {
	WebDriver driver;

	public UploadAudioFile(	WebDriver driver){
		this.driver =driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath ="//span[@id='ad34457c-9253-403d-be17-0e2585300ab3_view']")
	//@FindBy(id="add-btn")
	WebElement audioFile;
	 @FindBy(xpath = "//img[@aria-label='Upload Project']")
	 WebElement ulpoadProject;
	
	public void uploadingAutoFile()  {
		
		audioFile.click();
		ulpoadProject.sendKeys("user.dir" + "\\src\\test\\aduio\\1user_2.wav");
		
		
	}
	
}
