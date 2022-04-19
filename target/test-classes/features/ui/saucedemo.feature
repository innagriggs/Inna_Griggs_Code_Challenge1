Feature: SauceDemo

  @login
  Scenario: Login
  User should be able to log in with valid credentials
    Given User is on the login page
    When User enters valid  "standard_user" and "secret_sauce"
    And User clicks on Sign In button
    Then Page title should be as expected

  @sort
  Scenario: Sort the Items by the price
  User should be able to sort the products price low to high
    Given User is on the products page
    When User clicks on sort dropdown
    And User select price low to high
    Then Products price should be sorted low to high

  @addItems
  Scenario: Add items to the cart
  User should be able to add the items to the cart
    Given User adds one item to the cart
    And User adds second item to the cart
    Then 2 items should be in the cart

  @removeItem
  Scenario: User removes an item from the cart
    User should be able to remove an item and add a new item after it
    Given User is on the Shopping Cart page
    When User removes an item from the cart
    Then User adds one more item to the cart

  @checkOut
  Scenario: User should be able to checkout successfully
    Given User is on Shopping Cart page
    When User clicks on checkout button
    And User enters first name and last name and zipcode
    And User clicks on continue button
    And User clicks on the finish button
    Then User should be able to see confirmation message
