package Runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="src//test//resources//Features//ConduitCRUD.feature",
		glue = {"Stepdefination"},
		dryRun = false,
		monochrome=true,
		plugin= {"pretty",
				"html:target//Reports//HTMLReport.html",
			
				}
		
		)

public class CrudTestRunner extends AbstractTestNGCucumberTests {
	
}
