package com.demoQA_Interactions.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Interactions_pagefactory.Sortable_page;
import com.demoQA_Widgets.pagefactory.Menu_page;

public class Sortable_test extends BaseClass {
	
	Sortable_page sortobj;
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
		sortobj=new Sortable_page(driver); 
	}
	
	@Test(priority=1)
	public void sort_test() {
		
		sortobj.sort();
		
	}
	
	@Test(priority=2)
	public void grid_test() {
		
		sortobj.grid();
	}

}
