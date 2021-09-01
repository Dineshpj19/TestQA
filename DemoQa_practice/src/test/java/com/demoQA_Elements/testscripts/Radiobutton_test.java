package com.demoQA_Elements.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Elements.pagefactory.Radiobutton_page;

public class Radiobutton_test extends BaseClass {
	
	@BeforeTest
	public void open() {
		
		initialization();
		geturl();
		
	}
	
	@Test
	public void radio_test() throws InterruptedException {
		
		Radiobutton_page object=new Radiobutton_page(driver);
		object.button();
	}
	
	@AfterClass
	public void close() {
		
		driver.close();
	}
	
	

}
