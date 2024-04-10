Feature: Google Account Registration

Scenario: Signing up for a new Google account
    Given I am on the Google sign up page
    When I enter my first name as "<first_name>"
    And I enter my last name as "<last_name>"
    And I select my birthday as "<birthday>"
    And I select my gender as "<gender>"
    And I create my own email address as "<email_address>"
    And I set my password as "<password>"
    And I click on the Next button
    Then I should be successfully signed up for a new Google account
