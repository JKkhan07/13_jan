package PageScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPages.HomePage;
import WebPages.LoginPage;
import junit.framework.Assert;
import utilities.SeleniumUtility;

public class loginout extends SeleniumUtility {
	WebDriver driver=null;
	LoginPage login=null;
	HomePage home = null;
	
	@BeforeTest
	public void condition () {
		driver=setUp("chrome", "https://demo.actitime.com/login.do");
		login= new LoginPage(driver);
		home = new HomePage(driver);
		login.login("admin", "manager");
		
	}
	@Test
	public void loginFunction() {
		String actualTitle=login.getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, "actiTIME - Enter Time-Track"," Page title get changed");
		
	}
	@Test
	public void logoutFunction() {
		home.logoutapp();
		String actuallogout=home.gethomepagetitle();
		Assert.assertEquals(actuallogout, "actiTIME - Login");
	}
	@AfterTest
	public void post() {
		cleanUp();
		
	}

}
