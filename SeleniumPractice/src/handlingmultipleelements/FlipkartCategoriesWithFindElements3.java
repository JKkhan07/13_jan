package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCategoriesWithFindElements3 {

	public static void main(String[] args) {
		String driverpath = ".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> flipkart=driver.findElements(By.cssSelector("._37M3Pb>div>a"));
		System.out.println("phones counts: "+flipkart.size());
		for(int i=0; i<flipkart.size();i++) {
			WebElement flip=flipkart.get(i);
			System.out.println(flip.getText());
		}
		

	}

}
