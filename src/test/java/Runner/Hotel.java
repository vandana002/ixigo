package Runner;

//import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="Features",monochrome=true,glue="StepDefinitions",
//plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
plugin={"pretty","json:target/cucumberReports.json"})

//plugin={"pretty","junit:target/cucumberReports.xml"})
public class Hotel extends AbstractTestNGCucumberTests{
	
}
