package com.demoQA_Widgets.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class AutoComplete_page extends BaseClass {
	
public AutoComplete_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}

@FindBy(xpath="//h5[text()='Widgets']")
WebElement widget_home;

@FindBy(xpath="//span[text()='Auto Complete']")
WebElement autocomplete;

@FindBy(xpath = "//input[@id='autoCompleteMultipleInput']")
WebElement multiplecolor;

@FindBy(xpath = "//div[@id='react-select-7-option-0']")
WebElement red;


public void auto() throws InterruptedException {
	
	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", widget_home);
       widget_home.click();
       
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", autocomplete);
       autocomplete.click();
       
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", multiplecolor);
        multiplecolor.click();
       
       JavascriptExecutor js = (JavascriptExecutor) driver;  
	   js.executeScript("window.scrollBy(0,-300)");
	   
      Thread.sleep(4000);
      
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", multiplecolor);
        multiplecolor.sendKeys("Red");
        
//       red.click();
//	
}

  

}
