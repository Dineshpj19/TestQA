package com.demoQA_Alerts_Frames.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Alerts_Frames.pagefactory.Alerts_page;
import com.demoQA_Alerts_Frames.pagefactory.Frames_page;
import com.demoQA_Elements.pagefactory.BaseClass;

public class Frames_test extends BaseClass{
	
	Frames_page framesobj;
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
			
     framesobj=new Frames_page(driver);

    }
	
	@Test
	public void frametest() throws InterruptedException {
		
		framesobj.framepage();
		
		
	}

}
