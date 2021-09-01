package com.demoQA_Elements.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Elements.pagefactory.Dynamic_page;

public class Dynamic_test extends BaseClass {
	
	Dynamic_page object;
		

@BeforeClass
  public void open() {
			
	initialization();
	geturl();
			
  }

@Test
public void dynamic_test() throws InterruptedException {
	
	object=new Dynamic_page(driver);
	object.dynamic();
}


}
