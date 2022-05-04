package Assigment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmarenRealme {

	public static void main(String[] args) {
		String driverpath = ".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualhomepage = driver.getTitle();
		String expectedhomepage = ("GSMArena.com - mobile phone reviews, news, specifications and more...");
		if(actualhomepage.equals(expectedhomepage)) {
			System.out.println("home is varified");
		}else {
			System.out.println("home page has been changed ");
		}
		List<WebElement> gsmarena = driver.findElements(By.cssSelector(".brandmenu-v2>ul>*:nth-child(14)"));
		System.out.println("moblie name: "+gsmarena.size());

	}

}
