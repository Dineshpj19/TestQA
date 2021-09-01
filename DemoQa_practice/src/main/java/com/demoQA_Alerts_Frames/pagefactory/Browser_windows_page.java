package com.demoQA_Alerts_Frames.pagefactory;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Browser_windows_page extends BaseClass {
	
	public Browser_windows_page(WebDriver driver) {

		
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	@FindBy(xpath="//h5[text()='Alerts, Frame & Windows']")
	WebElement alerts_home;
	
	@FindBy(xpath="//span[text()='Browser Windows']")
	WebElement browser_window;
	
	// For Tab
	@FindBy(xpath="//button[@id='tabButton']")
	WebElement newtab;
	
	@FindBy(xpath="//h1[@id='sampleHeading']")
	WebElement newtab_text;
	
	// For window
	@FindBy(xpath="//button[@id='windowButton']")
	WebElement newwindow;
	
	@FindBy(xpath = "//h1[@id='sampleHeading']")
	WebElement newwindow_test;
	
	//New Winodow Message
	
	@FindBy(xpath = "//button[@id='messageWindowButton']")
	WebElement newmessage;
	
	public void newtab() throws InterruptedException {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alerts_home);
		alerts_home.click();
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", browser_window);
		browser_window.click();
		
		// Newtab
		
		 newtab.click();		 
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String a=newtab_text.getText();
		System.out.println("New Tab page :" +a);
		driver.switchTo().window(tabs.get(0));
		
		
		// NewWindow
    	newwindow.click();
    ArrayList<String> tabs1=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs1.get(2));
	driver.manage().window().maximize();
	String b=newwindow_test.getText();
	System.out.println("New Window page :" +b);
	driver.switchTo().window(tabs.get(0));
		

		
		// New WindowMessage
        
	   newmessage.click();
	   ArrayList<String> tabs3=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(3));
		driver.manage().window().maximize();
		driver.switchTo().window(tabs.get(0));
		
		
		
		
	}
	
	

}
