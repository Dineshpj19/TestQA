package com.demoQA_Elements.testscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Elements.pagefactory.Upload_download_page;

public class Upload_download_test extends BaseClass {
	
	
	@BeforeTest
	public void open() {
		initialization();
		geturl();
		
	}
	
	@Test
	public void download() {
		
		Upload_download_page object=new Upload_download_page(driver);
		
		 object.download();
	}

}
