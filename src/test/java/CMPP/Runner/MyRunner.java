package CMPP.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-reports.html",
        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "timeline:test-output-thread/" },
		monochrome = true,
		features = "src/test/resources/features/",
		//glue = {"Util.BaseTest","Pages.Loginpage","Stepdefinitions.Login"},
			glue = {"CMPP.AppHooks","CMPP.Stepdefinitions"}
		//tags = "@invalidcredentials and @emptycredentials",
		//plugin = {"pretty","html:target/cucumber-reports.html"} // specify reporting format and location
)
public class MyRunner extends AbstractTestNGCucumberTests{

}