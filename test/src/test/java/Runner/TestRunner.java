package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * Created by NhatDell on 06-Jul-17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/Features"},glue = {"Steps"},format = {"pretty","html:target/cucumber","json:target/cucumber.json"})
public class TestRunner {
}


