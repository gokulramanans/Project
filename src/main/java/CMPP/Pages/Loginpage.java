package CMPP.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseTest{
	
	//WebDriver driver;
	//private By usernameInput = By.name("userName");
	private By userName = By.xpath("//input[@id='input-email']");
	private By password = By.xpath("//input[@id='input-password']");
	private By loginbutton = By.xpath("//input[@value='Login']");
	private By warningmessage = By.xpath("//*[@id='account-login']/div[1]");
	private By MyAccountTitle = By.xpath("//h2[contains(text(),'My Account')]");
	
	//@FindBy(name = "email")
	//WebElement userName;

	//@FindBy(name = "password")
	//WebElement password;

	//@FindBy(xpath = "//input[@value='Login']")
	//WebElement loginbutton;
	
	//@FindBy(xpath = "//*[@id=\"account-login\"]/div[1]")
	//WebElement warningmessage;
	
	//@FindBy(xpath = "//h2[contains(text(),'My Account')]")
	//WebElement MyAccountTitle;
	
	public Loginpage(WebDriver driver) 
		{
			//this.driver = driver;
	
			// This initElements method will create all WebElements
			//PageFactory.initElements(driver, this);
		super(driver);
		}

	public String checkTitle() throws InterruptedException
	{
		ninjaLogin();
		return driver.getTitle();
	}
	
	// Set user name in textbox
	public void setUserName(String strUserName) 
		{
			//userName.sendKeys(strUserName);
			driver.findElement(userName).sendKeys(strUserName);
		}

	// Set password in password textbox
	public void setPassword(String strPassword)
		{
			//password.sendKeys(strPassword);
		driver.findElement(password).sendKeys(strPassword);
		}

	// Click on login button
		
	public void clearusername()
	{
		//userName.clear();
		driver.findElement(userName).clear();
	}
		
	public void clearpassword()
	{
		//password.clear();
		driver.findElement(password).clear();
	}
	
	public void clicklogin()
	{
		//loginbutton.click();
		driver.findElement(loginbutton).click();
	
	}
	
	// Get the errorMessage
	public String getErrorMessage() 
		{
			//return warningmessage.getAttribute("innerText");
			return driver.findElement(warningmessage).getAttribute("innerText");
			
		}
	
	
	// Get MyAccount Text
		public String getMyAccount() 
			{
				//return MyAccountTitle.getAttribute("innerText");
				return driver.findElement(MyAccountTitle).getAttribute("innerText");
			}
		
/*
	public  Login login(String strUserName, String strPasword) {

		// Fill user name
		System.out.println("login with: " + strUserName + " and " + strPasword);
		//this.clearusername();
		//this.setUserName(strUserName);
		// Fill password
		//this.clearpassword();
		//this.setPassword(strPasword);
		// Click Login button
		//this.clickLogin();
		driver.findElement(userName).clear();
		driver.findElement(userName).sendKeys(strUserName);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(strPasword);
		driver.findElement(loginbutton).click();
		return new Login(driver);
	}
*/	
}
