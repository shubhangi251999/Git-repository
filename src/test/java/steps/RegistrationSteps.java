package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {
	String value;
	@Given("user is at the accounts page")
	public void user_is_at_the_accounts_page() {
		System.out.println("Pre defined statement");
	}

	@When("user enters the following data")
	public void user_enters_the_following_data(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();

		List<String> firstList = data.get(1);

		String firstname = firstList.get(0);

		System.out.println(firstname);
		
		System.out.println("Phone number is : "+firstList.get(3));
		
		System.out.println(firstList);
		
		 value = data.get(2).get(3);
		
		System.out.println("Value is "+value);
		
		System.out.println("********************** Map ************************");
		
		
		List<Map<String, String>> mapData = dataTable.asMaps();
		
		Map<String, String> firstRow = mapData.get(0);
		
		String firstName = firstRow.get("phone");
		
		System.out.println(firstName);
		

	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("form submitted");
	}

	@Then("user should get confirmation")
	public void user_should_get_confirmation() {
		System.out.println("Account successfully created");
		System.out.println("Value is "+value);
	}

}