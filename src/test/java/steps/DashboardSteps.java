package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DashboardSteps {
	// CTRL + SHIFT + O
	@Given("user is logged in")
	public void user_is_logged_in() {
	    System.out.println("User logged in!");
	}

	@Then("revenue amount should be available")
	public void revenue_amount_should_be_available() {
	   System.out.println("revenue verified");
	}

	@Then("firstname should be displayed")
	public void firstname_should_be_displayed() {
	   System.out.println("Name verified");
	}

	@Then("nofication should be displayed")
	public void nofication_should_be_displayed() {
	   System.out.println("Notification handled");
	}


}