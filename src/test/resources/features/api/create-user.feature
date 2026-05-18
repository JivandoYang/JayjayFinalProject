@api
@create-user
Feature: Create user

  @positive
  Scenario: Successfully create user
    Given user set POST create user API endpoint
    And user input first name "John"
    And user input last name "Doe"
    And user input email "random1412@gmail.com"
    When user send POST create user HTTP request
    Then user receive valid status code 200

  @negative
  Scenario: Create user with invalid data
    Given user set POST create user API endpoint
    And user input first name "John"
    And user input last name "Doe"
    And user input email "wrongdata"
    When user send POST create user HTTP request
    Then user receive valid status code 400

  @negative
  Scenario: Create user with missing data
    Given user set POST create user API endpoint
    And user input first name "John"
    And user input last name ""
    And user input email ""
    When user send POST create user HTTP request
    Then user receive valid status code 400