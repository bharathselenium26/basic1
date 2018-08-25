package runner.login;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/sample.feature" }, glue = {
		"classpath:com.scf.stepdefinition",
		"classpath:com.scf.helper" }, plugin = {"html:target/cucumber-html-report"})
public class SampleRunnnerEx extends AbstractTestNGCucumberTests {

	
}
