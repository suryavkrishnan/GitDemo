package TestRunnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features = "src/test/java/FeatureFiles", 		  										
		    glue="StepDefenitions",
		    tags="@PlaceOrder or @OffersPage",
		    plugin= {"html:target/Report/cucumberReport.html","json:target/Report/cucumberReport.json",
		    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		    		"rerun:target/Report/failed_scenarios.txt"
		    			}

		    )  
public class JUnitTestRunnerTest{
	

}



//tags="@PlaceOrder or @OffersPage",