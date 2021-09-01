package com.demoQA_Interactions_pagefactory;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Resizable_page extends BaseClass {
	
	public Resizable_page(WebDriver drive) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//h5[text()='Interactions']")
	WebElement interact_home;
	
	@FindBy(xpath="//span[text()='Resizable']")
	WebElement resize;
	
	@FindBy(xpath="//div[@id='resizableBoxWithRestriction']")
	WebElement box1;
	
	
	public void resize() {
		
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", interact_home);
        interact_home.click();
       
        resize.click();
        
       
        
       // driver.manage().window().setSize(new Dimension(300,500));
        
       int a= driver.getWindowHandle().length();
       System.out.println(a);
        
		
	}
	

}
