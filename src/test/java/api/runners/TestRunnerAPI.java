package api.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import api.tests.UserPositiveTests;
import api.tests.UserNegativeTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        UserPositiveTests.class,
        UserNegativeTests.class
})
public class TestRunnerAPI {
}
