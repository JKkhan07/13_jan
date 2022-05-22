package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) {
		String driverpath = ".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement dropdown = driver.findElement(By.id("Skills"));
		Select s1 = new Select(dropdown);
		System.out.println("skills is mulipule dropdwon: "+s1.isMultiple());
		List<WebElement> list = s1.getOptions();
		System.out.println("count of skills dropdown: "+list.size());
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	//	s1.selectByIndex(2);
		s1.selectByValue("Python");

	}

}
