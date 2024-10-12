package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "html:target/cucumber-report.html"}
)
public class TestRunner {
    // No need to define anything here, just the annotations
}
