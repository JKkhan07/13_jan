package Assigment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		String driverpath = ".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String actualhomepage = driver.getTitle();
		System.out.println("actual home page title: " + actualhomepage);
		String expectedhomepage = ("Facebook – log in or sign up");
		if (actualhomepage.equals(expectedhomepage)) {
			System.out.println("home is varified");
		} else {
			System.out.println("home page has been changed ");
		}
		WebElement jk = driver.findElement(By.cssSelector("a._4jy2.selected._51sy"));
		jk.click();
		System.out.println("********** for-days **********************");
		WebElement dropdown = driver.findElement(By.name("birthday_day"));
		System.out.println(dropdown.isDisplayed());
		System.out.println(dropdown.isEnabled());
		Select s1 = new Select(dropdown);
		System.out.println("days is multiselect: "+s1.isMultiple());
		List<WebElement> days = s1.getOptions();
		System.out.println("total days: "+days.size());
		for(int i=0; i<days.size();i++) {
			System.out.println("day "+days.get(i).getText());
		}
		WebElement first = s1.getFirstSelectedOption();
		String firstselect0 = first.getText();
		System.out.println("fist select option: "+firstselect0);
		s1.selectByValue("21");
		System.out.println("********** for-month **********************");
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		System.out.println("for multiple: "+s2.isMultiple());
		System.out.println("for Displayed:"+month.isDisplayed());
		System.out.println("for enabled: "+month.isEnabled());
		List<WebElement> month1 =s2.getOptions();
		System.out.println("total month: "+month1.size());
		for(int i=0; i<month1.size();i++) {
		System.out.println(month1.get(i).getText());
		}
		WebElement first1=s2.getFirstSelectedOption();
		String selectoption = first1.getText();
		System.out.println("first select option: "+selectoption);
		s2.selectByValue("6");
		System.out.println("********** for-year **********************");
		WebElement year = driver.findElement(By.id("year"));
		System.out.println("year is visible on page: "+year.isDisplayed());
		System.out.println("year is enable on page: "+year.isEnabled());
		Select s3 = new Select(year);
		System.out.println("year is multi-select: "+s3.isMultiple());
		List<WebElement> year1=s3.getOptions();
		System.out.println("total year count: "+year1.size());
		for(int i=0; i<year1.size();i++) {
			System.out.println("year: "+year1.get(i).getText());
		}
		WebElement year2=s3.getFirstSelectedOption();
		String yearop = year2.getText();
		System.out.println("default year value: "+yearop);
		s3.selectByValue("1994");
		
		
	}
	

}
