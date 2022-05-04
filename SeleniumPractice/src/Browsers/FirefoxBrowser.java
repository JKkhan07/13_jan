package Browsers;


import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		String driverpath=".\\executable\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		FirefoxDriver str=new FirefoxDriver();
		
	}

}
