package com.demoQA_Elements.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dynamic_page extends BaseClass {
	
	
	
	public Dynamic_page(WebDriver driver) {
		   
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
   }
	
	
	 @FindBy(xpath="//h5[text()='Elements']")
	    WebElement Homepage;
	
	 @FindBy(xpath="//span[text()='Dynamic Properties']")
	 WebElement dynprop;
	
	
	public void dynamic() {
		
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Homepage);
		  
		Homepage.click();
		
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",dynprop);
		  
       dynprop.click();		
        
		
	}
	
	
}
