package com.demoQA_Elements.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Upload_download_page extends BaseClass {
	
	public Upload_download_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Xpaths for Home and main elements of page
	 @FindBy(xpath = "//h5[contains(.,'Elements')]")
	    WebElement Homepage_Element;
	 
	 @FindBy(xpath="//span[text()='Upload and Download']")
	 WebElement upandDown;
	 
	 // Xpaths for Upload and Download buttons
	 @FindBy(xpath="//a[text()='Download']")
	 WebElement download;
	 
	 @FindBy(xpath="//input[@id='uploadFile']")
	 WebElement upload;
	 
	 
	 public void download() {
		 
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Homepage_Element);
		Homepage_Element.click();
		
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",upandDown);
         upandDown.click();
         
         download.click();
		 System.out.println(download.getText());
		 
		 upload.sendKeys("C:\\Users\\DPJ\\Downloads\\sampleFile (2).jpeg ");
		 System.out.println(upload.getText());
         
		
	 }
	

}
