package com.demoQA_Elements.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Elements.pagefactory.Brokenlinks_page;


public class Brokenlinks_test extends BaseClass{
	
	
  Brokenlinks_page object;
	
	@BeforeClass
	public void open() {
		
		initialization();
		geturl();
		
	}
	
	
	@Test
	public void valid_invalid_test() throws InterruptedException {
		
		  object=new Brokenlinks_page(driver);
		  object.brokenimage();
		
	}
	

}
