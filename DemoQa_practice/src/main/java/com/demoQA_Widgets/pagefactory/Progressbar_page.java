package com.demoQA_Widgets.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Progressbar_page extends BaseClass {
	
public Progressbar_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}

@FindBy(xpath="//h5[text()='Widgets']")
WebElement widget_home;

@FindBy(xpath="//span[text()='Progress Bar']")
WebElement pro;

@FindBy(xpath="//button[text()='Start']")
WebElement start;

@FindBy(xpath = "(//div[contains(.,'100%')])[8]")
WebElement percent;

public String progresscheck()  {
	
	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", widget_home);
       widget_home.click();
       
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  pro);
        pro.click(); 
        
        start.click();
        
      
        
        String a=percent.getText();
        System.out.println(a);
        return a;
       
}


}
