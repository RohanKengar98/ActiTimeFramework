package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement psw;
	@FindBy(id="loginButton") private WebElement loginbtn;
	@FindBy(id="keepLoggedInLabel") private WebElement keepMeLoginLink;
	
	//initialization
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPsw() {
		return psw;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getKeepMeLoginLink() {
		return keepMeLoginLink;
	}
	
	public void validLogin(String validUsername,String validPassword) {
		usn.sendKeys(validUsername);
		psw.sendKeys(validPassword);
		loginbtn.click();
		
	}
	
	public void invalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException {
		usn.sendKeys(invalidUsername);
		Thread.sleep(1500);
		psw.sendKeys(invalidPassword);
		loginbtn.click();
		Thread.sleep(1500);
		usn.clear();
		
	}
}
