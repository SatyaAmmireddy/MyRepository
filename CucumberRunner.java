package CucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\java\\FeatureFiles"},
		glue= {"CucumberParameterizationStepDefination"},
		plugin={"html:target\\reports\\rep.html","junit:target\\reports\\rep1.xml","json:\\target\\reports\\rep2.json"}
		)
public class CucumberRunner {

}
