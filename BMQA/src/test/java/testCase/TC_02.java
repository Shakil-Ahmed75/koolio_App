package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjectModel.AudioFileRun;
import webDriverSets.BaseDriver;

public class TC_02 extends BaseDriver {
	public WebDriver driver;
    String url="https://development.app.koolio.ai/";
	@Test
	public void AudioPlay() {
		driver.get(url);
		AudioFileRun audioFileRun = new AudioFileRun(driver);
		audioFileRun.audioRun();
	}
	

}
