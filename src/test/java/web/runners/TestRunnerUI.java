package web.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"web.steps"},
        plugin = {
                "pretty",
                "html:build/reports/cucumber-report.html",
                "json:build/reports/cucumber-report.json"
        },
        monochrome = true
)
public class TestRunnerUI {
}
