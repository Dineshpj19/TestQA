package com.demoQA_Widgets.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Slider_page extends BaseClass {

public Slider_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
@FindBy(xpath="//h5[text()='Widgets']")
WebElement widget_home;

@FindBy(xpath="//span[text()='Slider']")
WebElement slide;

@FindBy(xpath="//input[@class='range-slider range-slider--primary']")
WebElement slidemove;

@FindBy(xpath = "(//input[@value='74'])[1]")
WebElement text;

public String slider() {
	
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", widget_home);
     widget_home.click();
     
     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", slide);
     slide.click(); 
     
     Actions act=new Actions(driver);
     act.moveToElement(slidemove).clickAndHold().moveByOffset(100, 0).perform();
    
    String a=text.getAttribute("value");
    System.out.println(a);
    return a;
        
}


	
}
