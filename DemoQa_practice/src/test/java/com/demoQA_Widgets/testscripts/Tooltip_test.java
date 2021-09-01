package com.demoQA_Widgets.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Widgets.pagefactory.Tooltip_page;

public class Tooltip_test extends BaseClass {
	
	Tooltip_page toolobj;
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
		 
		 toolobj=new Tooltip_page(driver);
	}
	
	@Test
	public void tool_test() {
		
		toolobj.tool();
		
	}

}
