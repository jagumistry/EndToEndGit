package com.dataprovider.code;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Concept {
	@Test(dataProvider = "getData")
	public void DataMetrix(String Browser, String username, String password, int roll_number) {
		
		
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][4];
		data[0][0] = "chrome";
		data[0][1] = "username1";
		data[0][2] = "password1";
		data[0][3] = 1234;
		
		
		data[1][0] = "chrome";
		data[1][1] = "username2";
		data[1][2] = "password2";
		data[1][3] = 12345;
		
		
		data[2][0] = "chrome";
		data[2][1] = "username3";
		data[2][2] = "password3";
		data[2][3] = 123456;
		
		return data;
		
		
	}

}
