package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features/logingmail.feature", 
glue="steps",
monochrome = true, publish = true , tags = "@smoke"
)
public class Runtest extends AbstractTestNGCucumberTests {

	
}
