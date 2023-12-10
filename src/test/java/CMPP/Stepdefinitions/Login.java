package CMPP.Stepdefinitions;

import org.testng.Assert;
import org.testng.annotations.Test;
import CMPP.Util.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import CMPP.Pages.Loginpage;
import CMPP.QA.Factory.DriverFactory;

public class Login {

	private Loginpage objLogin = new Loginpage(DriverFactory.getDriver());
	
	//@Test(priority = 0)
	 @Given("User navigate to login page")	
	public void navigatingtologinpage() throws InterruptedException 
	{
		Thread.sleep(3000);	
		String title = objLogin.checkTitle();
		System.out.println("Page title is: " + title);
		System.out.println("Navigating to login page");
	}
	
	//@Test(priority = 1)
	
	//@Test(priority = 2)
	 @When("User enters invalid username")
	public void loginwithinvalidcred() throws InterruptedException 
	{
		//objLogin = new Loginpage(driver);
		Thread.sleep(7000);
		//objLogin.login("gokulramanan6688@gmail.com", "admin1234");
		//this.clearusername();
		String strUserName = "gokulramanan6688@gmail.com";
		objLogin.setUserName(strUserName);
	}
	 
	 @And("Enter invalid password")
	 public void enteringinvalidpassword()
	 {
		String strPasword = "admin1234";		
		objLogin.clearpassword();
		objLogin.setPassword(strPasword);
				// Click Login button
	 }		
				
	 
	 @And("Clicks login button")
	 public void clickngloginbtn()
	 {
		objLogin.clicklogin();
	 }
	
	//@Test(priority = 3)
	 @Then("User should get invalid credentials validation message")	
	public void loginwithinvalidcredresult() throws InterruptedException
	 {
		// Verify Warning Message
		Thread.sleep(3000);
		String expectedError = objLogin.getErrorMessage();
		Assert.assertTrue(expectedError.contains("Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour."));
		System.out.println(expectedError);
	}	

	 //@Test(priority = 4) 
	@When("User does not enters username")
	public void loginwithemptycred() throws InterruptedException
	{
		System.out.println("1");
		String emptyusername = "";	
		//objLogin.login(emptyusername, emptypassword);
		objLogin.setUserName(emptyusername);
	}
	
	@And("User does not enter password")
	public void enteringemptypassword()
	{
		// Fill password
		String emptypassword = "";
		objLogin.clearpassword();
		objLogin.setPassword(emptypassword);
	}	
		
	@And("Clicks login btn")
	public void clickngloginbutton() throws InterruptedException
		{
		// Click Login button
			objLogin.clicklogin();
		Thread.sleep(3000);
		
		}
	
	//@Test(priority = 5) 
	@Then("User should get proper credentials validation message")
		
	public void loginwithemptycredresult() throws InterruptedException
	{	
		// Verify Warning Message
		String expectedError = objLogin.getErrorMessage();
		Assert.assertTrue(expectedError.contains("Warning: No match for E-Mail Address and/or Password."));
		System.out.println(expectedError);
	}
	
	
	/*
	@Test
	public void loginwithvalidcred() throws InterruptedException
	{
		Thread.sleep(3000);
		objLogin.login("gokulramanan6688@gmail.com", "admin1234");
		Thread.sleep(3000);
		String expectedError = objLogin.getErrorMessage();

		// Verify Warning Message
		Thread.sleep(3000);
		Assert.assertTrue(expectedError.contains("My Account"));
		Thread.sleep(3000);
	}

*/
}
