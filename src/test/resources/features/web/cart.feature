@web
@cart
Feature: Cart

  # Pasti gagal
  @negative
  Scenario: User place order with empty cart
    Given user is on cart page
    When user clicks place order button
    Then user should see purchase alert with "The cart is empty."

  @positive
  Scenario: User place order with valid data
    Given a product is added to cart
    And user is on cart page
    When user clicks place order button
    And user inputs name "Jivando"
    And user inputs country "Indonesia"
    And user inputs city "Pekanbaru"
    And user inputs credit card "271653477064"
    And user inputs month "06"
    And user inputs year "2025"
    And user clicks purchase button
    Then user should see successful purchase popup

  @negative
  Scenario: User place order without name
    Given a product is added to cart
    And user is on cart page
    When user clicks place order button
    And user inputs name ""
    And user inputs country "Indonesia"
    And user inputs city "Pekanbaru"
    And user inputs credit card "271653477064"
    And user inputs month "06"
    And user inputs year "2025"
    And user clicks purchase button
    Then user should see purchase alert with "Please fill out Name and Creditcard."

  @negative
  Scenario: User place order without credit card
    Given a product is added to cart
    And user is on cart page
    When user clicks place order button
    And user inputs name "Jivando"
    And user inputs country "Indonesia"
    And user inputs city "Pekanbaru"
    And user inputs credit card ""
    And user inputs month "06"
    And user inputs year "2025"
    And user clicks purchase button
    Then user should see purchase alert with "Please fill out Name and Creditcard."

  @negative
  Scenario: User place order without filling form
    Given a product is added to cart
    And user is on cart page
    When user clicks place order button
    And user inputs name ""
    And user inputs country ""
    And user inputs city ""
    And user inputs credit card ""
    And user inputs month ""
    And user inputs year ""
    And user clicks purchase button
    Then user should see purchase alert with "Please fill out Name and Creditcard."
