package com.demoQA_Widgets.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Widgets.pagefactory.Tabs_page;

public class Tabs_test extends BaseClass {
	
	Tabs_page tabobj;
	
	@BeforeMethod
	public void startTest(ITestResult result) {
		testStart(result);
	}
	
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
		 
		 tabobj=new Tabs_page(driver);
	}
	
	@Test(priority=1)
	public void tab_test() {
		
		
		String b=tabobj.tab();
		Assert.assertEquals(b, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		System.out.println(b);
	}
	
	@Test(priority=2)
	public void origin_test() {
		
		
		String d=tabobj.origintab();
		Assert.assertEquals(d,"Contrary to popular belief, Lorem Ipsum is not simply random text");
		System.out.println(d);
	}
	
	@Test(priority=3)
	public void use_test() {
		
		
		String f=tabobj.usetab();
		Assert.assertEquals(f, "Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
		System.out.println(f);
	}
	
	@AfterMethod
	public void getStatus(ITestResult result) throws IOException {
		getTestStatus(result);
	}

}
