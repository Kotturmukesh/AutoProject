package com.ecommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.ecommerce.pages.CartPage;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.LoginPage;
import com.ecommerce.pages.SearchPage;
import com.ecommerce.utility.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps extends Base{
	
	WebDriver driver =Base.driver;
    private HomePage homePage;
    private CartPage cartPage;
	private SearchPage searchPage;
	private LoginPage loginpage;
	ExtentTest test = Hooks.test;
	    
	    @Given("Launch the browser and Navigate to url {string}")
	    public void launchTheBrowserAndNavigateToUrl(String url) {
	       // WebDriverManager.chromedriver().setup();
//	        driver = new ChromeDriver();
//	        driver.manage().window().maximize();
	    	driver.get(url);
	        homePage = new HomePage(driver);
	        searchPage = new SearchPage(driver, test);
	        cartPage = new CartPage(driver, test);
	    }
	    
	    
	    @Then("Verify that home page is visible successfully on cart page")
	    public void verifyThatHomePageIsVisibleSuccessfully() {
	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertEquals(currentUrl, "https://automationexercise.com/");
	    }

	    @When("Click Cart button on cart pagee")
	    public void clickCartButton() {
	        cartPage.clickCartButt();
	    }
	    
	    @And("scroll down to footerr")
	    public void sc() {
	    	cartPage.Scrol();
	    }
	    
	    
	    @Then("Verify text SUBSCRIPTION in cart page")
	    public void verifyTextSUBSCRIPTION() {
	        String subscriptionText = cartPage.getSubscriptionText();
	        Assert.assertEquals(subscriptionText, "SUBSCRIPTION");
	        System.out.println(subscriptionText);
	    }

	    @Then("Enter email address in input and click arrow button in cart page")
	    public void emailvalid() {
	        
			cartPage.enterSubscriptionEmail("mukesh@gmail.com");
	        cartPage.clickSubscriptionButton();
	    }

	    @Then("Verify that You have been successfully subscribed! is visible in cart page")
	    public void sucessvalid() {
	    	Assert.assertTrue(cartPage.getSuccessText());
	    }

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //remove
	    
	    @And("Add product to cart")
	    public void selectt() {
	    	cartPage.Fid();
	    }
	    
	    
	    
	    @Then("Verify that cart page is displayed")
	    public void verifyThatCartPageIsDisplayed() {
	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertEquals(currentUrl, "https://automationexercise.com/view_cart");
	    }
	    
	    
	    @Then("Click X button corresponding to particular product")
	    public void click_x_button_corresponding_to_particular_product() {
	    	cartPage.canceldemo();
	    	
	    	
	    }
	       
	    @Then("Verify message Cart is empty!")
	    public void verifymsg() {
	    	Assert.assertTrue(cartPage.Clearcart());
	    }
	    
	    
	    
	    
	    
	    
	    
	    //verifylogin
	    
	    @When("Click Product button on cart pageee")
	    public void clickProducButton() {
	        cartPage.clickProButt();
	    }
	    
	    @Then("Verify message All Products")
	    public void verifyy() {
	    	Assert.assertTrue(cartPage.getveriff());
	    }
	    
	    @Then("Enter product name {string} in search input and click search buttonn")
	    public void enter_product_name_in_search_input_and_click_search_buttonn(String searchh) {
	    	cartPage.enterSearchProductt(searchh);
	    	cartPage.clickSearchButtonn();
	    	
	    }
	    
	    @Then("Verify message Searched Products")
	    public void verifysearch() {
	    	String csText = cartPage.getSeacrchh();
	        Assert.assertEquals(csText, "SEARCHED PRODUCTS");
	        System.out.println(csText);
	    }
	    
	    @And("Add product to cartt")
	    public void car() {
	    	cartPage.ClickAd();
	    }
	    
	    
	    @Then("Verify msg V-Neck")
	    public void verifyse() {
	    	String csText = cartPage.getTshirt();
	        Assert.assertEquals(csText, "Pure Cotton V-Neck T-Shirt");
	        System.out.println(csText);
	    }
	    
	    @And("Click on Signup Login button for loginn")
	    public void SignLog() {
	    	cartPage.getSign();
	    }
	    
	    
	    
	    
	    
	   
	    
	    
	    //view Category
	    @Then("Verify message Category")
	    public void verifse() {
	    	String ccText = cartPage.getcat();
	        Assert.assertEquals(ccText, "CATEGORY");
	        System.out.println(ccText);
	    }
	    
	    @And("Click on Women Category and then click Dress")
	    public void cattte() {
	    	cartPage.Choosew();
	    }
	    
	    @Then("Verify message WOMEN - DRESS PRODUCTS")
	    public void verie() {
	    	Assert.assertTrue(cartPage.getct());
	    }
	    
	    @And("Click on Men Category")
	    public void caatt2() {
	    	cartPage.Choose2();
	    }
	    
	    @Then("Verify message MEN - TSHIRTS PRODUCTS")
	    public void vee() {
	    	Assert.assertTrue(cartPage.getcte());
	    }
	    
	    
	    
	    
	    
	    
	    
	    //Brand
	    
	    @Then("Verify message Brands")
	    public void verse() {
	    	String bcText = cartPage.getbrand();
	        Assert.assertEquals(bcText, "BRANDS");
	        System.out.println(bcText);
	    }
	    
	    @And("Click on Any Brand")
	    public void Br() {
	    	cartPage.isBrand();
	    }
	    
	    @Then("Verify msg BRAND - POLO PRODUCTS")
	    public void vse() {
	    	Assert.assertTrue(cartPage.getpolo());
	    }
	    
	    @And("Click on Another Brand")
	    public void Br2() {
	    	cartPage.isBrand2();
	    }
	    
	    @Then("Verify msg BRAND - H&M PRODUCTS")
	    public void ve() {
	    	Assert.assertTrue(cartPage.gethm());	   
	    	}
	    
	    
	    
	   
}
