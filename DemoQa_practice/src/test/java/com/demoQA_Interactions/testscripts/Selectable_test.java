package com.demoQA_Interactions.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Interactions_pagefactory.Selectable_page;


public class Selectable_test extends BaseClass {
	
	Selectable_page selobj;
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
		selobj=new Selectable_page(driver); 
	}
	
	@Test(priority=1)
	public void sel_test() {
		
		selobj.select();
		
	}
	
	@Test(priority=2)
	public void grid_test() {
		
		selobj.grid();
	}
	

}
