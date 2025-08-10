package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	@Given("I have logged into the application")
	public void preRequisite()
	{
		System.out.println("Given statement line 1");
	}
	
	@Given("I am at the home page")
	public void additionalGiven()
	{
		System.out.println("Nav to home page");
	}
	
	@When("I click on add button")
	public void addingprofile()
	{
		System.out.println("Clicked on add button");
	}
	
	@When("I enter details")
	public void enteringDetails()
	{
		System.out.println("Details entered");
	}
	
	@Then("Profile should get added")
	public void validateAddition()
	{
		System.out.println("Profile added");
	}
	
	@When("I click on edit button")
	public void editingprofile()
	{
		System.out.println("Clicked on edit button");
	}
	
	@When("I update the data")
	public void modifyingDetails()
	{
		System.out.println("Details modified");
	}
	
	@Then("Profile should get updated")
	public void profileValidation()
	{
		System.out.println("Profile modification done");
	}
	
	@When("I click on delete button")
	public void deleteProfile()
	{
		System.out.println("Delete button handled");
	}
	
	@Then("Profile should get deleted")
	public void profileDeletion()
	{
		System.out.println("Profile deletion validation");
	}

	

}


