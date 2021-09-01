package com.demoQA_Alerts_Frames.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Alerts_Frames.pagefactory.Alerts_page;
import com.demoQA_Alerts_Frames.pagefactory.Browser_windows_page;
import com.demoQA_Elements.pagefactory.BaseClass;

public class Alerts_test extends BaseClass {
	
	Alerts_page alertobj;

	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
			
     alertobj=new Alerts_page(driver);

    }
	
	@Test
	public void alert_test() throws InterruptedException {
		
		alertobj.alert();
	}
	
	
	
}
