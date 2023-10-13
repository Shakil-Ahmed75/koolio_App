package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AudioFileRun {
	
	public WebDriver driver;
	public AudioFileRun(WebDriver driver) {
		this.driver= driver;
		
	}
	@FindBy(xpath ="//span[@id='0030e5d9-6fd5-4c50-9fc8-de12c1ebaeac_view']")
	WebElement audioPlay;
	@FindBy(xpath = "//div[@id='control-opt-edit']")
	WebElement editAudio;

	public void audioRun() {
		audioPlay.click();
		editAudio.click();
		
		
	}
}
