package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecuteLogin {

	public static void main(String[] args) {
		String d1=".\\executable\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", d1);
		WebDriver drv1 = new FirefoxDriver();
		drv1.get("https://demosite.executeautomation.com/Login.html");
		String d2=drv1.getCurrentUrl();
		System.out.println("Current url: "+d2);
		System.out.println("length of current url: "+d2.length());
		String expectedtitle ="Execute Automation";
		String actualtitle = drv1.getTitle();
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("login page is opened ");
		}else {
			System.out.println("login page is changed ");
		}
		WebElement UserNameInputField=drv1.findElement(By.name("UserName"));
		UserNameInputField.sendKeys("execution");
		WebElement PasswordInputField =drv1.findElement(By.name("Password"));
		PasswordInputField.sendKeys("admin");
		WebElement LoginButton = drv1.findElement(By.name("Login"));
		LoginButton.click();

	}

}
