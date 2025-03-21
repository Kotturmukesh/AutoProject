package com.ecommerce.stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.LoginPage;
import com.ecommerce.pages.SearchPage;
import com.ecommerce.utility.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class SearchSteps extends Base{
	
	WebDriver driver =Base.driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private SearchPage searchPage;
    ExtentTest test = Hooks.test;

    @Given("Launch the browser and Navigate to url {string} for product search")
    public void launchTheBrowserAndNavigateToUrl(String url) {
       // WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
    	driver.get(url);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver, test);
		searchPage = new SearchPage(driver, test);
    }

    @Then("Verify that home page is visible successfully for product search")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://automationexercise.com/");
    }

    @When("Click on 'Products' button")
    public void clickOnProductsButton() {
        homePage.clickProductsButton();
    }

    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://automationexercise.com/products");
    }

    @Then("Enter product name {string} in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton(String productName) {
        searchPage.enterSearchProduct(productName);
        searchPage.clickSearchButton();
    }

    @Then("Verify 'SEARCHED PRODUCTS' is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        Assert.assertTrue(searchPage.isSearchedProductsVisible());
    }
    

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        Assert.assertTrue(searchPage.getProductListCount() > 0);

    }
    
    
    
    
    
    
    
    
    //verifyall

    @Then("Click on 'View Product' of first product")
    public void clickOnViewProductOfFirstProduct() {
        searchPage.clickViewProduct();
    }

    @Then("Verify that all details visible")
    public void verifyProductDetailsAreVisible() {
        Assert.assertTrue(searchPage.getProductName() != null);
        Assert.assertTrue(searchPage.getCategory() != null);
        Assert.assertTrue(searchPage.getPrice() != null);
        Assert.assertTrue(searchPage.getAvailability() != null);
        Assert.assertTrue(searchPage.getCondition() != null);
        Assert.assertTrue(searchPage.getBrand() != null);
    }
    
    
    
    
    
    
    
    
    
    
    
    //quantity

    @Then("Increase quantity to {string}")
    public void increaseQuantityTo(String quantity) {
        searchPage.clearQuantity();
        searchPage.enterQuantity(quantity);
    }

    @Then("Click 'Add to cart' button from search")
    public void clickAddToCartButton() {
        searchPage.clickAddToCartButton();
    }



    @Then("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
    	 Assert.assertTrue(searchPage.getAvailability2() != null);
    }
    
    @Then("Click Cart button on cart page")
    public void click_cart_button_on_cart_page() {
        //homePage.clickcartButton();
    	searchPage.clickcartShoppingButton();
    }
    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
    	Assert.assertTrue(searchPage.getquantityCount());
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    

    //recommend
    @Then("scroll down to footer")
    public void scroll_down_to_footer() {
        searchPage.scrollToBottom();
    }
    
    @Then("Verify text are visible {string}")
    public void verify_are_visible(String string) {
    	Assert.assertTrue(searchPage.isRecommended());
    }
    
    @Then("Click on 'Add To Cart' on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {
        searchPage.clickAddToCartRecommended();
    }
    
    @Then("Verify that product is displayed in cart page")
    public void verify_that_product_is_displayed_in_cart_page() {
    	Assert.assertTrue(searchPage.iscartquantity());
    }
    
    
    
    
    
    
    //productcart
    @Then("Select first product and click 'Add To Cart'")
    public void firstdemooo() {
        searchPage.Firsttt();
    }

    @Then("Click 'Continue Shopping' button")
    public void clickContinueShoppingButton() {
        searchPage.clickContinueShoppingButton();
    }
   
    @Then("Select second product and click 'Add To Cart'")
    public void seconddemooo() {
        searchPage.Seconddd();
    }
    
    @Then("Verify both products are added to cart")
    public void verify_both_products_are_added_to_cart() {
    	Assert.assertTrue(searchPage.verif());
       
    }
    @Then("Verify their details")
    public void verify_their_details() {
    	
    	Assert.assertTrue(searchPage.Price() != null);
    	Assert.assertTrue(searchPage.Pricedemoo() != null);
    	Assert.assertTrue(searchPage.Quantity() != null);
    	Assert.assertTrue(searchPage.Quantitydemo() != null);
    	Assert.assertTrue(searchPage.Total() != null);
    	Assert.assertTrue(searchPage.Totaldemo() != null);

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //review
    @Then("Verify 'Write Your Review' is visible")
    public void verifyWriteYourRewIsVisible() {
        Assert.assertTrue(searchPage.isWriteYourReviewVisible());
    }

    @Then("Enter name, email and review")
    public void enterNameEmailAndReview() {
        searchPage.enterReviewName("Mukesh"); 
        searchPage.enterReviewEmail("mukesh@gmail.com"); 
        searchPage.enterReview("This is a test review.");
    }

    @Then("Click 'Submit' button for review")
    public void clickSubmitButtonForReview() {
        searchPage.clickReviewSubmitButton();
    }

    @Then("Verify success message 'Thank you for your review.'")
    public void reviewww() {
    	Assert.assertTrue(searchPage.resultt());

    }
    
    
    
    
    
    
    
    
    
    
    
    //UseArrow
    @Then("scroll down page to bottom")
    public void scroll_down_page_to_bottom() {
        searchPage.scrollToBottom();
    }
    @Then("Verify txt is visible {string}")
    public void verify_is_vble(String string) {
        searchPage.getSubText();
    }
    
    @Then("Click on arrow at bottom right side to move upward")
    public void performm() {
        searchPage.clickArrowUpButton();
    }
    
    
    @Then("Verify that page is scrolled up")
    public void verify_that_page_is_scrolled_up() {
    	Assert.assertTrue(searchPage.Atuoo());

    }
    
    
    
    
    
    
    
    
    




    //Without
    @Then("scroll up page to top")
    public void scroll_up_page_to_top() {
    	searchPage.scrollToTop();
       
    }









   

   


}
