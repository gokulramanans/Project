package CMPP.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;

public class BaseTest {
	protected WebDriver driver;

	public BaseTest(WebDriver driver) {
		this.driver = driver;
	}

	public void ninjaLogin() throws InterruptedException {
		// Replace the URL with the actual URL of Mercury Tours site
		//String mercuryToursURL = "https://demo.guru99.com/test/newtours/index.php";
		String ninjaURL = "https://tutorialsninja.com/demo/index.php?route=account/login";
		driver.get(ninjaURL);
		Thread.sleep(5000);
	}

}

	/*
	public static WebDriver driver;
	public WebDriverWait wait;

	@BeforeTest
	public void setup() throws Exception {

		driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closeBrowser() {

		driver.quit();

	}
*/
