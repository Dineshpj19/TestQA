package com.demoQA_Elements.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radiobutton_page extends BaseClass{
	
public Radiobutton_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

//Xpath for Homepage "Element"

	  @FindBy(xpath = "//h5[text()='Elements']")
	    WebElement Homepage_Element;
	  
	  @FindBy(xpath="//span[text()='Radio Button']")
	  WebElement radio;
	  
	  @FindBy(xpath="//label[text()='Yes']")
	  WebElement yes;
	  
	  @FindBy(xpath="//label[text()='Impressive']")
	  WebElement impressive;
	  
	  @FindBy(xpath="//label[text()='No']")
	  WebElement no;
	

   

    public void button() throws InterruptedException {
    	
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Homepage_Element);
        Homepage_Element.click();
        
        radio.click();
        
        yes.click();
        Thread.sleep(4000);
        
        impressive.click();
    	Thread.sleep(4000);
    	
    	no.click();    //this should not be clickable
    	
    	
    	
    }


}
