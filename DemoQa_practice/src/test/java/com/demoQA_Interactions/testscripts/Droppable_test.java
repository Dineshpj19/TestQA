package com.demoQA_Interactions.testscripts;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Interactions_pagefactory.Droppable_page;

public class Droppable_test extends BaseClass {
	
	Droppable_page dropobj;
	
	@BeforeClass
	public void open() {
		
		initialization();
		 geturl();
		 
		 dropobj=new Droppable_page(driver);
		
	}
	
	@Test
	public void drop_test() {
		
		String b=dropobj.drop();
		Assert.assertEquals(b,"Dropped!");
		
	}
	

}
