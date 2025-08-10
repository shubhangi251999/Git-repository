package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	
	@When("I enter the username")
	public void enteringUsername()
	{
		System.out.println("Entered username");
	}
	
	@When("I enter the password")
	public void enteringPassword()
	{
		System.out.println("Entered pwd");
	}
	
	@When("I click on login button")
	public void clickOnLogin()
	{
		System.out.println("Clicked on login");
	}
	
	@Given("I am at the login page")
	public void preRequisite()
	{
		System.out.println("Given statement is executing");
	}
	
	@Then("I should be able to login")
	public void validateOutput()
	{
		System.out.println("Output validated!!!");
	}
	
	@Given("user should be at login page")
	public void navToLoginPage()
	{
		System.out.println("Pre requisite for second scenario");
	}
	
	@Then("page title should be displayed")
	public void validateTitle()
	{
		System.out.println("Title validated!!!");
	}
	
	
	

}
