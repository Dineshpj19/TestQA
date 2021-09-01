package com.demoQA_Elements.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Links_page extends BaseClass {
	
	    public Links_page(WebDriver driver) {
	    	
	    	this.driver=driver;
	    	PageFactory.initElements(driver,this);
	    	
	    }
	    
	    
	   // XPATHS for WebElements
	    
	    @FindBy(xpath = "//h5[text()='Elements']")
	    WebElement Homepage_Element;
	    
	    public void main() {
	    
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Homepage_Element);
		    Homepage_Element.click();
	    	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",link);	
	         link.click();
	    
}
	    
	    // XPath for new tab
	    
	    @FindBy(xpath="//span[text()='Links']")
	    WebElement link;
	    
	    @FindBy(xpath="//a[@id='simpleLink']")
	    WebElement home;
	    
	    @FindBy(xpath="//a[@id='dynamicLink']")
	    WebElement home1;
	    
	  
	    
	  public void links() {
//	    	 
//	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Homepage_Element);
//	 		    Homepage_Element.click();
//	 	    	
//	 	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",link);	
//	 	         link.click();
	 	    	
	    	
	    System.out.println(home.getText()); 
	         home.click();
	         
	       System.out.println(home1.getText()); // Check this with Mahesh anna
	         home1.click();
	         
	        
   }
	    
	     
	   //Xpath for Api call
		    
		    @FindBy(xpath="//a[@id='created']")
		    WebElement api1;
		    
		    @FindBy(xpath="//a[@id='no-content']")
		    WebElement api2;
		    
		    @FindBy(xpath="//a[@id='moved']")
		    WebElement api3;
		    
		    @FindBy(xpath="//a[@id='bad-request']")
		    WebElement api4;
		    
		    @FindBy(xpath="//a[@id='unauthorized']")
		    WebElement api5;
		    
		    @FindBy(xpath="//a[@id='forbidden']")
		    WebElement api6;
	    
		     
		    @FindBy(xpath="//a[@id='invalid-url']")
		    WebElement api7;
		    
		    
		    @FindBy(xpath="//p[@id='linkResponse']")
		    WebElement result;
	    
	    public void api() throws InterruptedException {
	    
	    	Thread.sleep(4000);
	    System.out.println(api1.getText());
	    	api1.click();
	    	result.isDisplayed();
	    	
	    	
	    	
	   System.out.println(api2.getText());
	     api2.click();
	     
	     JavascriptExecutor js = (JavascriptExecutor) driver;  
		   js.executeScript("window.scrollBy(0,500)");
	     
	   System.out.println(api3.getText());
	     api3.click(); // How to check the content of api3
	  
	     System.out.println(api4.getText());
	     api4.click(); 
	     
	     
		   
		  System.out.println(api5.getText());
		     api5.click();  
		   
		  System.out.println(api6.getText());
		     api6.click();
		    
		  System.out.println(api7.getText());
		     api7.click();   
		     
		     
	     
	     
	   }

	    }

