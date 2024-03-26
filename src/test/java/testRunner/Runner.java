package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {".//Features/HomePage.feature"},
        glue = "stepDefinition",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports/reports.html"}
)
public class Runner {

}
