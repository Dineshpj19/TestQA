package com.demoQA_Elements.testscripts;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Elements.pagefactory.Links_page;

public class Links_test extends BaseClass {
	
	Links_page object;
	
	@BeforeClass
	public void open() {
		
		initialization();
		geturl();
		object=new Links_page(driver);
	}
	
	@Test(priority=1)
	public void maintest() {
		object.main();
		
	}
	
	@Test(priority=2)
	public void linktest() {
		
	object.links();
		
	}
	
	@Test(priority=3)
	public void apitest() throws InterruptedException {
		
		object.api();
		
	}
	

}
