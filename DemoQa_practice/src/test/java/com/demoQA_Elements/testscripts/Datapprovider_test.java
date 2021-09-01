package com.demoQA_Elements.testscripts;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoQA_Elements.pagefactory.BaseClass;
import com.demoQA_Elements.pagefactory.Brokenlinks_page;

public class Datapprovider_test extends BaseClass {
	
   Brokenlinks_page object;
	
	@BeforeClass
	public void open() throws InterruptedException {
		
		initialization();
		geturl();
	object=new Brokenlinks_page(driver);
		object.brokenimage();
		
	}
	
	@Test
	public void test() {
	List<WebElement> links = driver.findElements(By.tagName("a"));

    System.out.println("No of links are "+ links.size());  
  
    //checking the links fetched.
    for(int i=0;i<links.size();i++)
    {
        WebElement E1= links.get(i);
        String url= E1.getAttribute("href");
        verifyLinks(url);
    }
    
    driver.quit();
}

public static void verifyLinks(String linkUrl)
{
    try
    {
        URL url = new URL(linkUrl);

        //Now we will be creating url connection and getting the response code
        HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
        httpURLConnect.setConnectTimeout(5000);
        httpURLConnect.connect();
        if(httpURLConnect.getResponseCode()>=400)
        {
        	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
        }    
        
        //Fetching and Printing the response code obtained
        else{
            System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
        }
    }catch (Exception e) {
  }
}
	
	
	
//	@DataProvider (name = "user")
//	 public Object[][] userdata(){
//	 return new Object[][] {{"username","Password"}, {"username1","Password1"}};
//	 }
//	
//	
//	@Test(dataProvider="user")
//	public void test(String A, String B) {
//		
//		System.out.println(A + B);
//}
     //@Test
     public void image() {
    	 
    	   List<WebElement> images = driver.findElements(By.tagName("img"));
           System.out.println("Total number of Images on the Page are " + images.size());
           
           
           //checking the links fetched.
           for(int index=0;index<images.size();index++)
           {
               WebElement image= images.get(index);
               String imageURL= image.getAttribute("src");
               System.out.println("URL of Image " + (index+1) + " is: " + imageURL);
               verifyLinks(imageURL);
               
               //Validate image display using JavaScript executor
               try {
                   boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
                   if (imageDisplayed) {
                       System.out.println("DISPLAY - OK");
                   }else {
                        System.out.println("DISPLAY - BROKEN");
                   }
               } 
               catch (Exception e) {
               	System.out.println("Error Occured");
               }
           }
     }
}
    	 
     
     
     
     
		
	


