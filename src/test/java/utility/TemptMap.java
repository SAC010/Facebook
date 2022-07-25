package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TemptMap 
{	 static ChromeDriver driver=null;
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ALLSOFTWARES\\Automation support\\selenium_and _drivers\\chromedriver103.0.5060.24\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void openApplication()
	{
		driver.get("http://www.Facebook.com");
	}
	
	public static void enterUserName()
	{
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sachinrohokale0607@gmail.com");
	}
	
	public static void enterPassword()
	{
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Pu!W9Ur5fr1Z5@E");
	}
	
	public static void clickOnLogin()
	{
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
	
	public static void closePopup() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Not Now'])[2]")).click();	
		
	}
	
	public static void validationByGetText()
	{
		String name=driver.findElement(By.xpath("//*[text()='Sachin Rohokale']")).getText();
		String reference="//*[text()='Sachin Rohokale']";
		
		if(reference.equalsIgnoreCase (name))
		{
			System.out.println("Test Case Pass");
		}else
		{
			System.out.println("Test Case Fail");
		}
	}
	
	
	public static void main(String[] args) 
	{
		TemptMap.launchBrowser();
		TemptMap.openApplication();
		
		
		
	}
}
