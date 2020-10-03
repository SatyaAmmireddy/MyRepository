package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles.ExcelOperations.feature", glue="", dryRun = true)
public class TestRunner {

}
