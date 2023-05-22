Feature: User Login
  Scenario: Verify that user can login using valid data
    Given user is in login page
    When enters valid credentials
    And clicks on login button
    Then user is redirected to dashboard page

#  Scenario: Verify that user can not login using invalid data
#    Given user is in login page
#    When enters invalid credentials
#    And clicks on login button
#    Then user can redirected to dashboard page