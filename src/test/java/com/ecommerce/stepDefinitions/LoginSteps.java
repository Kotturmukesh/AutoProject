package com.ecommerce.stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.ecommerce.pages.CheckoutPage;
import com.ecommerce.pages.HomePage;
import com.ecommerce.pages.LoginPage;
import com.ecommerce.pages.SearchPage;
import com.ecommerce.utility.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends Base{

	WebDriver driver = Base.driver;
    //private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private SearchPage searchPage;
    private CheckoutPage checkoutPage;
    ExtentTest test = Hooks.test;

    @Given("Launch the browser for login")
    public void launchTheBrowser() {
       // WebDriverManager.chromedriver().setup();
       // base.driver = new ChromeDriver();
       // base.driver.manage().window().maximize();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver, test);
        searchPage = new SearchPage(driver, test);
        checkoutPage = new CheckoutPage(driver, test);
    }

    @When("Navigate to url {string} for login")
    public void navigateToUrl(String url) {
        driver.get(url);
    }

    @Then("Verify that home page is visible successfully for login")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://automationexercise.com/");
    }

    @And("Click on Signup Login button for login")
    public void clickOnSignupLoginButton() {
        homePage.clickSignupLoginButton();
    }
    
    @And("Click on Signup Login button for loginnnn")
    public void clickOnSignupLoginButtonnn() throws InterruptedException {
        loginPage.Userrlog();
    }

    @Then("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        Assert.assertTrue(loginPage.isLoginToYourAccountVisible());
    }

    @Then("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
        loginPage.enterEmail("kotturmukesh2201@gmail.com"); 
        loginPage.enterPassword("Mukesh@2201"); 
    }

    @Then("Click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(loginPage.isLoggedInAsUsernameVisible());
    }

    @Then("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        loginPage.enterEmail("invalgfddsfgh@example.com");
        loginPage.enterPassword("wrongpassword");
    }

    @Then("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertTrue(loginPage.isIncorrectLoginErrorVisible());
    }

    @Then("Click Logout button")
    public void clickLogoutButton() {
        loginPage.clickLogoutButton();
    }

    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        Assert.assertTrue(loginPage.isLoginToYourAccountVisible());
    }

    @Then("Enter name and already registered email address")
    public void enter_name_and_already_registered_email_address() {
    	loginPage.enterNewUserName("mukesh");
        loginPage.enterNewUserEmail("kotturmukesh2201@gmail.com");
    }
    
    
    @Then("Click Signup button")
    public void clickSignupButton() {
        loginPage.clickSignupButton();
    }

    @Then("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        Assert.assertTrue(loginPage.isNewUserSignupVisible());
    }
    
   

    @Then("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        Assert.assertTrue(loginPage.isEmailAlreadyExistErrorVisible());
        System.out.println("Email already exsist");
    }
    
    
    
    
    
    
    @Then("Verify User Signup! is visible")
    public void verifyUserSignupIsVisible() {
        Assert.assertTrue(loginPage.isUserSignupVisible());
    }
    
    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
    	loginPage.enterUserName("mukesh");
        loginPage.enterUserEmail("kotm@gmail.com");
    }

    
    
    @Then("Click UserSignup button")
    public void clickUserSignupButton() {
        loginPage.clickUserSignupButton();
    }
    
    @Then("Enter all details")
    public void detailsdemo() {
    	
    	loginPage.Userdetails();
    	
    	
    	
    }
    
    
    
    
    
    
    
    
    @And("Click on Contact Us button")
    public void clickcontact() {
        homePage.clickContactUsButton();
    }
    
    @And("Enter Details and Submit")
    public void detailsss() {
    	 Assert.assertTrue(loginPage.ContactDemoo());
        loginPage.ContactDetails();
    }
    
    
/*    @Then("Verify Success message")
   public void verifyDemm() {
   	
  	Assert.assertTrue(loginPage.Succcc());
    		
   }*/
    
    
    @Then("Return Home and Validate Home Page")
    public void verifyDemmoo() {
    	
    	Assert.assertTrue(loginPage.ContactDemo());
    		
    }

   
    
    
    
    
    
    
    
    
    
    //testcase
    
    @Then("Verify that home page is visible successfully")
    public void Validatehomeeee() {
        Assert.assertTrue(loginPage.Testhomee());
    }
    
    
    
    @And("Click on Testcase")
    public void dilsss() {
        loginPage.navigateee();
    }
    
    @Then("Verify Testcase Page")
    public void TestcaseCheck() {
        Assert.assertTrue(loginPage.LastDemo());
    }
    
    
    
    
    
    
    //SubHome
    
    @Then("Perform Scroll and Verify Subscription")
    public void Scrooll() {
        Assert.assertTrue(loginPage.subdemoo());
    }
    
    @And("Enter Email and Submit")
    public void checkall() {
        loginPage.SubHomee();
    }
    
    @Then("See success subcribe")
    public void finall() {
        Assert.assertTrue(loginPage.suballlll());
    }
    
    
}