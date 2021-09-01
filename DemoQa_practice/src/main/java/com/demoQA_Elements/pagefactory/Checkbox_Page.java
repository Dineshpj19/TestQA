package com.demoQA_Elements.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox_Page extends BaseClass {
	
	public Checkbox_Page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	 // Xpath for Homepage "Element"
	  
	  @FindBy(xpath = "//h5[text()='Elements']")
	
	    WebElement Homepage_Element;
	
	  // Xpaths For Checkbox Page elements
	  @FindBy(xpath="//span[text()='Check Box']")
	   WebElement check;
	  
	
	 @FindBy(xpath="//button[@title='Toggle']")
	 WebElement toggle;
	 
	 
	 public  void checkbox() {
		 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Homepage_Element);
	        Homepage_Element.click();
	        
	        check.click();
	        toggle.click();
	        
	      
	        
	       
		 
	 }
	 

}
