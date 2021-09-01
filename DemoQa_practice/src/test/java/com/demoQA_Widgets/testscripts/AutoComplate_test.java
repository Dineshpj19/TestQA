package com.demoQA_Widgets.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Widgets.pagefactory.AutoComplete_page;

public class AutoComplate_test extends BaseClass {
	
	AutoComplete_page autoobj;
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
  autoobj=new AutoComplete_page(driver);

 }
	
	@Test
	public void auto_test() throws InterruptedException {
		
		autoobj.auto();
		
	}
	
}
