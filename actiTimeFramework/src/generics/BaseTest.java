package generics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
	protected WebDriver driver;
	@BeforeMethod
	public void openBrowser() throws IOException {
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		String url = flib.readPropertyData(PROP_PATH, "url");
		
		if(browserValue.equals("chrome")) {
		System.setProperty(CHROME_PATH,CHROME_KEY);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		driver.get(url);
		}
		else if(browserValue.equals("firefox")) {
			System.setProperty(GECKO_PATH, GECKO_KEY);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
			driver.get(url);
		}
		else {
			System.out.println("bro check property file");
		}
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
