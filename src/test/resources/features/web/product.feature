@web
@product
Feature: Product

  Scenario: User can add product to cart
    Given user is on product page
    When user add to cart button
    Then product is added to cart