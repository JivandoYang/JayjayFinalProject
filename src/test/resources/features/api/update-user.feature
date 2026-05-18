@api
@update-user
Feature: Update user

  @positive
  Scenario: Successfully update user
    Given user set PUT update user API endpoint with user id "6a0b30f7406f0c48faf942c6"
    And user input first name "John"
    And user input last name "Doe"
    When user send PUT HTTP update request
    Then user receive valid status code 200

  @negative
  Scenario: Update user data on forbidden field
    Given user set PUT update user API endpoint with user id "6a0b30f7406f0c48faf942c6"
    And user input first name "John"
    And user input last name "Doe"
    And user input email "John@gmail.com"
    When user send PUT HTTP update request
    Then user receive valid status code 200
    And user email should not be updated

