package com.demoQA_Widgets.testscripts;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA.util.ExcelReader_page;
import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Widgets.pagefactory.Accordian_page;

public class Accordian_test extends BaseClass {
	
	Accordian_page widgetobj;
	ExcelReader_page excelobj;

	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
		 
		 widgetobj=new Accordian_page(driver);
		 excelobj=new ExcelReader_page("C:\\Users\\DPJ\\eclipse-workspace\\DemoQa_practice\\TestData\\testdata.xlsx");
	}
	
	@Test(priority=1)
	public void widget_test() {
		
		String b=widgetobj.widget();
	
		Assert.assertEquals(b,"collapse show");
	
  }
	
	@Test(priority=2)
	public void widget_test1() {
		
		String d=widgetobj.Widget1();
		
		Assert.assertEquals(d,"collapse show");
		
	}
	
	
	
}
