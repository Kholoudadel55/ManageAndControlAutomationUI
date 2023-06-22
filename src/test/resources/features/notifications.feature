Feature: notification
  Scenario: Validate that user can access the notifications
    Given User is in login page
    And User enter his account number
    And User enter his email
    And User enter his password
    And User click on login button
    And User direct successfully to the dashboard
    And User click on skip for now
    And User click on manage tab
    And User click on more tab
    And User click on notifications tab
    Then Users click on create notification rule button

    Scenario: Validate that user can create notification rule
      Given User is in login page
      And User enter his account number
      And User enter his email
      And User enter his password
      And User click on login button
      And User direct successfully to the dashboard
      And User click on skip for now
      And User click on manage tab
      And User click on more tab
      And User click on notifications tab
      And Users click on create notification rule button
      And User enter name for the notification rule
      And User enter apply on drop down box and select an option
      And User enter frequency drop down box and select an option
      And User enter users drop down box and select an user
      Then User click on save button




