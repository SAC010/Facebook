package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
				(
						
						plugin="pretty",
						features="src/test/resource",
						tags="@SmokeTest",
						glue="cucumbermap"
						
				)

public class RunTest 
{
	

}
