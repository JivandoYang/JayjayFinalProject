@web
@logout
Feature: logout

  @positive
  Scenario: User successfully logout
    Given user has login
    And user click logout
    Then user has logged out