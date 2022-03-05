package testActiTimeMaven;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class BaseTest1 {
	WebDriver driver;
	@Test
	public void failed() {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/fileName.png");
			Files.copy(src, dest);
			
		} catch(Exception e){
			
		}
	}
}
