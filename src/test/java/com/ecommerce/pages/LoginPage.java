package com.ecommerce.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ecommerce.utility.Reports;

import objectrepo.Locators;


import java.time.Duration;

public class LoginPage {

	
	
    private WebDriver driver;
    private WebDriverWait wait;

    ExtentTest test;
    
    public LoginPage(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.test = test;
    }

    //  Login to your account
    public boolean isLoginToYourAccountVisible() {
    	
    		return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.loginToYourAccountText)).isDisplayed();
    		
		
    }

    public void enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.loginEmail)).sendKeys(email);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.loginPassword)).sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.loginButton)).click();
    }
    
    
    
    
    
    public void Userrlog() throws InterruptedException {
    	Thread.sleep(5000);
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.userlogin)).click();
    }
    
    
    
    
    
    

    public boolean isIncorrectLoginErrorVisible() {
    	
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.incorrectLoginError));
    		Reports.generateReport(driver, test, Status.PASS, "email or password is incorrect!");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Login is Sucess"); 
		}
        return result;
    }

    public boolean isLoggedInAsUsernameVisible() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.loggedInAsUsername));
    		Reports.generateReport(driver, test, Status.PASS, "Login is Sucess");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Login is failure"); 
		}
        return result;
    	
    }

    public void clickLogoutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.logoutButton)).click();
    }

    // New User
    public boolean isNewUserSignupVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.newUserSignupText)).isDisplayed();
    }

    public void enterNewUserName(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.newUserName)).sendKeys(name);
    }

    public void enterNewUserEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.newUserEmail)).sendKeys(email);
    }

    public void clickSignupButton() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.signupButton)).click();
    }
    
    
    
    //user
    
    public boolean isUserSignupVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.UserSignupText)).isDisplayed();
    }

    public void enterUserName(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.UserName)).sendKeys(name);
    }

    public void enterUserEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.UserEmail)).sendKeys(email);
    }

    public void clickUserSignupButton() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.usersignupButton)).click();
    }
    
    

    public boolean isEmailAlreadyExistErrorVisible() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.emailAlreadyExistError));
    		Reports.generateReport(driver, test, Status.PASS, "Email Address already exist! is visible ");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Enter Details"); 
		}
        return result;
    }
    

    
    
    
    public void Userdetails() {
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.gender)).click();
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.pass)).sendKeys("Mukesh@220");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.date)).sendKeys("22");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.month)).sendKeys("March");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.year)).sendKeys("2000");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.pass)).sendKeys("Mukesh@220");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.letter)).click();
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.letter2)).click();
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.firstname)).sendKeys("Mukeshh");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.lastname)).sendKeys("Kotturr");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.street)).sendKeys("Hamalwadii");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.state)).sendKeys("Telangana");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.city)).sendKeys("NZB");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.pin)).sendKeys("503002");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.mobile)).sendKeys("7893546125");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.create)).click();;
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.con)).click();
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.delete)).click();
    	
    	
    }
    
    
    
    
    
    //contact
    
    public boolean ContactDemoo() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.verifyy)).isDisplayed();
        
        
    }
    
    
    
    public void ContactDetails() {
    	//Actions ac = new Actions(driver);
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.Contactus)).click();
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.name)).sendKeys("Mukesh");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.emaill)).sendKeys("kotturmukesh@gmail.com");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.subject)).sendKeys("detailsss");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.messagee)).sendKeys("allll detailssssfdf fd fd");
    	
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.uploadd)).sendKeys("C:\\Users\\Administrator\\Downloads\\image (1).png");
    	//ac.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
    	//ac.sendKeys("C:\\Users\\Administrator\\Downloads\\image (1).png").keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
    	//driver.findElement(By.xpath("//input[@name='upload_file']")).sendKeys("C:\\\\Users\\\\Administrator\\\\Downloads\\\\image (1).png");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.submitt)).click();
    	wait.until(ExpectedConditions.alertIsPresent());
    	driver.switchTo().alert().accept();
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.done)).click();
    	
    	
    	
    	
    	
    }
    
   // public boolean Succcc() {
   //     return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.successs)).isDisplayed();
   //     
   // }
    
    public boolean ContactDemo() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.verifyyy));
    		Reports.generateReport(driver, test, Status.PASS, "Home Page is visible");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Home page is not visible"); 
		}
        return result;
        
    }
    

    
    
    
    
    
    //testcase
    public boolean Testhomee() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.testhome)).isDisplayed();
        
    }
    
    public void navigateee() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.testclick)).click();
    }
    
    
    public boolean LastDemo() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.lastverify));
    		Reports.generateReport(driver, test, Status.PASS, "Test Page is visible ");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Test Page is not visible "); 
		}
        return result;
        
    }
    
    
    
    //sub
    
    public boolean subdemoo() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.checkdemo)).isDisplayed();
        
    }
    
    
    public void SubHomee() {
    	WebElement e = driver.findElement(By.id("susbscribe_email"));
    	Actions ac = new Actions(driver);
    	ac.moveToElement(e).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.subemail)).sendKeys("kottur@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.subbutton)).click();
    }
    
    
    
    public boolean suballlll() {
    	boolean actResult = true;
    	try {
    		
    	    wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.subfinal));
    		Reports.generateReport(driver, test, Status.PASS, "sucess page is visible");
		} catch (TimeoutException te) {
			actResult = false;
			Reports.generateReport(driver, test, Status.FAIL, "sucess page is not visible"); 
    	
       
        
    }
    	 return actResult;
   
}
}