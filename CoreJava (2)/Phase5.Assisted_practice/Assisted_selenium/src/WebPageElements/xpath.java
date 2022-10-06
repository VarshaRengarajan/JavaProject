package WebPageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:/chrome driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://accounts.lambdatest.com/register");
        //Relative xpath for organization field
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("999999999");
        //Relative xpath for full name field
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sadhvi Singh");
        Thread.sleep(7000);
        driver.close();
      

	}

}
