package Assigment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricinfopage {

	public static void main(String[] args) {
		String driverpath = ".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualhomepage = driver.getTitle();
		System.out.println("actual home page title: "+actualhomepage);
		String expectedhomepage = ("Live cricket scores, match schedules, latest cricket news, cricket videos");
		if(actualhomepage.equals(expectedhomepage)) {
			System.out.println("home is varified");
		}else {
			System.out.println("home page has been changed ");
		}
		List<WebElement> cricinfo = driver.findElements(By.cssSelector(".ds-flex>div>div>a"));
		System.out.println("main page count: "+cricinfo.size());
		for(int i=0; i<cricinfo.size();i++) {
			System.out.println(cricinfo.get(i).getText());
		}

	}

}
