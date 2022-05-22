package Paramerization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtility;

public class parameter1 extends SeleniumUtility  {
	@Parameters({"browser"})
	@Test(priority=1)
	public void para1(String browser) {
		System.out.println("browser passed as: "+browser);
		
	}
	@Parameters({"username","password"})
	@Test (priority=2)
	public void para2(String username,String password) {
		System.out.println("Parameter for User Name passed as: "+username);
		System.out.println("Parameter for User password passed as: "+password);
		
	}
	@Parameters({"browser","username","password"})
	@Test(priority=3)
	public void para3(String browser,String username,String password) {
		System.out.println("browser passed as: "+browser);
		System.out.println("Parameter for User Name passed as: "+username);
		System.out.println("Parameter for User password passed as: "+password);
		
	}
	@Parameters({"browser","username","password"})
	@Test(priority=4)
	public void loginatactitime(String browser,String username,String password) {
		setUp(browser, "https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password,Keys.ENTER);
		
	}

}
