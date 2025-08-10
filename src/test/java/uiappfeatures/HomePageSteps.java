package uiappfeatures;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivermanager.DriverFactory;
import drivermanager.PageFactoryManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utility.ReadProperty;

public class HomePageSteps {
	HomePage homepage;
	public HomePageSteps() {
	
		 homepage =  new PageFactoryManager().getHomePageObject(DriverFactory.getDriver());
	}

	@Given("user is at the landing page")
	public void preRequisite() throws IOException {
		WebDriver driver = DriverFactory.getDriver();

		driver.get(ReadProperty.getPropData("testSiteUrl"));
	}

	@Then("page title should contains {string}")
	public void validateTitle(String expectedTitle) {
	String title =	homepage.getTitleOfPage();
	
	boolean isPresent = title.contains(expectedTitle);
	
	Assert.assertEquals(isPresent, true);
	
	}

	@Then("cart icon should get displayed")
	public void validateCartElement() {
		boolean isDisplaying = homepage.isCartIconDisplayed();
		
		Assert.assertEquals(isDisplaying, true);
	}

	@When("user clicks on deals")
	public void clickingOnDeals() {
		homepage.checkoutDealsSection();
	}

	@Then("user should redirect to deal page")
	public void validateDealsPage() {
		boolean isPresent = homepage.validateBrandOnDealsPage();
		
		Assert.assertEquals(isPresent, true);
	}

}