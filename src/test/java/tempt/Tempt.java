package tempt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tempt {
	
	public static void main(String[] args) 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver", "D:\\ALLSOFTWARES\\Automation support\\selenium_and _drivers\\chromedriver103.0.5060.24\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// open Application
		driver.get("http://www.Facebook.com");
		
		// enter username
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sachinrohokale0607@gmail.com");
		
		// enter password
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Pu!W9Ur5fr1Z5@E");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		// Click on Login
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		//Click on Popup / Not Now
		driver.findElement(By.xpath("(//*[text()='Not Now'])[2]")).click();		
		
		// validate Login
		String name=driver.findElement(By.xpath("//*[text()='Sachin Rohokale']")).getTagName();
		String reference="//*[text()='Sachin Rohokale']";
		if(name.equalsIgnoreCase(reference))
		{
			System.out.println("Test Case Sucess");
		}
		else
			
		{
			System.out.println("Test Case Fail");
		}
		
		
	}

}
