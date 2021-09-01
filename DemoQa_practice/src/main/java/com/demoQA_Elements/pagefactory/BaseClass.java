package com.demoQA_Elements.pagefactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;


import com.demoQA.util.Util;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	
	 Properties prop; // Here Properties is a pre-defined class in java to call the config properties file, prop is the ref object.
	 
	 // Constructor for Reading config properties file 
	 public BaseClass() {
		 
	   try {
			 
			 prop=new Properties();
			 
			String path=System.getProperty("user.dir");
			 
			 // FileInputStream is the pre-defined class
			FileInputStream ip=new FileInputStream(path+"\\src\\main\\java\\com\\demoQA\\config\\Config.Properties");
			 prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 
		 
	 }
	 
	 // Method for Launching the browser
	 public void initialization() {
			
		    if(prop.getProperty("browser").equals("chrome")) {
		    	
		    	WebDriverManager.chromedriver().setup();
				
				 driver=new ChromeDriver();
				
		    } else if(prop.getProperty("browser").equals("firefox")) {
		    	
		    	WebDriverManager.firefoxdriver().setup();
				
				 driver=new FirefoxDriver();
				 
		    } else if(prop.getProperty("browser").equals("edge")) {
		    	WebDriverManager.edgedriver().setup();
				
				 driver=new EdgeDriver();
		    	
		    }
			
	 }
	 
	   // Method to launch the URL from the config properties file
	    public void geturl() {
	    	
	    	 driver.get(prop.getProperty("url"));
	    	 
	    	 String title=driver.getTitle();
	    	 
	    	 System.out.println(title);
	 		
			 driver.manage().window().maximize();
			 
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
			 driver.manage().deleteAllCookies();
	    	
	    	
	    }
	    
	    public static void getSysInfo() {
	    	
	    	extent=new ExtentReports(System.getProperty("user.dir")+"/Reports/DemoQAReports.html",true);
	    	extent.addSystemInfo("Host Name", "DemoQA");
	    	extent.addSystemInfo("User Name", "Dinesh");
	    	extent.addSystemInfo("Environment", "QA");
	    	}
	    	
	    	public static void failedTestsScreenshots(String testMethodName) {
	    		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    		try {
	    		FileHandler.copy(scrFile,new File(System.getProperty("user.dir")+"/Screenshots/"+testMethodName+"_"+".jpg"));
	    		}catch(IOException e) {
	    			e.printStackTrace();
	    		}
	    	}
	    	
	    	public static String getScreenshot(WebDriver driver,String screenshotName) throws IOException {
	    		String dateName=new SimpleDateFormat("yyyyMMdd_hh mm ss").format(new Date());
	    		TakesScreenshot ts=(TakesScreenshot)driver;
	    		File source=ts.getScreenshotAs(OutputType.FILE);
	    		String destination=System.getProperty("user.dir")+"/Screenshots/"+screenshotName+"_" + dateName+".jpg";
	    		File finalDestination=new File(destination);
	    		FileHandler.copy(source, finalDestination);
	    		return destination;
	    	}
	    	
	    	public static void testStart(ITestResult result) {
	    		extentTest=extent.startTest(result.getMethod().getMethodName());
	    	}
	    	
	    	
	    	public static void getTestStatus(ITestResult result) throws IOException {
	    		if(result.getStatus()==ITestResult.SUCCESS) {
	    			extentTest.log(LogStatus.PASS, "TEST CASE PASSED IS : "+result.getName());
	    		}
	    		else if(result.getStatus()==ITestResult.FAILURE) {
	    			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS : "+result.getName());
	    			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED BECAUSE OF : "+result.getThrowable());
	    			
	    			String screenshotPath=BaseClass.getScreenshot(driver, result.getName());
	    			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));
	    		}
	    		else if(result.getStatus()==ITestResult.SKIP) {
	    			extentTest.log(LogStatus.SKIP, "TEST CASE SKIPPED IS : "+result.getName());
	    		}
	    		extent.endTest(extentTest);
	    	}
	    	
	    	public static void endReport() {
	    		extent.flush();
	    		extent.close();
	    	}

	    
	   
	    
	   

}
