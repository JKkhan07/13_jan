package Browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		String driverpath=".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		ChromeDriver str=new ChromeDriver();
	}

}
