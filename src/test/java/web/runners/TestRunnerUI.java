package web.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"},
        plugin = {"pretty", "html:build/reports/cucumber-report.html","json:build/reports/cucumber-report.json"},
        monochrome = true
)
public class TestRunnerUI {
}
