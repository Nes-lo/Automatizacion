Feature: Purchase
    As a registered user
    I want to add products
    To make a purchase

  Scenario: Purchase products from the shopping cart successfully
    Given Juan Perez is authenticated
    And add from laptops a MackBook air
    And add from Monitor an Apple monitor 24
    When  Juan makes the purchase
    Then should see the message thank you for your purchase



