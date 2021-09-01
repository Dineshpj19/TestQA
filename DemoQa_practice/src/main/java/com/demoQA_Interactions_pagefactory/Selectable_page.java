package com.demoQA_Interactions_pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Selectable_page extends BaseClass {
	
	public Selectable_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//h5[text()='Interactions']")
	WebElement interact_home;
	
	
	@FindBy(xpath="//span[text()='Selectable']")
	WebElement select_clk;
	
	@FindBy(xpath="//li[text()='Cras justo odio']")
	WebElement sel1;
	
	@FindBy(xpath="//li[text()='Dapibus ac facilisis in']")
	WebElement sel2;
	
	@FindBy(xpath="//li[text()='Morbi leo risus']")
	WebElement sel3;
	
	public void select() {
		
     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", interact_home);
        interact_home.click(); 
	        
	      select_clk.click();  
	       
	       sel1.click();
	       sel2.click();
	       sel3.click();
		
	}
	
	@FindBy(xpath="//a[text()='Grid']")
	WebElement grid;
	
	@FindBy(xpath="//li[text()='One']")
	WebElement one;
	
	@FindBy(xpath="//li[text()='Two']")
	WebElement two;
	
	public void grid() {
		
		grid.click();
		
		one.click();
		two.click();
		
	}

}
