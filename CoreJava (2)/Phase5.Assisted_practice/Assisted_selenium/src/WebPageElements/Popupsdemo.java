package WebPageElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupsdemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:/chrome driver/chromedriver_win32/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();	
		
        // Alert Message handling                   		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		
        Thread.sleep(5000);
        driver.findElement(By.name("cusid")).sendKeys("5485");			
        Thread.sleep(5000);
        driver.findElement(By.name("submit")).submit();			
        Thread.sleep(3000);
        
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        
        Thread.sleep(3000);
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();		
    }	

}

	