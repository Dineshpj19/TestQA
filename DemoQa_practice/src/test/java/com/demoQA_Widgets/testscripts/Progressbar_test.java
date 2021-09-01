package com.demoQA_Widgets.testscripts;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Widgets.pagefactory.Progressbar_page;



public class Progressbar_test extends BaseClass {
	
	Progressbar_page progress;
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
   progress=new Progressbar_page(driver);

 }
	@Test
	public void progress_test()  {
		
		String b=progress.progresscheck();
		Assert.assertEquals(b,"100%");
	}
	
	

}
