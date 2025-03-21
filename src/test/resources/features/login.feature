Feature: Login Functionality

  @NewUser
  Scenario: Register User
    Given Launch the browser for login
    When Navigate to url "http://automationexercise.com" for login
    Then Verify that home page is visible successfully for login
    And Click on Signup Login button for login
    Then Enter name and email address
    And Click Signup button
    Then Enter all details


    
  @IncorrectLogin
  Scenario: Login User with incorrect email and password
    Given Launch the browser for login
    When Navigate to url "http://automationexercise.com" for login
    Then Verify that home page is visible successfully for login
    And Click on Signup Login button for login
    And Enter incorrect email address and password
    And Click login button
    Then Verify error Your email or password is incorrect! is visible
    
  @User
  Scenario: Register User with existing email
    Given Launch the browser for login
    When Navigate to url "http://automationexercise.com" for login
    Then Verify that home page is visible successfully for login
    And Click on Signup Login button for loginnnn
    And Enter name and already registered email address
    And Click Signup button
    Then Verify error Email Address already exist! is visible  
    
        
  @Login
  Scenario: Login User with correct email and password
    Given Launch the browser for login
    When Navigate to url "http://automationexercise.com" for login
    Then Verify that home page is visible successfully for login
    And Click on Signup Login button for login
    And Enter correct email address and password
    And Click login button
    Then Verify that Logged in as username is visible
    
  @Logout
  Scenario: Logout User
    Given Launch the browser for login
    When Navigate to url "http://automationexercise.com" for login
    Then Verify that home page is visible successfully for login
    And Click on Signup Login button for login
    And Enter correct email address and password
    And Click login button
    Then Verify that Logged in as username is visible
    And Click Logout button
    Then Verify that user is navigated to login page



    
    
  @Contact
  Scenario: Contact Us
  Given Launch the browser for login
  When Navigate to url "http://automationexercise.com" for login
  Then Verify that home page is visible successfully for login
  And Click on Contact Us button
  And Enter Details and Submit
 # Then Verify Success message
  Then Return Home and Validate Home Page



	@TestCases
	Scenario: TestCases
  Given Launch the browser for login
  When Navigate to url "http://automationexercise.com" for login
  Then Verify that home page is visible successfully
  And Click on Testcase
  Then Verify Testcase Page
	
  
  @Sub
	Scenario: Subscribeee
  Given Launch the browser for login
  When Navigate to url "http://automationexercise.com" for login
  Then Verify that home page is visible successfully
  Then Perform Scroll and Verify Subscription
  And Enter Email and Submit
  Then See success subcribe
  
  
  