package com.demoQA_Widgets.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Tooltip_page extends BaseClass {
	
	public Tooltip_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[text()='Widgets']")
	WebElement widget_home;
	
	@FindBy(xpath="//span[text()='Tool Tips']")
	WebElement tool;
	
	@FindBy(xpath="//button[@id='toolTipButton']")
	WebElement tip1;
	
	@FindBy(xpath="//input[@id='toolTipTextField']")
	WebElement tip2;
	
	public void tool() {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", widget_home);
	       widget_home.click();
	       
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tool);
	       tool.click();
	       
	       Actions act=new Actions(driver); 
	       act.moveToElement(tip1).perform();
	       act.moveToElement(tip2).perform();
	       
	}

}
