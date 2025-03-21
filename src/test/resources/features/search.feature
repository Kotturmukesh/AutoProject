Feature: Search Functionality

  @Search
  Scenario: Verify Search Product
    Given Launch the browser and Navigate to url "http://automationexercise.com" for product search
    Then Verify that home page is visible successfully for product search
    When Click on 'Products' button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then Enter product name "shirts" in search input and click search button
    Then Verify 'SEARCHED PRODUCTS' is visible
    Then Verify all the products related to search are visible

  @VerifyAll
  Scenario: Verify All Products and product detail page
    Given Launch the browser and Navigate to url "http://automationexercise.com" for product search
    Then Verify that home page is visible successfully for product search
    When Click on 'Products' button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then Enter product name "shirts" in search input and click search button
    Then Verify 'SEARCHED PRODUCTS' is visible
    Then Verify all the products related to search are visible
    Then Click on 'View Product' of first product
    Then Verify that all details visible

    
   @quantity
  Scenario: Verify Product quantity in Cart
    Given Launch the browser and Navigate to url "http://automationexercise.com" for product search
    Then Verify that home page is visible successfully for product search
    When Click on 'Products' button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then Enter product name "shirts" in search input and click search button
    Then Verify 'SEARCHED PRODUCTS' is visible
    Then Verify all the products related to search are visible
    Then Click on 'View Product' of first product
    Then Verify product detail is opened
    And Increase quantity to "4"
    And Click 'Add to cart' button from search
    And Click Cart button on cart page
    Then Verify that product is displayed in cart page with exact quantity
    
    
    
   @Recommend
  Scenario: Add to cart from Recommended items
    Given Launch the browser and Navigate to url "http://automationexercise.com" for product search
    Then Verify that home page is visible successfully for product search
    And scroll down to footer
    Then Verify text are visible 'RECOMMENDED ITEMS'
    And Click on 'Add To Cart' on Recommended product
    And Click Cart button on cart page
    Then Verify that product is displayed in cart page
    
    
    
    
   @ProductInCart
   Scenario: Verify All Products and product detail page
    Given Launch the browser and Navigate to url "http://automationexercise.com" for product search
    Then Verify that home page is visible successfully for product search
    When Click on 'Products' button
    Then Select first product and click 'Add To Cart'
    And Click 'Continue Shopping' button
    And Select second product and click 'Add To Cart'
    And Click Cart button on cart page   
    Then Verify both products are added to cart
    Then Verify their details
    
    
    
    
    
    
    @Review
    Scenario: Add review on product
    Given Launch the browser and Navigate to url "http://automationexercise.com" for product search
    Then Verify that home page is visible successfully for product search
    When Click on 'Products' button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then Enter product name "shirt" in search input and click search button
    Then Verify 'SEARCHED PRODUCTS' is visible
    Then Verify all the products related to search are visible
    Then Click on 'View Product' of first product
    Then Verify 'Write Your Review' is visible
    And Enter name, email and review
    And Click 'Submit' button for review
    Then Verify success message 'Thank you for your review.'
    
    
    
    
   @UseArrow
  Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    Given Launch the browser and Navigate to url "http://automationexercise.com" for product search
    Then Verify that home page is visible successfully for product search
    And scroll down page to bottom
    Then Verify txt is visible 'SUBSCRIPTION'
    Then Click on arrow at bottom right side to move upward
    Then Verify that page is scrolled up 

  @WithoutArrow
  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Given Launch the browser and Navigate to url "http://automationexercise.com" for product search
    Then Verify that home page is visible successfully for product search
    And scroll down page to bottom
    Then Verify txt is visible 'SUBSCRIPTION'
    And scroll up page to top
    Then Verify that page is scrolled up