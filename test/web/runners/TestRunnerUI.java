@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"},
        plugin = {
                "pretty",
                "html:build/reports/cucumber-html-report",
                "json:build/reports/cucumber-report.json"
        },
        monochrome = true
)
public class TestRunnerUI {
}
