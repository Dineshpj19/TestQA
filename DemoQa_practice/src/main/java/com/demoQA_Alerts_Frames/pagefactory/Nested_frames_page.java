package com.demoQA_Alerts_Frames.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.demoQA_Elements.pagefactory.BaseClass;

public class Nested_frames_page extends BaseClass {
	
	public Nested_frames_page(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

}
