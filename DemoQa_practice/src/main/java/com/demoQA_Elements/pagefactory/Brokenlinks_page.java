package com.demoQA_Elements.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Brokenlinks_page extends BaseClass {
	
	
	   public Brokenlinks_page(WebDriver driver) {
		   
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
   }
	   
	   // Xpaths for Home and Main page
	   
	   @FindBy(xpath = "//h5[text()='Elements']")
	    WebElement Homepage_Element;
	 
	   @FindBy(xpath="//span[text()='Broken Links - Images']")
	   WebElement broken;
	   
	   //XPaths for Valid and Invalid links
	   
	   @FindBy(xpath="//a[text()='Click Here for Valid Link']")
	   WebElement valid;
	   
	   @FindBy(xpath="//a[text()='Click Here for Broken Link']")
	   WebElement Invalid;
	   
	   
	   
	   public void brokenimage() throws InterruptedException {
		   
		   
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Homepage_Element);
	        Homepage_Element.click();
	        
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",broken);
	              broken.click();  
	              
	              
	              
//	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",valid);
//	                valid.click(); 
//	       Thread.sleep(4000);
//	       driver.navigate().back();
//	                
//	                
//	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Invalid);
//	                Invalid.click();                
//		   
	   }
	   
	   
	   
		    
	  }
