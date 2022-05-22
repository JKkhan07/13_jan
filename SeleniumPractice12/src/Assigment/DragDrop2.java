package Assigment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
//		List<WebElement> sort = driver.findElements(By.xpath("//ul[@id=\"sortable\"]/li"));
//		System.out.println(sort.size());
//		WebElement sour=driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"));
//		WebElement dest = driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
		Actions act = new Actions(driver);
		for(int i=1; i<=7;i++) {
			WebElement dest = driver.findElement(By.xpath("//ul[@id='sortable']/li["+i+"]"));
			WebElement sour=driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"));
			act.dragAndDrop(sour, dest).build().perform();
			Thread.sleep(1000);
			
		}
	}

}
