package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test5 {
	@Test
	public void Actitimelog() {
		WebDriverManager.chromedriver().setup();
		WebDriver drv = new ChromeDriver();
		drv.get("https://demo.actitime.com/login.do");
		String jk =drv.getCurrentUrl();
		System.out.println("Current page url: "+jk);
		System.out.println("current page length: "+jk.length());
//		String expectedTitle="actiTIME - Login";
		String actualTitle=drv.getTitle();
//		if(actualTitle.equals(expectedTitle)){
//		
//		System.out.println("Login page opened");
//	}else {
//		System.out.println("login page get changed");
//	}
		Assert.assertEquals(drv.getTitle(), "actiTIME -Login","login page is failed");
		WebElement UserNameInputField=drv.findElement(By.id("username"));
		UserNameInputField.sendKeys("admin");
		WebElement PasswordInputField=drv.findElement(By.name("pwd"));
		PasswordInputField.sendKeys("manager");
		WebElement LoginButton=drv.findElement(By.id("loginButton"));
		LoginButton.click();
		drv.close();
		
	}
	
}
