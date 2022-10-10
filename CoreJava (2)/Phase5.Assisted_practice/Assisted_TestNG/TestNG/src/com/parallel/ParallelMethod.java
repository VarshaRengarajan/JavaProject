package com.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelMethod {
	
	
	
	
	
	 @Test    
     public void executSessionThree(){
 	
     //Third session of WebDriver
     System.setProperty("webdriver.chrome.driver", "D:/chrome driver/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
       
     driver.get("http://demo.guru99.com/V4/");
     //find user name text box and fill it
     driver.findElement(By.name("uid")).sendKeys("Driver 3");      
     }        

}
