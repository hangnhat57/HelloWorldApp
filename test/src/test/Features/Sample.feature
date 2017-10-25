# Created by NhatDell at 30-Aug-17
Feature: Sample Test
  This one is just for test if framework is worked or not

  Scenario Outline: Login to facebook
    Given I navigate to facebook
    And I enter <user> and <pass> for login
    And I click Login button
    Then I should see Newfeed Page
      Examples:

        | user |  pass |
        |hangnhat57@me.com|123456|
        |hangnhat67@me.com|123456|