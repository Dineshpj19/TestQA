package com.demoQA_Elements.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Textbox_Page extends BaseClass {
	
	  public Textbox_Page(WebDriver driver) {
		    this.driver=driver;
		    PageFactory.initElements(driver, this);
		    	
		 }
	  
	  // Xpath for Homepage "Element"
	  
	  @FindBy(xpath = "//h5[text()='Elements']")
	    WebElement Homepage_Element;
	  
	  // Xpaths for all the elements in the TextBox page
	  
	 @FindBy(xpath="//span[text()='Text Box']")
	    WebElement text_click;
	 
	 @FindBy(xpath="//input[@id='userName']")
	 WebElement username;
	 
	 @FindBy(xpath="//input[@id='userEmail']")
     WebElement email;
	 
	 @FindBy(xpath="//textarea[@id='currentAddress']")
	 WebElement current;
	 
	 @FindBy(xpath="//textarea[@id='permanentAddress']")
	 WebElement permanent;
	 
	 @FindBy(xpath="//button[@id='submit']")
	 WebElement submit;
	 
	 
	 // Method to perform actions on the Textbox page
	  public void textbox() {
		  
   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Homepage_Element);
        Homepage_Element.click();
        
        text_click.click();
        
        username.sendKeys("Dinesh");
        
        email.sendKeys("dinesh@gmail.com");
        
         current.sendKeys("Bangalore,India");
        
         permanent.sendKeys("Palamaner,India");
        
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",submit);
        
         submit.click();
         
         String a=username.getText();
         
        
    }
	  
}
