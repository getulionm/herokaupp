package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Ge\\Desktop\\Java Projects\\herokaupp\\src\\test\\java\\features"
//        ,glue = {"KeyPressSteps", "FileUploadSteps"}
        )


public class TestRunner extends AbstractTestNGCucumberTests {
}
