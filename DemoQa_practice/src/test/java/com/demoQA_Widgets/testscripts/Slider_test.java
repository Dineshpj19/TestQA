package com.demoQA_Widgets.testscripts;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Widgets.pagefactory.AutoComplete_page;
import com.demoQA_Widgets.pagefactory.Slider_page;

public class Slider_test extends BaseClass {
	
	Slider_page slider;
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
  slider=new Slider_page(driver);

 }
	
	@Test
	public void slide_test() {
		
		String d=slider.slider();
		Assert.assertEquals(d, "74");
		
		
	}

}
