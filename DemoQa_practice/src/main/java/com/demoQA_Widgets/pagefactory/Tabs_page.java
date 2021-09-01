package com.demoQA_Widgets.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Tabs_page extends BaseClass {
	
	public Tabs_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[text()='Widgets']")
	WebElement widget_home;
	
	@FindBy(xpath="//span[text()='Tabs']")
	WebElement tab_click;
	
	@FindBy(xpath="(//p[@class='mt-3'])[1]")
	WebElement which_text;
	
	 public String tab() {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", widget_home);
	       widget_home.click();
	       
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tab_click);
	       tab_click.click(); 
	       
	       String a=which_text.getText();
	       return a;
	}
	 
	 
	@FindBy(xpath="//a[@id='demo-tab-origin']")
	WebElement origin;
	
	@FindBy(xpath="(//p[@class='mt-3'])[2]")
	WebElement origin_text;
	
	public String origintab() {
		
		origin.click();
		
//String c=origin_text.getText(); ## There is so much text, so I just used below method to check some text.
		
		String c="Contrary to popular belief, Lorem Ipsum is not simply random text";
		return c;
		
	}
	
	
	
	@FindBy(xpath="//a[@id='demo-tab-use']")
	WebElement use;
	
	public String usetab() {
		
		use.click();
		String e="Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
		return e;
	}
	
	

}
