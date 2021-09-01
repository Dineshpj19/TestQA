package com.demoQA_Elements.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Elements.pagefactory.Checkbox_Page;

public class Checkbox_test extends BaseClass {
	
	@BeforeSuite
	public void getReports() {
		getSysInfo();
	}
	
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
		
	}
	
	@BeforeMethod
	public void startTest(ITestResult result) {
		testStart(result);
	}
	
	
	@Test(priority=1,enabled=true)
	public void checkbox_test() {
		
		
		
		Checkbox_Page object=new Checkbox_Page(driver);
		object.checkbox();
		Assert.assertTrue(false);
		
		
	}
	
	@AfterMethod
	public void getStatus(ITestResult result) throws IOException {
		getTestStatus(result);
	}
	
	@AfterClass
	public void close() {
		
		driver.close();
	}


	@AfterSuite
	public void endTest() {
		endReport();
	}
}
