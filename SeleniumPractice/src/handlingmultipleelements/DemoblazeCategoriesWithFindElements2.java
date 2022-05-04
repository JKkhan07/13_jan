package handlingmultipleelements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeCategoriesWithFindElements2 {


	public static void main(String[] args) {

		String driverpath = ".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		List<WebElement> categories = driver.findElements(By.cssSelector(".list-group>a"));
		System.out.println("count of catergories: " + categories.size());
		List<String> l1=new ArrayList<String>();
		l1.add("CATEGORIES");
		l1.add("Phones");
		l1.add("Laptops");
		l1.add("Monitors");
		
		for (int i = 0; i < categories.size(); i++) {
		WebElement cat = categories.get(i);
		System.out.println("********* Element of List is: " + cat.getText() + "*********");
		System.out.println(cat.isDisplayed());
		System.out.println(cat.isEnabled());
		System.out.println(cat.getText().equals(l1.get(i)));
		}
	}

}
