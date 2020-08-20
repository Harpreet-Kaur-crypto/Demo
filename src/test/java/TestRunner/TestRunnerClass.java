package TestRunner;



import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/FeaturePackage",
		glue="StepDefinition")
public class TestRunnerClass extends AbstractTestNGCucumberTests{

}
