package uiappfeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

			features = { "@target/failed.txt" },

			glue = { "uiappfeatures" },

			plugin = { "pretty" , "html:target/cucumber_report/report.html",
					               "rerun:target/failed.txt"},

			publish = true
			
			//tags = "@sanity"

)
	public class AmazonFailedTestRunner extends AbstractTestNGCucumberTests{
	 
}
