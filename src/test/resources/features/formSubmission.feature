Feature: Form Submission

  Scenario: Submit Contact Form
    Given I am on the Contact Us page
    When I fill in the contact form with the following data
      | Name     | Email             | Message          |
      | John Doe | john@example.com  | I need help with my account. |
    And I click the submit button
    Then I should see a confirmation message "Thank you for your message."