@web
@home
Feature: Home

  Scenario: User can view product details
    Given user is on home page
    When user clicks product "Samsung galaxy s6"
    Then user is redirected to product "Samsung galaxy s6" page