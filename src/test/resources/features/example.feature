Feature: User Login
  Scenario: Verify that user can login using valid data
    Given user is in login page
    When enters valid credentials
    And clicks on login button
    Then user is redirected to dashboard page

