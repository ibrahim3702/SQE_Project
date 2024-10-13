Feature: Shopping Cart Functionality

  Scenario: Add Product to Cart
    Given I am on a product details page for "Laptop"
    When I click the "Add to Cart" button
    Then the product should be added to the cart

  Scenario: Checkout Cart
    Given I have the following products in my cart
      | Product | Quantity |
      | Laptop  | 1        |
      | Phone   | 2        |
    When I proceed to checkout
    And I confirm the purchase
    Then I should see a confirmation message "Thank you for your purchase!"