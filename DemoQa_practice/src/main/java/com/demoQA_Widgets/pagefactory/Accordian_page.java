package com.demoQA_Widgets.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Accordian_page extends BaseClass{
	
	public Accordian_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//h5[text()='Widgets']")
	WebElement widget_home;
	
	@FindBy(xpath="//span[text()='Accordian']")
	WebElement accordian;
	
	@FindBy(xpath="//div[@id='section1Heading']")
	WebElement collapse1;
	
	@FindBy(xpath="//div[@class='collapse show']")
	WebElement collapse1_text;
	
	
	public String widget() {
		

   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", widget_home);
       widget_home.click();
       
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accordian);
       accordian.click(); 
       
      String a=collapse1_text.getAttribute("class");
      System.out.println(a);
      
      return a;
		
}
	
	
	@FindBy(xpath="//div[@id='section2Heading']")
	WebElement collapse2;
	
	@FindBy(xpath="//div[@class='collapse show']")
	WebElement collapse2_text;
	
	public String Widget1() {
		
  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", collapse2);
		 collapse2.click();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;  
		   js.executeScript("window.scrollBy(0,-300)");
		 
		 String c=collapse2_text.getAttribute("class");
		 return c;
		 
	 	
		
	}

}
