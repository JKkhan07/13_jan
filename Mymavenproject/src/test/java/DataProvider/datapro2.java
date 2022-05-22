package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class datapro2 extends SeleniumUtility{
	@DataProvider(name="javed")
	public Object[][] getdata(){
		Object [][] data = new Object[3][3];
		data[0][0]="chrome";
		data[0][1]="admin";
		data[0][2]="manager";
		
		data[1][0]="chrome";
		data[1][1]="";
		data[1][2]= "";	
		
		data[2][0]="chrome";
		data[2][1]="admin";
		data[2][2]="1232";
		return data;
	}
	@Test(dataProvider = "javed")
	public void setdata(String browser,String username,String password) {
		setUp(browser, "https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password,Keys.ENTER);
		
	}

}
