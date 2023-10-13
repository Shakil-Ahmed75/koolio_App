package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel.LandingPage;
import pageObjectModel.UploadAudioFile;
import webDriverSets.BaseDriver;

public class TC_01 extends BaseDriver  {
	public WebDriver driver;
	String url="https://development.app.koolio.ai/";
	
	@Test
	public void koolioApp()  {
		
//		a. Login
//		 b. Upload an audio file with its annotations (Download Audio file)
//		 c. Play the uploaded audio till end
//		 d. Select an area from SPK track (upper track)
//		 e. Copy &Paste to another inside the same track
//		 f.Add an SFX on SFX track (lower track)
//		 Add an SFX on SFX track (lower track)
//		 g. Apply Fade on the SFX
			
		driver.get(url);
	
		LandingPage landingPage = new LandingPage(driver);
		landingPage.loginApps("Paykoolio","123Abc!@");
		
		UploadAudioFile uploadAudioFile = new UploadAudioFile(driver);
		uploadAudioFile.uploadingAutoFile();	 
		
	}
	

}
