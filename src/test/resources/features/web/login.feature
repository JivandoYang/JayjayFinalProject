@web
@login
Feature: Login

  @positive
  Scenario: User login with valid credentials
    Given user is on home page
    When user click login menu
    And user input login username "validusername"
    And user input login password "validpassword"
    And user click login button
    Then user should see successfully login alert

  @negative
  Scenario: User login with wrong password
    Given user is on home page
    When user click login menu
    And user input login username "asdf"
    And user input login password "a"
    And user click login button
    Then user should see wrong password alert

  @negative
  Scenario: User login with wrong username
    Given user is on home page
    When user click login menu
    And user input login username "asdawegawegf"
    And user input login password "asdfa"
    And user click login button
    Then user should see user does not exist alert

  @negative
  Scenario: User login with missing username or password
    Given user is on home page
    When user click login menu
    And user input login username "asdawegawegf"
    And user input login password ""
    And user click login button
    Then user should see empty username or password alert

  @positive
  Scenario: User cancels login
    Given user is on home page
    When user click login menu
    And user click cancel login button
    Then login modal should be closed