Feature: Search and Place the order for Products

@PlaceOrder
Scenario Outline: Search a product and add into cart

Given User is on GreenCart Landing page
When user searched with Shortname <Name> and extracted actual name of product
Then select quantity as <Quantiy> for the item and add into the cart
Then user proceeds to chekout and validate the <Name> item in checkout page
And verify user has ability to enter promo code and place the order


Examples:
|Name|Quantiy|
|Tom|3|

