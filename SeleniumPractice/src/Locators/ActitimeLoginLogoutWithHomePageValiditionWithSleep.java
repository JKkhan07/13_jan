package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginLogoutWithHomePageValiditionWithSleep {

	public static void main(String[] args) throws InterruptedException {
		String driver = ".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver);
		WebDriver d1 = new ChromeDriver();
		//d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d1.get("https://demo.actitime.com/login.do");
		String expectedtitle="actiTIME-Login";
		String actualtitle=d1.getTitle();
		if(actualtitle.equals(expectedtitle)){
		System.out.println("Login page is open sucessfully ");
	}else {
		System.out.println("login page is changed ");
	}
		d1.findElement(By.id("username")).sendKeys("admin");
		d1.findElement(By.name("pwd")).sendKeys("manager");
		d1.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String actualhomepagetitle = d1.getTitle();
		System.out.println("actual home page title: "+actualhomepagetitle);
		String expectedhomepagetitle = "actiTIME - Enter Time-Track";
		System.out.println("Expected home page title: "+expectedhomepagetitle);
		if(actualhomepagetitle.equals(expectedhomepagetitle)) {
			System.out.println("Login is successfull and home page title is also varified.");
		}else {
			System.out.println("Either Login is failed or home page title is changed");
		}
		d1.findElement(By.id("logoutLink")).click();
		
		
}
}
