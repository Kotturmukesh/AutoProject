package com.ecommerce.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ecommerce.utility.Reports;

import objectrepo.Locators;

public class CheckoutPage {
	
    private WebDriver driver;
    private WebDriverWait wait;
    ExtentTest test;
    
    public CheckoutPage(WebDriver driver,  ExtentTest test) {
    	 this.driver = driver;
         this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         this.test = test;
    }
    
    
    
    public void clickCartSignupButton() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.cartsignupbutton)).click();
    }
    
    public void enterEmaill(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.loginEmaill)).sendKeys(email);
    }

    public void enterPasswordd(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.loginPasswordd)).sendKeys(password);
    }
    public void clickLoginButtonn() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.loginButtonn)).click();
    }
    
    public boolean isLoggedInAsUsernameVisiblee() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.loggedInAsUsernamee));
    		Reports.generateReport(driver, test, Status.PASS, "Login is Sucess");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Login is failure"); 
		}
        return result;
    	
    }
    
    
    public void clickAddToCartRe() {
    	driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.addToCartcheck)).click();
        driver.navigate().refresh();
    }
    
    
    public void clickCartSignupcheck() {
    	driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.carttcheckk)).click();
    }
    
    public boolean ischeckquantity() {
    	driver.navigate().refresh();
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.checkkcart));
    		Reports.generateReport(driver, test, Status.PASS, "The product is displayed in cartpage");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, " product is not visible"); 
		}
        return result;
    }
    
    public void clickproceed() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.proceed)).click();
    }
    
    
    public boolean ischeckdetail() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.detaill));
    		Reports.generateReport(driver, test, Status.PASS, "Delivery Address details - Mukesh is visible");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "mukesh is not visible"); 
		}
        return result;
    }
    
    public void Detailmessage() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.reviewmessagee)).sendKeys("Nice producttttt");
        WebElement w = driver.findElement(By.xpath("//a[@href='/payment']"));
        w.click();
    }
    
    
    public void DetailsCard() {
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.cardname)).sendKeys("Mukesh Kottur");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.cardno)).sendKeys("1234567891234856");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.cvc)).sendKeys("665");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.cardmonth)).sendKeys("12");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.cardyear)).sendKeys("2035");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.cardsubmit)).click();;
    }
    
    
    public boolean ischeckdeta() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.orderpla));
    		Reports.generateReport(driver, test, Status.PASS, "Congratulations! Your order has been confirmed!");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "not confirmed"); 
		}
        return result;
    }
    
    
    
    
    
    
    
    
    
    
    
    //Registercheckkkk
    
   public void signnameemail() {
	   wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.signname)).sendKeys("mukeeee");
	   wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.signemail)).sendKeys("kkgsgdmjmbjff@gmail.com");
   }
    
    
    
    public void entersubmitt() {
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.signButton)).click();
    	 wait.until(ExpectedConditions.elementToBeClickable(Locators.gender1)).click();
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.pass1)).sendKeys("Mukesh@20");
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.date1)).sendKeys("22");
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.month1)).sendKeys("March");
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.year1)).sendKeys("2000");
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.pass1)).sendKeys("Mukesh@220");
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.letter1)).click();
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.letter21)).click();
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.firstname1)).sendKeys("Mukeshh");
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.lastname1)).sendKeys("Kotturr");
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.street1)).sendKeys("Hamalwadii");
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.state1)).sendKeys("Telangana");
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.city1)).sendKeys("NZB");
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.pin1)).sendKeys("503002");
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.mobile1)).sendKeys("7893546125");
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.create1)).click();
     	wait.until(ExpectedConditions.elementToBeClickable(Locators.con1)).click();
     	
    	 
    }
    
    public void deldel() {
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.delete1)).click();
    }
    
    
    
    
    public boolean isdeldel() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.delver));
    		Reports.generateReport(driver, test, Status.PASS, "Account deleted");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Account not deleted"); 
		}
        return result;
    }
    
    public void conver() {
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.condel)).click();
    }
    
    
    
    public boolean ischdetail() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.billl));
    		Reports.generateReport(driver, test, Status.PASS, "Billing Address details - Mukesh is visible");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "mukesh is not visible"); 
		}
        return result;
    }
    
    
    
    //invoice
    public void downloadd() {
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.invoice)).click();

    	
    }
    
    public boolean ischail() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.invoice));
    		Reports.generateReport(driver, test, Status.PASS, "Downloaded invoice");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "not downloadded"); 
		}
        return result;
    }
    
    
   
}
