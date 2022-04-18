package Cucumber.Steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = "src/test/resources/Form.feature", glue = "src/test/java/Cucumber/Steps", strict = true)

public class RunnerTest extends AbstractTestNGCucumberTests {
}
