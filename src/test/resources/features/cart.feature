Feature: Cart Functionality

  @Subb
  Scenario: Verify Subscription in Cart page
    Given Launch the browser and Navigate to url "http://automationexercise.com"
    Then Verify that home page is visible successfully on cart page
    When Click Cart button on cart pagee
    And scroll down to footerr
    Then Verify text SUBSCRIPTION in cart page
    And Enter email address in input and click arrow button in cart page
    Then Verify that You have been successfully subscribed! is visible in cart page
    
    
  @Remove
  Scenario: Remove Products From Cart
    Given Launch the browser and Navigate to url "http://automationexercise.com"
    Then Verify that home page is visible successfully on cart page
    And Add product to cart
    When Click Cart button on cart pagee
    Then Verify that cart page is displayed
    And Click X button corresponding to particular product
    Then Verify message Cart is empty!
    
    
    
   @Verify
   Scenario: Product Verify Login
    Given Launch the browser and Navigate to url "http://automationexercise.com"
    Then Verify that home page is visible successfully on cart page
    When Click Product button on cart pageee
    Then Verify message All Products
    Then Enter product name "v-neck" in search input and click search buttonn
    Then Verify message Searched Products
    And Add product to cartt
    When Click Cart button on cart pagee
    Then Verify msg V-Neck
    And Click on Signup Login button for loginn
    When Click Cart button on cart pagee
    Then Verify msg V-Neck
    And Click X button corresponding to particular product
    Then Verify message Cart is empty!
    
    
    
   @ViewCategory
   Scenario: View Category Products
   Given Launch the browser and Navigate to url "http://automationexercise.com"
   Then Verify that home page is visible successfully on cart page
   Then Verify message Category
   And Click on Women Category and then click Dress
   Then Verify message WOMEN - DRESS PRODUCTS
   And Click on Men Category
   Then Verify message MEN - TSHIRTS PRODUCTS
   
   
   
   @BrandProducts
   Scenario: View Category Products
   Given Launch the browser and Navigate to url "http://automationexercise.com"
   Then Verify that home page is visible successfully on cart page
   When Click Product button on cart pageee
   Then Verify message Brands
   And Click on Any Brand
   Then Verify msg BRAND - POLO PRODUCTS
   And Click on Another Brand
   Then Verify msg BRAND - H&M PRODUCTS
   
    