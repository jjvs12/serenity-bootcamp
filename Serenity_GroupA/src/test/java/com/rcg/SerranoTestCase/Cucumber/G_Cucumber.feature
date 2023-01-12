Feature: Creation of Google Account

  Scenario: Verify if the Google Account page is displayed when user clicks the Create Account button
    Given Browser and website is open
    And User clicks signIn 
    And User clicks createAcc
    And User selects googleType
    Then Create Google Account Page is displayed
