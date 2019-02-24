package f;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@RunWith(Cucumber.class)
@CucumberOptions(
//features = "src\\test\\resources\\Feature" , format = {"pretty", "html:target/cucumber-report", "json:target/cucumber.json"})
//features = "src\\test\\resources\\Feature" , plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" }
features = "src\\test\\resources\\Feature" , plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		 "junit:target/cucumber-reports/Cucumber.xml","html:target/cucumber-reports"}, monochrome = true)
public class RunnerTest {

} 