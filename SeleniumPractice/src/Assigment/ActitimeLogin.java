package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeLogin {

	public static void main(String[] args) {
//		String driver=".\\executable\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", driver);
		WebDriverManager.chromedriver().setup();
		WebDriver drv = new ChromeDriver();
		drv.get("https://demo.actitime.com/login.do");
		String jk =drv.getCurrentUrl();
		System.out.println("Current page url: "+jk);
		System.out.println("current page length: "+jk.length());
		String expectedTitle="actiTIME - Login";
		String actualTitle=drv.getTitle();
		if(actualTitle.equals(expectedTitle)){
		
		System.out.println("Login page opened");
	}else {
		System.out.println("login page get changed");
	}
		WebElement UserNameInputField=drv.findElement(By.id("username"));
		UserNameInputField.sendKeys("admin");
		WebElement PasswordInputField=drv.findElement(By.name("pwd"));
		PasswordInputField.sendKeys("manager");
		WebElement LoginButton=drv.findElement(By.id("loginButton"));
		LoginButton.click();
		drv.close();
		
		

}
}