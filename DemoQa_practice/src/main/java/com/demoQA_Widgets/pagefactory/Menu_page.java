package com.demoQA_Widgets.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Menu_page extends BaseClass {

	public Menu_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[text()='Widgets']")
	WebElement widget_home;
	
	@FindBy(xpath="//span[text()='Menu']")
	WebElement menu;
	
	@FindBy(xpath="//a[text()='Main Item 2']")
	WebElement menu2;
	
	@FindBy(xpath="//a[text()='SUB SUB LIST »']")
	WebElement menusub;
	
	public void menu() {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", widget_home);
	       widget_home.click();
	       
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menu);
	       menu.click();       
	       
	       Actions act=new Actions(driver);
	       act.moveToElement(menu2).perform();
	       
	       act.moveToElement(menusub).perform();
	}
}
