package Org.java.BDDFeatureDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Org.java.base.DriverIniitiate;
import Org.java.utility.ScreenShot;
import Org.java.utility.extentReport;
import cucumber.api.CucumberOptions;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@CucumberOptions(
glue={"stepDefinition"})
public class StepDefinition {
	ScreenShot S;
	WebDriver driver;

	@Given("^User is on homeepage$")
	public void user_is_on_homeepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("a");
	}

	@When("^User_Clicks_On \"([^\"]*)\"$")
	public void user_clicks_on(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("b");
	}

	@When("^User_Enters_Username$")
	public void user_enters_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("c");
	}

	@Then("^User_Login$")
	public void user_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("d");
	    
	}

	 
	 @Given("^User is on homeepageasdf$")
	 public void user_is_on_homeepageasdf() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	       System.out.println("f");
	 }

	 @When("^User_Enters_Usernamesad$")
	 public void user_enters_usernamesad() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
		    System.out.println("g");
	 }

	 @When("^User_enters passwordsdf$")
	 public void user_enters_passwordsdf(DataTable arg1) throws Throwable {
		 List<List<String>> data = arg1.raw();
			System.out.println((data.get(0).get(0))); 
			System.out.println((data.get(0).get(1))); 
	     // Write code here that turns the phrase above into concrete actions
	     // For automatic transformation, change DataTable to one of
	     // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	     // E,K,V must be a scalar (String, Integer, Date, enum etc)
	     throw new PendingException();
	 }
	
	 @Then("^User_Logout$")
	    public void user_logout() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println("e");
	}
}
