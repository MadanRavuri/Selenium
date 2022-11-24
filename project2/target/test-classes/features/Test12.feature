Feature: working on web application

  Scenario: Amazon com
    Given open and navigate to amazon site
    When get all the links,title,url and peint in Excel
    Then capture the screenshot
    And close the website
