package WebPageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateWebpage2 {
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","D:/chrome driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pendrive");
	    Thread.sleep(4000);
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.linkText("Kingston")).click();
	    Thread.sleep(6000);
	    
	    driver.findElement(By.partialLinkText("Kingston DataTraveler Swivl 32GB USB 3.0 Pen Drive (DTSWIVL/32GBIN, Black)")).click();
	    Thread.sleep(6000);
	    driver.close();
	    
	    driver.navigate().to("https://login.yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#login-username")).sendKeys("abc@yahoo.com");	
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#login-signin")).click();

	    
	    
	    
	    
		


}}
