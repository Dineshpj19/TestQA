package com.demoQA_Elements.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Elements.pagefactory.WebTables_page;

public class WebTables_test extends BaseClass{
	
	WebTables_page object;
	
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
		
	}
	
	@Test(priority=1)
	public void addtable() throws InterruptedException {
		
		object=new WebTables_page(driver);
		
		object.table_add();
		
	}
	
	@Test(priority=2)
	public void edittest() {
		
		object.edit();
	}
	
	@Test(priority=3)
	public void searchtest() throws InterruptedException {
		
		  object.search();
		  
		
	}
	
	@Test(priority=4)
	public void deletetest() {
		
		object.Delete();
	}
	
	
	@AfterClass
	public void close() {
		
		driver.close();
	}

}
