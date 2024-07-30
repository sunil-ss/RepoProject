package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target/cucumber_report.html","pretty"},
		features = "src/test/java/feature",
		glue = "stepDef",
		tags = "@Tuto"
		)
public class Runner {

	
	
}
