@web
@login
Feature: Login

  @positive
  Scenario: User login with valid credentials
    Given user is on home page
    When user click login menu
    And user input login username "Jivando"
    And user input login password "vando123"
    And user click login button
    Then user should see logout menu

  @negative
  Scenario: User login with wrong password
    Given user is on home page
    When user click login menu
    And user input login username "Jivando"
    And user input login password "a"
    And user click login button
    Then user should see login alert with "Wrong password."

  @negative
  Scenario: User login with wrong username and password
    Given user is on home page
    When user click login menu
    And user input login username "Jivando15235"
    And user input login password "a"
    And user click login button
    Then user should see login alert with "User does not exist."

  @negative
  Scenario: User login with wrong username
    Given user is on home page
    When user click login menu
    And user input login username "Jivando15235"
    And user input login password "vando123"
    And user click login button
    Then user should see login alert with "User does not exist."

  @negative
  Scenario: User login with missing username and password
    Given user is on home page
    When user click login menu
    And user click login button
    Then user should see login alert with "Please fill out Username and Password."

  @negative
  Scenario: User login with missing username
    Given user is on home page
    When user click login menu
    And user input login password "vando123"
    And user click login button
    Then user should see login alert with "Please fill out Username and Password."

  @negative
  Scenario: User login with missing password
    Given user is on home page
    When user click login menu
    And user input login username "Jivando15235"
    And user click login button
    Then user should see login alert with "Please fill out Username and Password."

  @cancel
  Scenario: User cancels login
    Given user is on home page
    When user click login menu
    And user click cancel login button
    Then login modal should be closed