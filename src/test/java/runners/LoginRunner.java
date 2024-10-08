package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\features",	//the path of the features file. in this case its the Login feature
//		features="classpath:features",	//will also work if there are multiple feature files like the above - industry standards
		glue="steps",	//the name of the stepDefinition file that the steps of the feature are glued to
		tags="@Homework1",	//"", "name" / {"name or name2"} / @smoke/regression/etc.	
		monochrome=true,
//		dryRun=true,
		plugin= {	//says what kind of report I want to generate so in this case a pretty, html, and a json under the target folder
				"pretty",
				"html:target/reports/cucumber.html",
				"json:target/reports/cucumber.json",
		}
		
		)
public class LoginRunner {

}
