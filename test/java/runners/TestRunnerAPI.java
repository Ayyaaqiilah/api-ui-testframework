package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.UserPositiveTests;
import tests.UserNegativeTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        UserPositiveTests.class,
        UserNegativeTests.class
})
public class TestRunnerAPI {
}
