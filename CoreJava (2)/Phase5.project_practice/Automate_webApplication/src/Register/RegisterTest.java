package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {

	public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:/chrome driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");	
		
		driver.manage().window().maximize();
		
		System.out.println("Title:"+driver.getTitle());
		
		System.out.println("------------------------");
		
		
		//entering the first name
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Varsha");
		//entering the last name
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Rengarajan");
		//entering the phone number
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("985642789");
		//entering the email id
		WebElement email=driver.findElement(By.id("userName"));
		email.sendKeys("vars@gmail.com");
		
		//entering the address
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("No.4,Jayanagar");
		//entering the city
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chennai");
		//entering the state
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Tamilnadu");
		//entering the postal code
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("600024");
		//selecting the country from dropdown list
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("INDIA");
		
		//entering the username
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("vars@gmail.com");
		
		//entering the password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("var123");
		//re-enter the password
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("var123");
		Thread.sleep(3000);
		//submit
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(6000);
		
		
		//-----------------SIGN IN PAGE--------------------//
		
		driver.get("https://demo.guru99.com/test/newtours/login.php");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("vars@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("var123");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(8000);
		driver.quit();
		System.out.println("Testing done successfully");
		
		
		
		
		

	}

}
