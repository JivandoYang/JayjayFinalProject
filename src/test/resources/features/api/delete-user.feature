@api
@delete-user
Feature: Delete user

  @positive
  Scenario: Successfully delete user data
    Given user create new user
    When user send DELETE HTTP request
    Then user receive valid status code 200