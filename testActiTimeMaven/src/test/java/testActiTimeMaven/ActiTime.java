package testActiTimeMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(CustomListener.class)
public class ActiTime extends BaseTest1 {
	
	//WebDriver driver;

	@BeforeTest
	public  void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
	}

	@BeforeMethod
	public  void login() throws InterruptedException {
		boolean usernameTextbox = driver.findElement(By.name("username")).isDisplayed();
		Assert.assertEquals(usernameTextbox, true);
		Reporter.log("Username Textbox is Displyed= "+usernameTextbox,true);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
	}

	@Test
	public  void actiTimeHome() throws InterruptedException {
		String homePageTitle = driver.getTitle();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(homePageTitle, "actiTIME - Enter Time-Track12");
		softassert.assertAll();
		Reporter.log("HomePage Title is Matched",true);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='Settings']/ancestor::a[@class='content administration']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(1000);
		//HAndling DropDrown
		WebElement colorSchemeDropdown = driver.findElement(By.name("colorScheme"));
		Select sel = new Select(colorSchemeDropdown);
		sel.selectByIndex(4);//Index Starts with Zero
		Thread.sleep(2000);
		//Scroll Down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement saveBtn = driver.findElement(By.xpath("//input[@value='Save Settings']"));
		Point loc = saveBtn.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		jse.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@value='Save Settings']")).click();
		Reporter.log("HomePage Successfuly executed",true);
		
	}
	
	@AfterMethod
	public  void logout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		Reporter.log("Logout Successfuly executed",true);
	}
	
	@AfterTest
	public  void tearDown() {
		driver.quit();
	}

}
