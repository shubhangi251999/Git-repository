package uiappfeatures;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.ReadProperty;

public class ApplicationHooks {
	WebDriver driver;

	@Before
	public void launchBrowser() throws IOException, InterruptedException {
		DriverFactory df = new DriverFactory();

		String browserData = ReadProperty.getPropData("browser");
		
		String valueFromCommandPrompt = System.getProperty("cliBrowser");
		
		String envValue = System.getProperty("env");
		
		System.out.println("Environment value is : "+envValue);
		
		if(valueFromCommandPrompt !=null) {
			
			browserData = valueFromCommandPrompt;
		}
		
		driver = df.initBrowser(browserData);
		
		driver.manage().window().maximize();
	
		
	}

	@After(order = 2)
	public void tearDown(Scenario scenario) {
		boolean isScenarioFailed = scenario.isFailed();

		if (isScenarioFailed) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);

			scenario.attach(source, "image/png", scenario.getName());

		}
	}

	@After(order = 1)
	public void closeBrowser() {
		driver.quit();
	}

}