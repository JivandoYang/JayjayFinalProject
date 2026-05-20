@web
@sign-up
Feature: Sign up

  @positive
  Scenario: user sign up with valid data
    Given user is in home page
    When  user click sign up menu
    And user input signup username ""
    And user input signup password ""
    And user click sign up button
    Then user should see successfully sign up alert

  @negative
  Scenario: User sign up with existing username
    Given user is on home page
    When user click sign up menu
    And user input signup username ""
    And user input signup password ""
    And user click sign up button
    Then user should see username already exists alert

  @positive
  Scenario: User cancels sign up
    Given user is on home page
    When user click sign up menu
    And user click cancel signup button
    Then sign up modal should be closed
