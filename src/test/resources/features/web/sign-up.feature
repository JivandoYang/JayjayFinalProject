@web
@sign-up
Feature: Sign up

  @positive
  Scenario: user sign up with valid data
    Given user is on home page
    When user click sign up menu
    And user input signup random username
    And user input signup password "random"
    And user click sign up button
    Then user should see sign up alert with "Sign up successful."

  @negative
  Scenario: User sign up with existing username
    Given user is on home page
    When user click sign up menu
    And user input signup username "Jivando"
    And user input signup password "vando123"
    And user click sign up button
    Then user should see sign up alert with "This user already exist."

  @negative
  Scenario: User sign up without username
    Given user is on home page
    When user click sign up menu
    And user input signup password "Jivando"
    And user click sign up button
    Then user should see sign up alert with "Please fill out Username and Password."

  @negative
  Scenario: User sign up without password
    Given user is on home page
    When user click sign up menu
    And user input signup username "vando123"
    And user click sign up button
    Then user should see sign up alert with "Please fill out Username and Password."

  @cancel
  Scenario: User cancels sign up
    Given user is on home page
    When user click sign up menu
    And user click cancel signup button
    Then sign up modal should be closed
