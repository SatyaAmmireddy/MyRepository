package CucumberParameterizationStepDefination;

import static org.junit.Assert.assertTrue;

import CucumberParameterizationStep.OperationsStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	OperationsStep step = new OperationsStep();
	
	@Given("^I open the MakeMyTrip Application$")
	public void i_open_the_MakeMyTrip_Application() throws Exception {
		step.setUp();
		step.openApplication("https://www.makemytrip.com/");
		step.timeOut();
	}

	@When("^I pass the \"([^\"]*)\" and \"([^\"]*)\" cities and perform search$")
	public void i_pass_the_and_cities_and_perform_search(String source, String destination) throws Exception {
		step.fromCity().sendKeys(source);
		Thread.sleep(10000);
		step.clickOnCity().click();
		step.toCity().sendKeys(destination);
		Thread.sleep(5000);
		step.clickOnCity().click();
		Thread.sleep(5000);
		step.datePicker();
		Thread.sleep(3000);
		step.search().click();
	}

	@Then("^I see a list of packages available$")
	public void i_see_a_list_of_packages_available() throws Exception {
		String msg = (String) step.availablePackagesPage();
		assertTrue(msg.contains("Flights from "));
		Thread.sleep(3000);
		step.closeBrowser();
	}

}
