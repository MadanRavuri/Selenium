Feature: working on web application

  Scenario: newtours.com
    Given open and navigate to newtours site
    When get username and password from property list
    When click on register button
    Then get the dropdown elements and print in excel sheet
    And close
