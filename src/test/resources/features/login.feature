Feature: Login Functionality

Scenario Outline: Successful login
    Given I am on the login page
    When I enter username "<username>" and password "<password>"
    Then I should be redirected to the dashboard

