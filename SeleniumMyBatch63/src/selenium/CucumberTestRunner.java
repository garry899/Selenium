package selenium;

public class CucumberTestRunner {

	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	//make TestRunner.java class in package 
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/functionalTests",
			//make cucumber.features file and give the path here
			glue= {"stepDefinitions"},
			plugin = { "pretty" },
			plugin = { "usage" },
			//to check the time taken by each step
			
			//make sure you delete the old file with the same name
			plugin = { "pretty", "html:target/cucumber-reports/Cucumber.html" },
			//cucumber html reports
			plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
			//cucumber json reports
			plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
			//xml reports
			plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
					"junit:target/cucumber-reports/Cucumber.xml",
			"html:target/cucumber-reports/Cucumber.html"},
			//to generate all reports together
			monochrome = true
			//it gives the clean report
			tags="@smoketest"
			//to run only smoke tests
			//give the same tag to feature or scenario in cucumber.feature file
			)

	public class TestRunner {

	}

}
