package com.demoQA_Elements.testscripts;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;

import com.demoQA_Elements.pagefactory.Textbox_Page;

public class Textbox_test extends BaseClass {
	
	@BeforeMethod(alwaysRun=true)
	public void startTest(ITestResult result) {
		testStart(result);
	}
	
	@BeforeTest(alwaysRun=true)
	public void getReports() {
		getSysInfo();
	}
	
	@AfterTest(alwaysRun=true)
	public void endTest() {
		endReport();
	}
	
	@AfterMethod(alwaysRun=true)
	public void getStatus(ITestResult result) throws IOException {
		getTestStatus(result);
	}
	
	
	@BeforeClass
	
	public void open() {
		initialization();
		geturl();
		
 }
	
	
	@Test(priority=1,enabled=true)
	public void textbox_test() {
		
		
		Textbox_Page object=new Textbox_Page(driver);
		
		 object.textbox();
		 
		
		 
		 
   }
	
	
	
	@AfterClass
	public void close() {
		
		driver.close();
	}
	
	
	
	
	
	

}
