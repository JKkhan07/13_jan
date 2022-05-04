package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenAnyBrowser {

	public static void main(String[] args) {
		String ChromeDriver=(".\\executable\\chromedriver.exe");
		String FirefoxDriver=(".\\executable\\geckodriver.exe");
		//OpenBrowser(ChromeDriver,"Chrome");
		OpenBrowser(FirefoxDriver,"Firefox");

	}
	static void OpenBrowser(String driverPath, String browsername) {
		if(browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", driverPath);
			WebDriver Cdriver = new ChromeDriver();
			
		}else if(browsername.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", driverPath);
			WebDriver Fdriver = new FirefoxDriver();
			
		}
		
	}

}
 