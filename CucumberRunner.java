package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={"FeatureFiles\\ExcelOperations"},
		tags={"@ExcelOperations"},
		plugin={"html:target\\reports\\rep.html","junit:target\\reports\\rep1.xml","json:\\target\\reports\\rep2.json"}
		
		)
public class CucumberRunner {

}
