package org.qa.amazon.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/featurefiles"},
		glue = {"org.qa.amazon.testcases", "org.qa.amazon.hooks"},
		monochrome=true,
		dryRun=false,
		plugin= {"pretty", "html:target/cucumber-report_html/cucumber.html", "json:target/cucumber-report/cucumber.json"}
		)
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
public class RunnerFile {

}
