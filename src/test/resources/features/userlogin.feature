Feature: user login
  Scenario: Validate that user can access dashboard with valid credentials
    Given User is in login page
    And User enters his account number
    And User enters his email
    And User enters his password
    And User clicks on login button
    Then User directs successfully to the dashboard

    Scenario: Validate that user can not access dashboard with invalid account number
      Given User is in login page
      And User enters his invalid account number
      And User enters his email
      And User enters his password
      And User clicks on login button
      Then User can not access to the dashboard

  Scenario: Validate that user can not access dashboard with invalid email
    Given User is in login page
    And User enters his account number
    And User enters his invalid email
    And User enters his password
    And User clicks on login button
    Then User can not access to the dashboard