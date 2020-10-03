@tag     
Feature: Best Packages in MakeMyTrip

	@ExcelOperations
	Scenario: Finding the list of packages available in between the cities
		Given I open the MakeMyTrip Application 
		When I pass the "Source" and "Destination" cities and perform search
		Then I see a list of packages available
