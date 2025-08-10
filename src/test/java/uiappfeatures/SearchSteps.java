package uiappfeatures;

import org.testng.Assert;

import drivermanager.DriverFactory;
import drivermanager.PageFactoryManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchSteps {
	
	SearchPage searchPage ;
	public SearchSteps()
	{
		 searchPage =  new PageFactoryManager().getSearchPageObject(DriverFactory.getDriver());
	}
	@When("user searches the {string} in text box")
	public void user_searches_the_in_text_box(String string) {
		searchPage.searchProduct(string);
	}

	@Then("mobile search results should display")
	public void mobile_search_results_should_display() {
	 boolean isDisplaying = searchPage.isMobilePhoneDisplayed();
	 
	 Assert.assertEquals(isDisplaying, true);
	}

}