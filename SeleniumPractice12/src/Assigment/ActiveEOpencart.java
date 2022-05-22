package Assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveEOpencart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Register = driver.findElement(By.cssSelector(".btn-black"));
		Register.click();
		WebElement Username = driver.findElement(By.cssSelector("input[name='username']"));
		Username.sendKeys("admin");
		WebElement active =driver.switchTo().activeElement();
		Username.sendKeys(Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Javed",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Khan",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("j.pathan0070@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("INDIA",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("JK123",Keys.TAB);
		
		

	}

}
