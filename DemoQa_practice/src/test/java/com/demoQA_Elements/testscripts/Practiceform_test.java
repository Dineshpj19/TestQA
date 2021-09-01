package com.demoQA_Elements.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Elements.pagefactory.Practiceform_page;

public class Practiceform_test extends BaseClass {
	
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
		
	}
	
	@Test
	public void formtest() throws InterruptedException {
		
		Practiceform_page object=new Practiceform_page(driver);
		
		object.practice();
		
	}
	
	

}
