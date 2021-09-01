package com.demoQA_Elements.pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Practiceform_page extends BaseClass {

	public Practiceform_page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Xpath for Homepage "Element"

	@FindBy(xpath = "//h5[text()='Forms']")
	WebElement Homepage_Form;

	@FindBy(xpath = "//span[text()='Practice Form']")
	WebElement practiceform;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastname;

	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement email;

	@FindBy(xpath = "//label[text()='Male']")
	WebElement gender;

	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	WebElement mobile;

	@FindBy(xpath = "//input[@id='dateOfBirthInput']")
	WebElement dob;

	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	WebElement year;

	@FindBy(xpath = "//select[contains(@class,'month-select')]")
	WebElement month;

	@FindBy(xpath = "(//div[text()='4'])[1]")
	WebElement date;
   
	// Xpaths for Subject
	@FindBy(xpath = "//input[@id='subjectsInput']")
	WebElement subject;

	@FindBy(xpath = "(//div[contains(.,'Commerce')])[12]")
	WebElement commerce;
	
	@FindBy(xpath = "(//div[contains(.,'Chemistry')])[12]")
	WebElement chemistry;
	
	@FindBy(xpath = "(//div[contains(.,'Maths')])[12]")
	WebElement maths;

	//Xpaths For hobbies
	@FindBy(xpath="//label[contains(.,'Sports')]")
	WebElement sports;

	@FindBy(xpath = "//label[contains(.,'Reading')]")
	WebElement reading;
	
	//Xpath for Upload
	
	@FindBy(xpath="//input[@id='uploadPicture']")
	WebElement upload;
	
	//Xpath for Current Address
	
	@FindBy(xpath="//textarea[@placeholder='Current Address']")
	WebElement current;
	
	// Xpath for State and city
	
	@FindBy(xpath="//div[text()='Select State']")
	WebElement state;
	
	@FindBy(xpath = "(//div[contains(.,'NCR')])[12]")
	WebElement ncr;
	
	@FindBy(xpath="//div[text()='Select City']")
	WebElement city;
	
	@FindBy(xpath = "(//div[contains(.,'Delhi')])[12]")
	WebElement delhi;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement submit;
	
	@FindBy(xpath="//button[@id='closeLargeModal']")
	WebElement close;

	public void practice() throws InterruptedException {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Homepage_Form);
		Homepage_Form.click();

		practiceform.click();

		firstname.sendKeys("Dinesh");

		lastname.sendKeys("Kumar");

		email.sendKeys("dinesh@gmail.com");

		gender.click();

		mobile.sendKeys("7893035383");

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dob);
		dob.click();

		Select sel = new Select(year);
		sel.selectByValue("2001");

		Select sel1 = new Select(month);
		sel1.selectByIndex(5);

		date.click();

//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", subject);
		subject.click();

//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", subject);
		subject.sendKeys("comm");

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", commerce);
		commerce.click();
		
		subject.sendKeys("chemi");
		chemistry.click();
		
		subject.sendKeys("mat");
		maths.click();
		

          JavascriptExecutor js = (JavascriptExecutor) driver;  
		   js.executeScript("window.scrollBy(0,200)");
	        
	        sports.click();
           reading.click();
           
          upload.sendKeys("C:\\Users\\DPJ\\Downloads\\sampleFile (1).jpeg"); 
          
          current.sendKeys("Bangalore, India");
          
   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", state);
          
          state.click();
          ncr.click();
          
          city.click();
          delhi.click();
          
          submit.click();
          Thread.sleep(4000);
          
          ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", close);
           close.click();  // Close is not clicking because of advertisement is blocking. How to close the ads
	        

	}
}
