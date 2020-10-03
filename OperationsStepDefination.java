package ExcelOperationsStepDefinationFiles;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import ExcelOperationsStepFiles.OperationsStep;
import ExcelReaderData.ExcelReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Scenario;


public class OperationsStepDefination {
	Scenario scenario;

	OperationsStep step = new OperationsStep();
	
	@Before
	public void Before(Scenario scenario) {
		this.scenario = scenario;
	}
	
	@Given("^I open the MakeMyTrip Application$")
	public void Open_MakeMYTrip_Application() throws Exception {
		step.setUp();
		step.openApplication("https://www.makemytrip.com/");
		step.timeOut();
		
	}
	
	@When("^I pass the \"([^\"]*)\" and \"([^\"]*)\" cities and perform search$")
	public void enterCitiesAndPerformSearch(String source, String destination) throws Exception {
//		step.tripSelection().click();
		Thread.sleep(5000);
//		step.fromCity().sendKeys("Hyderabad");
//		Thread.sleep(3000);
//		step.clickOnCity().click();
//		step.toCity().sendKeys("Chennai");
//		Thread.sleep(3000);
//		step.clickOnCity().click();
//		step.search().click();
		
		ExcelReader data = new ExcelReader();
		Map<String, String> map = data.get(scenario.getName(), source, destination);
		Set set=map.entrySet();
		Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	    	Map.Entry entry=(Map.Entry)itr.next();
	    	step.fromCity().sendKeys((String) entry.getKey());
			Thread.sleep(3000);
			step.clickOnCity().click();
			step.toCity().sendKeys((String) entry.getValue());
			Thread.sleep(3000);
			step.clickOnCity().click();
			step.search().click();
			Thread.sleep(5000);
	    }
	    }
	
	@Then("^I see a list of packages available$")
	public void closingApplication() throws Exception {
		String msg = (String) step.availablePackagesPage();
		assertTrue(msg.contains("Flights from "));
		Thread.sleep(3000);
		step.closeBrowser();
	}
	
}
