package steps;


	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class PlacingOrder {

		AddingProductToCart apc;
		
		public PlacingOrder(AddingProductToCart apc)
		{
			this.apc = apc;
		}
		
		@When("I click on place order")
		public void i_click_on_place_order() {
			System.out.println("clicked on place order");
		}

		@Then("Order should get placed")
		public void order_should_get_placed() {
			System.out.println("Order confirmed");
			
			String prdId = apc.getProductId();
			
			System.out.println("Product id value is "+prdId);
		}

	}

