@CucumberParameterization
Feature: Best Packages in MakeMyTrip

  @Operations
  Scenario Outline: Finding the list of packages available in between the cities
    Given I open the MakeMyTrip Application
    When I pass the "<Source>" and "<Destination>" cities and perform search
    Then I see a list of packages available

    Examples: 
      | Source    | Destination |
      | Chennai   | Mumbai      |
      | Hyderabad | Bangalore   |
      | Pune      | Delhi       |
      | Nagpur    | Ranchi      |
