
Feature: Booking an order

  @TC-1
Scenario: Verify user is able to select the lowest price item and able to checkout and complete the transaction process
     Given user logged into application with username "ravi.cs916@gmail.com" and password "test123"
     When User searched with keyword "printed" in the global search
    Then User select the "lowest" cost item
    And User adds selected item to cart
    Then User check out the cart and complete the transaction
    And User loggoff and close the browser