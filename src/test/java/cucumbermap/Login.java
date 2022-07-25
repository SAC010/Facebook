package cucumbermap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOptions;

public class Login 
{
	@Given ("^enter key as \"(.*)\" and value as \"(.*)\"$")
	public static void browserLaunch(String key, String path)
	{
		// launch browser
				Object[]input1=new Object[2];
				input1[0]=key;
				input1[1]=path;
				SeleniumOptions.launchBrowser(input1);
		
	}
	@Given ("^enter url as \"(.*)\"$")
	public static void openApplication(String url) 
	{
		Object[]input2=new Object[1];
		input2[0]=url;
		SeleniumOptions.openApplication(input2);
		
	}
	@When("user enter username As {string}")
		public static void enterUserName(String id)
	{
		Object[]input3=new Object[2];
		input3[0]="//*[@id='email']";
		input3[1]=id;
		SeleniumOptions.sendText(input3);

	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String password) 
	{
	
	//Enter Password
			Object[]input4=new Object[2];
			input4[0]="//*[@id='pass']";
			input4[1]=password;
			SeleniumOptions.sendText(input4);
			
    
	}

	@When("user click on login button")
	public void user_click_on_login_button() 
	{
	Object[]input5=new Object[1];
	input5[0]="//*[@type='submit']";
	SeleniumOptions.clickOnElement(input5);		
    
	}	

	@When("user click on popup")
	public void user_click_on_popup() 
	{
	//click on close popup
			Object[]input6=new Object[1];
			input6[0]="(//*[text()='Not Now'])[2]";
			SeleniumOptions.clickOnElement(input6);		
    
	}

	@Then("Application Shows Name of The User As {string}")
	public void application_shows_name_of_the_user_as(String string)
	{
	//validation by Get text method
			Object[]input7=new Object[2];
			input7[0]=string;
			input7[1]="//*[text()='Sachin Rohokale']";
			SeleniumOptions.validationByGetText(input7);
    
	}

		
		
	
}
