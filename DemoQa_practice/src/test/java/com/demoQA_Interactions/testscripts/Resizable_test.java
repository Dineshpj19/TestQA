package com.demoQA_Interactions.testscripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Interactions_pagefactory.Resizable_page;

public class Resizable_test extends BaseClass {
	
	Resizable_page reobj;
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
		
	}
	
	@Test
	public void resize_test() {
		
	reobj=new Resizable_page(driver);
	
	reobj.resize();
		
		
	}

}
