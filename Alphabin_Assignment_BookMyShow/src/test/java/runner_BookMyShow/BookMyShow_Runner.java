package runner_BookMyShow;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
		    features = {"src/test/resources/BookMYShow_Folder/BookMyShow.feature"},
		    glue = {"Step_Defination_BookMyShow"}
		)
		public class BookMyShow_Runner extends AbstractTestNGCucumberTests {
		}


