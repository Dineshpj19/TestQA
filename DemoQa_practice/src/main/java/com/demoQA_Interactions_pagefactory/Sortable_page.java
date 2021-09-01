package com.demoQA_Interactions_pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Sortable_page extends BaseClass {
	
	Actions act;
	
	public Sortable_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//h5[text()='Interactions']")
	WebElement interact_home;
	

	@FindBy(xpath = "//span[contains(.,'Sortable')]")
	WebElement sort_click;
	
	@FindBy(xpath="(//div[text()='One'])[1]")
	WebElement one;
	
	@FindBy(xpath="(//div[text()='Two'])[1]")
	WebElement two;
	
	@FindBy(xpath="(//div[text()='Three'])[1]")
	WebElement three;
	
	@FindBy(xpath="(//div[text()='Four'])[1]")
	WebElement four;
	
	@FindBy(xpath="(//div[text()='Five'])[1]")
	WebElement five;
	
	@FindBy(xpath="(//div[text()='Six'])[1]")
	WebElement six;
	
	@FindBy(xpath="//div[text()='Six']//following-sibling::div[text()='One']")
	WebElement one_text;
	
	
	
	public void sort() {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", interact_home);
		interact_home.click();
	       
	      
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",sort_click);    
	        sort_click.click();
	        
	       act=new Actions(driver);
	        act.dragAndDrop(one,two).perform();
	        act.dragAndDrop(one,three).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;  
			  js.executeScript("window.scrollBy(0,300)");
	        act.dragAndDrop(one,four).perform();
	        act.dragAndDrop(one,five).perform();
	        act.dragAndDrop(one,six).perform();
		
	}
	
	@FindBy(xpath="//a[@id='demo-tab-grid']")
	WebElement grid;
	
	@FindBy(xpath="(//div[text()='One'])[2]")
	WebElement one1;
	
	@FindBy(xpath="(//div[text()='Three'])[2]")
	WebElement Three1;
	
	public void grid() {
		
		grid.click();
		
		act.dragAndDrop(one1, Three1).perform();
	}

}
