package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class datapro extends SeleniumUtility{
	@DataProvider
	public Object[][] getname(){
		Object [][] data = new Object[3][2];
		data[0][0]="admin";
		data[0][1]="manger";
		data[1][0]= "";	
		data[1][1]="";
		data[2][0]="admin";
		data[2][1]="1232";
		return data;
	}
	@Test(dataProvider = "getname")
	public void setdata(String username,String password) {
		System.out.println("Username is "+username);
		System.out.println("password is "+password);
		
	}

}
