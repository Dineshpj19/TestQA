package com.demoQA_Alerts_Frames.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Alerts_page extends BaseClass {
	
	public Alerts_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//h5[text()='Alerts, Frame & Windows']")
	WebElement alerts_home;
	
	@FindBy(xpath="//span[text()='Alerts']")
	WebElement alert_frame;
	
	@FindBy(xpath="//button[@id='alertButton']")
	WebElement click;
	
	@FindBy(xpath="//button[@id='timerAlertButton']")
	WebElement click1;
	
	@FindBy(xpath="//button[@id='confirmButton']")
	WebElement click2;
	
	@FindBy(xpath="//button[@id='promtButton']")
	WebElement click3;
	
	public void alert() throws InterruptedException {
		
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alerts_home);
		alerts_home.click();
		
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alert_frame);
	     alert_frame.click();
	     
	     click.click();
	     driver.switchTo().alert().accept();
	    
	     
	     click1.click();
	    
	     
//	     WebDriverWait wait=new WebDriverWait(driver,5);
//	     
//	     // Wait till the element is not visible
//	   
//	  WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='timerAlertButton']")));
//	    
	      Thread.sleep(5000);
	      driver.switchTo().alert().accept();
	      
	      
	      
	      click2.click();
	      driver.switchTo().alert().dismiss();
	      
	      
	      click3.click();
	      driver.switchTo().alert().sendKeys("Dinesh");
	      driver.switchTo().alert().accept();
	      
	      
	     
	     
	     
	     
		
	}
	
	

}
