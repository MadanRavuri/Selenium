Feature: working on newtours page

  Scenario: web application
    Given user is in newtours page
    When user registers
    Then user selects India from dropdown
    And user navigate to home page
