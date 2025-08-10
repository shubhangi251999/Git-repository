package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingProductToCart {
	
	
	String  productId;
	@Given("I should be at the product page")
	public void i_should_be_at_the_product_page() {
	 System.out.println("nav to product page");
	}

	@When("I click on add to cart button")
	public void i_click_on_add_to_cart_button() {
	   System.out.println("Clicked on add button");
	}

	@Then("Product should get added to cart")
	public void product_should_get_added_to_cart() {
	    System.out.println("Product added!!");
	    
	    productId = "dhjaskdh3adn34dnaja";
	}
	
	
	public String getProductId()
	{
		return productId;
	}

	
}