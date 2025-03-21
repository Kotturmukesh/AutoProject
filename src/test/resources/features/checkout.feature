Feature: Checkout Functionality

	@Logincheck
  Scenario: Place Order: Login before Checkout
  	Given Launch the browser and Navigate to url "http://automationexercise.com" for checkout
  	Then Verify that home page is visible successfully for login
  	And Click on Signup Loginn button for login
  	And Enter correct email address and passwordd
  	And Click login buttonn
  	Then Verify that Logged in as username is visiblee
		And Click on 'Add To Cart' on Recommended productt
		And Click Cart buttonn on cart pagee
		Then Verify that product is displayed in cart pageee
		And Click on Proceed to checkout
		Then Verify the delivery address details
		And Write Review and click on place order
		And Enter all card details and pay
		Then Verify the order placed
		
		
	@Registercheck
	 Scenario: Place Order: Login before Checkout
  	Given Launch the browser and Navigate to url "http://automationexercise.com" for checkout
  	Then Verify that home page is visible successfully for login
  	And Click on Signup Loginn button for login
  	And Click signnupp button
  	And Enter detailsss
  	Then Verify that Logged in as username is visiblee
  	And Click on 'Add To Cart' on Recommended productt
		And Click Cart buttonn on cart pagee
		Then Verify that product is displayed in cart pageee
		And Click on Proceed to checkout
		Then Verify the delivery address details
		And Write Review and click on place order
		And Enter all card details and pay
		Then Verify the order placed
		And Click deletee button
		Then Verify the account is deleted
		
		
	@Registerwhile
	Scenario: Place Order: Login before Checkout
  	Given Launch the browser and Navigate to url "http://automationexercise.com" for checkout
  	Then Verify that home page is visible successfully for login
  	And Click on 'Add To Cart' on Recommended productt
		And Click Cart buttonn on cart pagee
		Then Verify that product is displayed in cart pageee
		#And Click on Proceed to checkout
		And Click on Signup Loginn button for login
  	And Click signnupp button
  	And Enter detailsss
  	Then Verify that Logged in as username is visiblee
  	And Click Cart buttonn on cart pagee
  	And Click on Proceed to checkout
		Then Verify the delivery address details
		And Write Review and click on place order
		And Enter all card details and pay
		Then Verify the order placed
		And Click deletee button
		Then Verify the account is deleted
		
		
		
		
	@Verifyaddress
	Scenario: Place Order: Login before Checkout
  	Given Launch the browser and Navigate to url "http://automationexercise.com" for checkout
  	Then Verify that home page is visible successfully for login
  	And Click on Signup Loginn button for login
  	And Click signnupp button
  	And Enter detailsss
  	Then Verify that Logged in as username is visiblee
  	And Click on 'Add To Cart' on Recommended productt
		And Click Cart buttonn on cart pagee
		Then Verify that product is displayed in cart pageee
		And Click on Proceed to checkout
		Then Verify the delivery address details
		Then Verify the billing address details
		And Click deletee button
		Then Verify the account is deleted
		
		
	@invoice
	Scenario: Place Order: Login before Checkout
  	Given Launch the browser and Navigate to url "http://automationexercise.com" for checkout
  	Then Verify that home page is visible successfully for login
  	And Click on 'Add To Cart' on Recommended productt
		And Click Cart buttonn on cart pagee
		Then Verify that product is displayed in cart pageee
		And Click on Signup Loginn button for login
  	And Click signnupp button
  	And Enter detailsss
  	Then Verify that Logged in as username is visiblee
  	And Click Cart buttonn on cart pagee
  	And Click on Proceed to checkout
		Then Verify the delivery address details
		And Write Review and click on place order
		And Enter all card details and pay
		Then Verify the order placed
		And Click download invoice
		And Click deletee button
		Then Verify the account is deleted