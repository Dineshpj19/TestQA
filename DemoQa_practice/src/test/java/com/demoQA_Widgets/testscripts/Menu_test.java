package com.demoQA_Widgets.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Widgets.pagefactory.Menu_page;

public class Menu_test extends BaseClass {
	
	Menu_page menuobj;
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
		menuobj=new Menu_page(driver); 
	}
	
	@Test
	public void menu_test() {
		
		menuobj.menu();
	}

}
