package com.scf.stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleSteps {
	@Given("^User navigated to FACEBOOK\\.COM$")
	public void user_navigated_to_FACEBOOK_COM() throws Exception {
	   System.out.println("Facebook navigation");
	}

	@When("^user enter FirstName as \"([^\"]*)\" and LastName as \"([^\"]*)\"$")
	public void user_enter_FirstName_as_and_LastName_as(String arg1, String arg2) throws Exception {
		  System.out.println("Firstname navigation");
	}

	@When("^user click on signup button$")
	public void user_click_on_signup_button() throws Exception {
		  System.out.println("Signup navigation");
	}

	@Then("^acount should not be created$")
	public void acount_should_not_be_created() throws Exception {
		  System.out.println("Should  navigation");
	}
	

}
