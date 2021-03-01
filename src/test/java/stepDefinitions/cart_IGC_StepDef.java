package stepDefinitions;


import com.igl.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cart_IGC_StepDef {
	
	private LoginPage logingpage=new LoginPage();
	private searchScreen screen=new searchScreen();
	private CheckoutPayment payment=new CheckoutPayment();
	private Logoff logoff=new Logoff();

	@Given("user logged into application with username {string} and password {string}")
	public void user_logged_into_application_with_username_and_password(String username, String password) {
		logingpage.login(username, password);
	}
	
	@When("User searched with keyword {string} in the global search")
	public void user_searched_with_keyword_in_the_global_search(String searchKeyWord) {
		screen.enterSerachCriteria(searchKeyWord);
	}

	@Then("User select the {string} cost item")
	public void user_select_the_cost_item(String price) {
		screen.selectSortBy(price);
	}

	@Then("User adds selected item to cart")
	public void user_adds_selected_item_to_cart() {
		payment.addItemToCart();
	}

	@Then("User check out the cart and complete the transaction")
	public void user_check_out_the_cart_and_complete_the_transaction() {
		payment.checkoutAndPayment();
	}

	@Then("User loggoff and close the browser")
	public void user_loggoff_and_close_the_browser() {
		logoff.loggoff();
	}

}
