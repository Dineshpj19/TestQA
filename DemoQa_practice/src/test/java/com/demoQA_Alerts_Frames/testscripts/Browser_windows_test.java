package com.demoQA_Alerts_Frames.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Alerts_Frames.pagefactory.Browser_windows_page;
import com.demoQA_Elements.pagefactory.BaseClass;

public class Browser_windows_test extends BaseClass  {

	Browser_windows_page browserwindow;
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
			
   browserwindow=new Browser_windows_page(driver);
			
		
	}
	// To open new tab
	@Test
	public void windowtest() throws InterruptedException {
	
		browserwindow.newtab();
		
	}
	
	
}
