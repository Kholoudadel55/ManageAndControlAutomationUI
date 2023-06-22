Feature: settings

  Scenario: Validate that user can access the general settings
    Given User is in login page
    And User enter his account number
    And User enter his email
    And User enter his password
    And User click on login button
    And User direct successfully to the dashboard
    And User click on skip for now
    And User click on manage tab
    And User click on more tab
    Then User click on settings tab

  Scenario: Validate that user can access the general settings and modify the sending time field
    Given User is in login page
    And User enter his account number
    And User enter his email
    And User enter his password
    And User click on login button
    And User direct successfully to the dashboard
    And User click on skip for now
    And User click on manage tab
    And User click on more tab
    And User click on settings tab
    And User click on sending time field
    And User pick time from drop down box
    Then User click on save changes button
