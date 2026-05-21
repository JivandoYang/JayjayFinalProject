@api
@get-user-by-id
Feature: Get user by id

  @positive
  Scenario: Successfully get user data by valid user ID
    Given user set GET user API endpoint with user id "6a0b30f7406f0c48faf942c6"
    When user send GET HTTP request
    Then user receive valid status code 200

  @negative
  Scenario: Failed get user data without app-id
    Given user set GET user API endpoint with user id "6a0b30f7406f0c48faf942c6"
    When user send GET HTTP request without app-id
    Then user receive valid status code 403

  @negative
  Scenario: Get user data with invalid id
    Given user set GET user API endpoint with user id "wrongid"
    When user send GET HTTP request
    Then user receive valid status code 400

