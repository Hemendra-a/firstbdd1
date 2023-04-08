package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Featurefiles",glue="stepdefination",plugin= {"pretty","junit:target/JUnitReports/report.xml",
		"html:target/HtmlReports/report.html",
		"json:target/JSONReports/report.json"})
public class Runner {

	
}
