package com.demoQA_Alerts_Frames.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Frames_page extends BaseClass {
	
public Frames_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

  @FindBy(xpath="//h5[text()='Alerts, Frame & Windows']")
    WebElement alerts_home;
  
  @FindBy(xpath="//span[text()='Frames']")
  WebElement frames;
  
  @FindBy(xpath = "//h1[text()='This is a sample page']")
  WebElement frame1_text;
  

   public void framepage() throws InterruptedException {

   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alerts_home);
		alerts_home.click();
		
		Thread.sleep(4000);
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", frames);
		frames.click();	
    JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,200)");	
		
	   Thread.sleep(1000);
	   driver.switchTo().frame("frame1");
	   Thread.sleep(2000);	 
	   String a=frame1_text.getText();
	 System.out.println(a);
	 
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("frame2");
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", frame1_text);
j.executeScript("window.scrollBy(100,200)");
 String b=frame1_text.getText();
 System.out.println(b);
    
	   
   }

}
