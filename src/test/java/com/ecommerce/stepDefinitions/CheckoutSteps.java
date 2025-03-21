package com.ecommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.ecommerce.pages.CartPage;
import com.ecommerce.pages.CheckoutPage;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.LoginPage;
import com.ecommerce.pages.SearchPage;
import com.ecommerce.utility.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CheckoutSteps {
	WebDriver driver =Base.driver;
    private HomePage homePage;
    private CartPage cartPage;
	private SearchPage searchPage;
	private LoginPage loginpage;
	private CheckoutPage checkoutPage;
	ExtentTest test = Hooks.test;
	
	
	 @Given("Launch the browser and Navigate to url {string} for checkout")
	    public void launchTheBrowserAndNavigateToUrl(String url) {
		 driver.get(url);
		 
		 	loginpage = new LoginPage(driver, test);
	        homePage = new HomePage(driver);
	        searchPage = new SearchPage(driver, test);
	        cartPage = new CartPage(driver, test);
	        checkoutPage = new CheckoutPage(driver, test);
	 }
	 
	 
	 
	 @And("Click on Signup Loginn button for login")
	 public void Butto() {
		 checkoutPage.clickCartSignupButton();
	 }
	 
	 
	 
	 @Then("Enter correct email address and passwordd")
	    public void enterCorrectEmailAddressAndPassword() {
	        checkoutPage.enterEmaill("kotturmukesh2201@gmail.com"); 
	        checkoutPage.enterPasswordd("Mukesh@2201"); 
	    }
	 
	 @Then("Click login buttonn")
	    public void clickLogButtonn() {
	        checkoutPage.clickLoginButtonn();
	    }
	 
	 
	 @Then("Verify that Logged in as username is visiblee")
	    public void verifyoggedInAsUsernameIsVisible() {
	        Assert.assertTrue(checkoutPage.isLoggedInAsUsernameVisiblee());
	    }
	 
	 
	 @Then("Click on 'Add To Cart' on Recommended productt")
	    public void clickOnAddToCartO() {
	        checkoutPage.clickAddToCartRe();
	    }
	 
	 
	 @And("Click Cart buttonn on cart pagee")
	 public void clll() {
		 checkoutPage.clickCartSignupcheck();
	 }
	 
	 @Then("Verify that product is displayed in cart pageee")
	    public void verify_that_product_is_displayed_in_cart_pageee() {
	    	Assert.assertTrue(checkoutPage.ischeckquantity());
	    }

	 @And("Click on Proceed to checkout")
	 public void procee() {
		 checkoutPage.clickproceed();
	 }
	 
	 
	 
	 @Then("Verify the delivery address details")
	 public void detailadd() {
		 Assert.assertTrue(checkoutPage.ischeckdetail());
	 }
	 
	 @And("Write Review and click on place order")
	 public void place() {
		 checkoutPage.Detailmessage();
	 }
	 
	 @And("Enter all card details and pay")
	 public void cardd() {
		 checkoutPage.DetailsCard();
	 }
	 
	 @Then("Verify the order placed")
	 public void orderplace() {
		 Assert.assertTrue(checkoutPage.ischeckdeta());
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //RegisterrCheckk
	 
	 @And("Click signnupp button")
	 public void ne() {
		 checkoutPage.signnameemail();
	 }
	 
	 @And("Enter detailsss")
	 public void ttdetails() {
		 checkoutPage.entersubmitt();
	 }
	 
	 
	 @And("Click deletee button")
	 public void deletedetail() {
		 checkoutPage.deldel();
	 }
	 @Then("Verify the account is deleted")
	 public void vverifyy() {
		 Assert.assertTrue(checkoutPage.isdeldel());
		 checkoutPage.conver();
	 }
	 
	 @Then("Verify the billing address details")
	 public void detailadddd() {
		 Assert.assertTrue(checkoutPage.ischdetail());
	 }
	 

	 
	 
	 
	 
	 //invoice
	 
	 @And("Click download invoice")
	 public void soenload() {
		 checkoutPage.downloadd();
		 Assert.assertTrue(checkoutPage.ischail());
	 }
	 
	 
	 
}
