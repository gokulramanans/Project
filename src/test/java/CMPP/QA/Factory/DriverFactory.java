package CMPP.QA.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
	public WebDriver driver;
	public static  ThreadLocal<RemoteWebDriver> thredLocal = new ThreadLocal<RemoteWebDriver>();
	
	public WebDriver init_driver(String browser) {

		System.out.println("browser value is: " + browser);

		if (browser.equals("chrome")) {
			thredLocal.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			thredLocal.set(new FirefoxDriver());
		} else if (browser.equals("edge")) {
			thredLocal.set(new EdgeDriver());
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();

	}
	
	public static synchronized WebDriver getDriver() {
		return thredLocal.get();
	}
	
}
