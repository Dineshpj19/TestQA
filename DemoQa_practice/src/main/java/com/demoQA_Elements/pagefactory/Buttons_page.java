package com.demoQA_Elements.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buttons_page extends BaseClass{
	
	public Buttons_page(WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    	
	 }
	
	// Xpath for Homepage "Element"
	  
		  @FindBy(xpath = "//h5[text()='Elements']")
		    WebElement Homepage_Element;
		  
	// Xpaths for button page elements 
		  
		  @FindBy(xpath="//span[text()='Buttons']")
		  WebElement button;
		  
		  @FindBy(xpath="//button[@id='doubleClickBtn']")
		  WebElement doubleclick;
		  
		  @FindBy(xpath="//button[@id='rightClickBtn']")
		  WebElement rightclick;
		  
		  @FindBy(xpath = "//button[text()='Click Me']")
		  WebElement click;
		  
		  
		  public void button() {
			  
	 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Homepage_Element);
		        Homepage_Element.click();
		        
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",button);
              button.click();
              
              // For Double click
              Actions action = new Actions(driver);
            action.doubleClick(doubleclick).perform();
            
          //  action.moveToElement(doubleclick).doubleClick().perform(); -> Another Way
           
              
              //For Right Click
              
              action.contextClick(rightclick).perform();
              
              
              
              //For Click
//              ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",click);
              click.click();
              
             
			    

	}
	
	
	

}
