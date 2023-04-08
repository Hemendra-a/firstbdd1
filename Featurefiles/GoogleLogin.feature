Feature: Test login functionality

  #https://www.saucedemo.com/
  Scenario Outline: Check login is successful with valid credentials
    Given browsers is open 
     #we can use functionality of one feature file into another with same name
    And user is on login page
    When user enters<username>and<password>
    And user clicks on login
    Then user is navigated to the homepage

    Examples: 
      |username|password|
      |standard_user|secret_sauce|
      |problem_user|secret_sauce|
      |performance_glitch_user|secret_sauce|