package com.demoQA_Elements.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Elements.pagefactory.Buttons_page;

public class Buttons_test extends BaseClass {
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
		
	}
	
	@Test
	public void buttontest() {
		
		Buttons_page object=new Buttons_page(driver);
		object.button();
		
		
	}
	
	@AfterClass
	public void close() {
		
		driver.close();
	}

}
