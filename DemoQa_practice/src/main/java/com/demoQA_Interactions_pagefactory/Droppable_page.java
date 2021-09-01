package com.demoQA_Interactions_pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Droppable_page extends BaseClass {
	
public Droppable_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

@FindBy(xpath="//h5[text()='Interactions']")
WebElement interact_home;

@FindBy(xpath="//span[text()='Droppable']")
WebElement drop;

@FindBy(xpath="//div[text()='Drag me']")
WebElement dragelement;

@FindBy(xpath="(//div[@id='droppable'])[1]")
WebElement droploc;

@FindBy(xpath="(//p[text()='Dropped!'])")
WebElement drop_text;

public String drop() {
	
	
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", interact_home);
    interact_home.click();
    
      drop.click();
      
      Actions act=new Actions(driver);
      act.dragAndDrop(dragelement, droploc).perform();
      
      String a=drop_text.getText();
      return a;
    
    
}

}
