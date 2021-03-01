package com.igc.stedefs;

import com.igc.factory.DriverFactory;
import com.igc.pages.impl.LoginPageImpl;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cart_IGC_StepDef extends DriverFactory {

	LoginPageImpl loginpageImpl = new LoginPageImpl();

	
	@Given("user logged into application with username {string} and password {string}")
	public void user_logged_into_application_with_username_and_password(String username, String password) {
		loginpageImpl.login(username, password);
	}
	
	

	@When("User searched with keyword {string} in the global search")
	public void user_searched_with_keyword_in_the_global_search(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User select the {string} cost item")
	public void user_select_the_cost_item(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User adds selected item to cart")
	public void user_adds_selected_item_to_cart() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User check out the cart and complete the transaction")
	public void user_check_out_the_cart_and_complete_the_transaction() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User loggoff and close the browser")
	public void user_loggoff_and_close_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
