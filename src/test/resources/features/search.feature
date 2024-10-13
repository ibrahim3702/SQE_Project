Feature: Search Functionality

  Scenario: Successful Search
    Given I am on the dashboard
    When I enter "laptop" into the search bar
    And I click the search button
    Then I should see products related to "laptop"

  Scenario: Empty Search Result
    Given I am on the dashboard
    When I enter "xyz123" into the search bar
    And I click the search button
    Then I should see a message "No products found"