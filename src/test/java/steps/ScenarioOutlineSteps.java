package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	
	@Given("I have logged into the system")
	public void initLogin()
	{
		System.out.println("Login to the system");
	}
	
	@Given("I am at home page")
	public void navToHome()
	{
		System.out.println("Navigated to home page");
	}
	
	@Given("user is at the signup page")
	public void user_is_at_the_signup_page() {
	    System.out.println("given line");
	}

	@When("user enters name as {string} on form")
	public void user_enters_name_as_on_form(String name) {
	    System.out.println("Entered name : "+name);
	}

	@When("user select gender as {string} with weight is {double}")
	public void user_select_gender_as_with_weight_is(String string, Double double1) {
	    System.out.println("Entered gender is : "+string+ "with weight is : "+double1);
	}


	@When("user select the slotnumber as {int}")
	public void user_select_the_slotnumber_as(Integer int1) {
		System.out.println("Entered slot number is  : "+int1);
	}

	@Then("user gets created")
	public void user_gets_created() {
	    System.out.println("User created!!!");
	}


}