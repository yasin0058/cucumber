package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
           "pretty",//generates reports in the console as well
          "html:target/cucumber-reports.html",
          "json:target/json-reports/cucumber.json",
          "junit:target/xml-reports/cucumber.xml",
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
           //"rerun:target/failedRerun.txt"

        },
        monochrome = true, //makes the console reports more readable
        features = ".//src//test//resources//features",//path of the features folder
        glue = {"stepdefinitions", "hooks"}, //path of the stepdefinitions folder
        dryRun = false, //generate the missing step definitions only. Do not run the existing step definitions
        tags = "@iPhone"
)
public class Runner {
}
/*
Runner class is used to run the feature files
And add some report plug ins
Runner class also connects the JAVA(step definitions) and NON-JAVA(feature files) parts
@RunWith(Cucumber.class) is used for making the class Runnable
@CucumberOptions is used for connecting features and step definitions. It is also used for configurations and cucumber report plugins
features is used for path of the features folder
glue is used to give the path of the step definitions folder
dryRun = true is used to generate missing step definitions. dryRun=false must be used for normal run.
tags = "@iphone" is used to run specific scenarios.
 */
/*
Runner class is used to run the feature files and to add some plugins
Runner class is used to connect JAVA(stepdefinitions) and NON-JAVA (feature files) parts
@RunWith(Cucumber.class) makes Runner class runnable
@CucumberOptions is used to connect feature and step definitions. It is also used for configuration and report for plugins
 feature is used to provide path of the feature folder
 glue is used to provide of the step definition folder
 dryRun = true generate missing step defs without running the previous scenarios
 dryRun=false run the feature file
 tags are used to rug chosen scenario

 */
