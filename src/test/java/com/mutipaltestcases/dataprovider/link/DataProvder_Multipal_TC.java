package com.mutipaltestcases.dataprovider.link;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class DataProvder_Multipal_TC {
	@DataProvider
	public static Object[][] getData(Method name){
		System.out.println("This case which has this method name is :" + name.getName());
		
		System.out.println("*******************************************");
		Object[][]data = new Object[3][4];
		
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
