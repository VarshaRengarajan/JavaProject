package WebPageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebpage {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","D:/chrome driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		 // Step 2: open the url/website
	    driver.get("https://www.gmail.com/");
	    
	    
	    // Step 3: make full screen of window
	    driver.manage().window().maximize(); // this enables the browser to maximize its width and height
	    Thread.sleep(6000); 
	    
	    //locate using ID
	    driver.findElement(By.id("identifierId")).sendKeys("varsha@gmail.com");
	    
	    //locate using class name
	    driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	    
	    
	    


	}

}
