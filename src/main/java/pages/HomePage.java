package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	WebDriver driver;

	@FindBy(xpath = "//*[@id='nav-cart']")
	private WebElement cartIcon;

	@FindBy(xpath = "//*[@class=\"a-link-normal\"]/parent::div[@id=\"CardInstanceJaOWJ5IG_eBGr1xeO3riBw\"]")
	private WebElement dealSection;

	@FindBy(xpath = "(//*[@class=\"a-price-whole\"]/ancestor::div[@class=\"a-section a-spacing-micro acsProductBlockV1__price\"])[1]")
	private WebElement priceOfPhone;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getTitleOfPage() {

		String title = driver.getTitle();

		return title;
	}

	public boolean isCartIconDisplayed() {
		boolean isDisplaying = cartIcon.isDisplayed();

		return isDisplaying;
	}

	public void checkoutDealsSection() {

		waitForVisibilityOfElement(dealSection);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", dealSection);
		

	}

	public boolean validateBrandOnDealsPage() {
		waitForVisibilityOfElement(priceOfPhone);

		String valueOfPrice = priceOfPhone.getText();
		
		System.out.println(valueOfPrice);
		
		return priceOfPhone.isDisplayed();
		
	}

}