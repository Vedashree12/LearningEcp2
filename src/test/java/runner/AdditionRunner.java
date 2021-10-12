package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\User\\eclipse-workspace\\LTI\\CucumberProject\\src\\test\\resources\\features\\addition.feature", //where is feature file
		glue="stepDifinition" ,//where is setdefinition
		monochrome=true, //format console
		dryRun=false,    //Keep false for actual run.
		                 //if it is true then it will check whether all steps have matching step definition or not.Not to actual run
		plugin= {"pretty","html:target/htmlReport.html","json:target/jsonReport/report.json"}  //display in console all the steps//generate reports html and json
		)
public class AdditionRunner {
	//Don't have to write anything in the class.

}
