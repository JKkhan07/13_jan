Feature: Actitime login Function

  Scenario: Validate actitime funtion with vaild username and password
    Given User is already having actitime url'https://demo.actitime.com/login.do'
    When user enter username as 'admin'
    And user enter password as 'manager'
    And click on login button
    Then verify that actitime page open with with title 'actiTIME - Enter Time-Track' 
    And close the browser

  