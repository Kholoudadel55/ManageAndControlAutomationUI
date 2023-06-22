Feature: user login
  Scenario: Validate that user can access dashboard with valid credentials
    Given User is in login page
    And User enter his account number
    And User enter his email
    And User enter his password
    And User click on login button
    Then User direct successfully to the dashboard


Feature: User Login
  Scenario: Verify that user can login using valid data
    Given user is in login page
    When enters valid credentials
    And clicks on login button
    Then user is redirected to dashboard page
