package f;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class FeatureDefinition {

	@Given("^I am logged in as \"([^\"]*)\" user$")
	public void i_am_logged_in_as_user(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  Assert.assertEquals("true", "false");
		System.out.println("1");
	}

	@When("^I navigate to Outbound Reporting Dashboard page$")
	public void i_navigate_to_Outbound_Reporting_Dashboard_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("2");
	}

	@When("^I click \"([^\"]*)\" tab$")
	public void i_click_tab(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("3");
	}

	@When("^I click \"([^\"]*)\" button$")
	public void i_click_button(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("4");
	}

	@When("^I click \"([^\"]*)\" dropdown$")
	public void i_click_dropdown(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("5");
	}

	@When("^I click \"([^\"]*)\" link$")
	public void i_click_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("6");
	}

	@Then("^I should see \"([^\"]*)\" link$")
	public void i_should_see_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("7");
	}
}
