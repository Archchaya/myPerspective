package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	
		features = {"src/test/resources/features/login.feature"},
		glue = {"myp1_stepdefinitions","myP1_pageobjects"},
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"},
		publish = true
)
public class logintTestRunner {

}
