package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	// CTRL + SHIFT + O
	@Given("user is at the login page")
	public void user_is_at_the_login_page() {
	    System.out.println("Given statement");
	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String string) {
	   System.out.println("Entered username :"+string);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
	   System.out.println("Password entered :"+string);
	}

	@When("user clicks on {int} login number with text {string}")
	public void user_clicks_on_login_number(Integer value, String str) {
	   System.out.println("clicked on login with number : "+value+ "and other is "+str);
	}

	@Then("user logged in validated")
	public void user_logged_in_validated() {
	  System.out.println("Login validated!!!!");
	}


}
