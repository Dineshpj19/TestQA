package com.demoQA_Elements.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTables_page extends BaseClass {
	
	public WebTables_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	// Xpath for Homepage "Element"
	  
		  @FindBy(xpath = "//h5[text()='Elements']")
		    WebElement Homepage_Element;
		  
	//Xpaths for WebTable page
		  
		  @FindBy(xpath="//span[text()='Web Tables']")
		  WebElement web;
		  
	//Xpaths For Add table method
		 
		  @FindBy(xpath="//button[@class='btn btn-primary']")
		  WebElement add;
		  
		  @FindBy(xpath="//input[@placeholder='First Name']")
		  WebElement firstname;
	
	      @FindBy(xpath="//input[@maxlength='25' and @placeholder='Last Name' ]")
	      WebElement lastname;
	      
	      @FindBy(xpath="//input[@id='userEmail' or @placeholder='name@example.com' ]")
	      WebElement email;
	      
	      @FindBy(xpath="//input[contains(@id,'ag') ]")
	      WebElement age;
	      
	      @FindBy(xpath="//input[contains(@placeholder,'Sala') ]")
	      WebElement salary;
	      
	      @FindBy(xpath="//input[starts-with(@id,'depar') ]")
	      WebElement department;
	
	      @FindBy(xpath="//button[@id='submit' ]")
	      WebElement submit;
	     
	      
	      
	// Method for adding the WebTable
	public void table_add() throws InterruptedException {
		
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Homepage_Element);
		   Homepage_Element.click();
		   
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",web);
            web.click();
		
		    
            add.click();
            firstname.sendKeys("Mahesh");
            lastname.sendKeys("Babu");
            email.sendKeys("Mahesh@gmail.com");
            age.sendKeys("30");
            salary.sendKeys("50000");
            department.sendKeys("Software");
            
            Thread.sleep(4000);
            submit.click();
            Thread.sleep(4000);
            
     }
	
/* ############################################################ */
	 
    //Xpaths for Search field
    
    @FindBy(xpath="//input[@id='searchBox' ]")
    WebElement search_field;
	
	
	// Method to Search the table
	public void search() throws InterruptedException {
		
		
		 search_field.click();
		 
		 search_field.sendKeys("Cie");
		 
		 Thread.sleep(8000);
		 
	}
	
/* ################################################## */
	
	//Xpaths for Edit and Delete
	
	
	@FindBy(xpath="//span[@class='mr-2' and @id='edit-record-1']")
	WebElement edit1;
	
	@FindBy(xpath="//input[@id='age']")
	WebElement re_age;
	
	public void edit() {
		
		edit1.click();
		
		re_age.clear();
		re_age.sendKeys("40");
		submit.click();
		
		
	}
 /* ###################################################### */
	
	 @FindBy(xpath="//span[@id='delete-record-1']")
	 WebElement delete;
	 
	 public void Delete() {
		 
		 delete.click();
		 
	 }

}
