package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\Dashboard.feature"},
		
		glue = {"steps"}
		
		
		
		)



public class DashboardRunner extends AbstractTestNGCucumberTests{

}