package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Flib;
import pagePackage.LoginPage;

public class ActiTimeValidLogin extends BaseTest {
	@Test
	public void login() throws IOException {
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String validUsername = flib.readPropertyData(PROP_PATH, "un");
		String validPassword = flib.readPropertyData(PROP_PATH, "pass");
		
		lp.validLogin(validUsername, validPassword);
	}

}
