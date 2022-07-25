package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOptions
{
	
	private static ChromeDriver driver1;
	public static ChromeDriver driver= driver1;
	public static void launchBrowser(Object[]inputParameters)
	{	try {
		String key=(String) inputParameters[0];
		String path=(String) inputParameters[1];
		System.setProperty(key,path);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    }catch(Exception e)
		{
	    	System.out.println(e);
		}
	}
	
	public static void openApplication(Object[]inputParameters)
	{	try {
		
		String path=(String)inputParameters[0];
		driver.get(path);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	public static void sendText(Object[]inputParameters)
	{	try {
		
		String path=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		driver.findElement(By.xpath(path)).sendKeys(value);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void clickOnElement(Object[]inputParameters)
	{
		try {
				String path=(String) inputParameters[0];
				driver.findElement(By.xpath(path)).click();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}catch(Exception e)
			{
				System.out.println(e);
			}
	}
	
	public static void validationByGetText(Object[]inputParameters)
	{	try {
		String reference=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		String name=driver.findElement(By.xpath(value)).getText();
		if(reference.equalsIgnoreCase (name))
		{
			System.out.println("Test Case Pass , User Name is : "+name );
		}else
		{
			System.out.println("Test Case Fail");
		}driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}catch(Exception e)
		{
				System.out.println(e);
		}
	}
	
	

	public static void main(String[] args) throws InterruptedException 
	{
		
		// launch browser
		Object[]input1=new Object[2];
		input1[0]="webdriver.chrome.driver";
		input1[1]="D:\\ALLSOFTWARES\\Automation support\\selenium_and _drivers\\chromedriver103.0.5060.24\\chromedriver.exe";
		SeleniumOptions.launchBrowser(input1);
		
	
	
		//Open application
		Object[]input2=new Object[1];
		input2[0]="https://www.Facebook.com";
		SeleniumOptions.openApplication(input2);
		
		//Enter username
		Object[]input3=new Object[2];
		input3[0]="//*[@id='email']";
		input3[1]="sachinrohokale0607@gmail.com";
		SeleniumOptions.sendText(input3);
		
		//Enter Password
		Object[]input4=new Object[2];
		input4[0]="//*[@id='pass']";
		input4[1]="Pu!W9Ur5fr1Z5@E";
		SeleniumOptions.sendText(input4);
		
		//click on Login
		Object[]input5=new Object[1];
		input5[0]="//*[@type='submit']";
		SeleniumOptions.clickOnElement(input5);		
		
		//click on close popup
		Object[]input6=new Object[1];
		input6[0]="(//*[text()='Not Now'])[2]";
		SeleniumOptions.clickOnElement(input6);				
		
		Thread.sleep(5000);
		//validation by Get text method
		Object[]input7=new Object[2];
		input7[0]="Sachin Rohokale";
		input7[1]="//*[text()='Sachin Rohokale']";
		SeleniumOptions.validationByGetText(input7);
		
		
	
	}
}
