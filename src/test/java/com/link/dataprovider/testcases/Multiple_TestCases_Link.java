package com.link.dataprovider.testcases;

import org.testng.annotations.Test;

import com.mutipaltestcases.dataprovider.link.DataProvder_Multipal_TC;

public class Multiple_TestCases_Link {
	@Test(priority=1,dataProviderClass = DataProvder_Multipal_TC.class, dataProvider = "getData")
	public void launchUrl(String Browser, String username, String password, int Roll_number) {
		System.out.println(Browser+"---"+username+"---"+password+"---"+Roll_number);
	}
	@Test(priority=2,dataProviderClass = DataProvder_Multipal_TC.class, dataProvider = "getData")
	public void entercredentials(String Browser, String username, String password, int Roll_number) {
		System.out.println(Browser+"---"+username+"---"+password+"---"+Roll_number);
		
	}
	@Test(priority=3,dataProviderClass = DataProvder_Multipal_TC.class, dataProvider = "getData")
	public void inboxPage(String Browser, String username, String password, int Roll_number) {
		System.out.println(Browser+"---"+username+"---"+password+"---"+Roll_number);
		
	}
	@Test(priority=4,dataProviderClass = DataProvder_Multipal_TC.class, dataProvider = "getData")
	public void logout(String Browser, String username, String password, int Roll_number) {
		System.out.println(Browser+"---"+username+"---"+password+"---"+Roll_number);
		
	}

}
