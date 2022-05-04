package Assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Etrain {

	public static void main(String[] args) throws InterruptedException  {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	driver.get("https://etrain.info/");
	WebElement source =driver.findElement(By.cssSelector("input[id='tbsfi1']"));
	source.sendKeys("Pune");
	WebElement pune = driver.findElement(By.cssSelector(".ui-menu-item>a>i"));
	pune.click();
	WebElement Destination =driver.findElement(By.cssSelector("input[name='station2']"));
	Destination.sendKeys("LTT");

	WebElement ltt = driver.findElement(By.cssSelector(".ui-autocomplete>div>a>i"));
	ltt.click();
	driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	WebElement button = driver.findElement(By.cssSelector("button[id='tbssbmtbtn']"));
	button.click();
	//.trainlist>*>tbody>tr
	
	}

}
