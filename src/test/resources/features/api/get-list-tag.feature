@api
@get-list
Feature: Get list of tags

  @positive
  Scenario: Successfully get list of tags
    Given user set GET list API endpoint
    When user send GET LIST HTTP request
    Then user receive valid list status code 200

  @negative
  Scenario: Failed get list of tags without app-id
    Given user set GET list API endpoint
    When user send GET LIST HTTP request without app-id
    Then user receive valid list status code 403

