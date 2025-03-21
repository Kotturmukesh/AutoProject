package com.ecommerce.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class CartPage {
	
	
    private WebDriver driver;
    private WebDriverWait wait;
    ExtentTest test;

    
    public CartPage(WebDriver driver,  ExtentTest test) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.test = test;
    }
    
    
    //subscription
    public void clickCartButt() {
		
		wait.until(ExpectedConditions.elementToBeClickable(Locators.cartbu)).click();
		
	}
    
    public void Scrol() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
   	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    
    public String getSubscriptionText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.subtext)).getText();
    }

    public void enterSubscriptionEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.subemail)).sendKeys(email);
    }

    public void clickSubscriptionButton() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.subcart)).click();
    }
    
    public boolean getSuccessText() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.succart));
    		Reports.generateReport(driver, test, Status.PASS, "You have been successfully subscribed!");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Failed to Subscribe"); 
		}
        return result;
    }
    
    
    
    
    
    
    
    
    
    
    
    //remove
    public void Fid() {
    	
     wait.until(ExpectedConditions.elementToBeClickable(Locators.productButton)).click();
   	 WebElement ee = driver.findElement(Locators.anyProduct);
   	 ee.click();
   	 WebElement e = driver.findElement(By.xpath("//button[@type='button']"));
   	 e.click();
   	 driver.navigate().refresh();
   	 
   	 
    }
    
    public void canceldemo() {
    	 wait.until(ExpectedConditions.elementToBeClickable(Locators.cancel)).click();
    }
    
    public boolean Clearcart() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.veri));
    		Reports.generateReport(driver, test, Status.PASS, "The Cart is Empty!");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Some Product is in cart"); 
		}
        return result;
    }
    
    
    
    
    
    
    
    
    
    
    
    //verify
    
    public void clickProButt() {
		
		wait.until(ExpectedConditions.elementToBeClickable(Locators.probu)).click();
		
	}
    
    public boolean getveriff() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.vv));
    		Reports.generateReport(driver, test, Status.PASS, "All Products are Visible!");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "All product is not visible"); 
		}
        return result;
    }
    
    
    
    public void enterSearchProductt(String productName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.searchh)).sendKeys(productName);
    }
    
    public void clickSearchButtonn() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.searchButon)).click();
    }
    
    public String getSeacrchh() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.searchp)).getText();
    }
    
    public void ClickAd() {
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.ad)).click();
    	WebElement w = driver.findElement(By.xpath("//button[@type='button']"));
    	w.click();
    	driver.navigate().refresh();
    }
    
    public String getTshirt() {
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Tshirt)).getText();
    }
    
    public void getSign() {
   	 wait.until(ExpectedConditions.elementToBeClickable(Locators.signn)).click();
   	 WebElement e = driver.findElement(By.name("email"));
   	 e.sendKeys("kotturmukesh@gmail.com");
   	WebElement ee = driver.findElement(By.name("password"));
  	 ee.sendKeys("Mukesh@2201");
  	 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //view Category
    public String getcat() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.cat)).getText();
    }
    
    public void Choosew() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.plus)).click();
        WebElement w = driver.findElement(By.xpath("//div[@id='Women']//a[contains(text(),'Dress')]"));
        w.click();
        
    }
    
    public boolean getct() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ms));
    		Reports.generateReport(driver, test, Status.PASS, " Navigated to WOMEN - DRESS PRODUCTS");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Failed to navigate"); 
		}
        return result;
    }
    
    
    public void Choose2() {
    	Actions actions = new Actions(driver);
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.plus2)).click();
    	actions.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
         //driver.findElement(By.xpath("//div[@id='Kids']//a[contains(text(),'Dress')]")).click();
    }
    
    
    public boolean getcte() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ls));
    		Reports.generateReport(driver, test, Status.PASS, " Navigated to MEN - TSHIRTS PRODUCTS");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Failed to navigate"); 
		}
        return result;
    }
    
    
    
    
    
    //Brand
    
    public String getbrand() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.br)).getText();
    }
    
    public void isBrand() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,500)");
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.polo)).click();;
    }
    
    
    
    public boolean getpolo() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.poloverify));
    		Reports.generateReport(driver, test, Status.PASS, " Navigated to BRAND - POLO PRODUCTS");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Failed to navigate"); 
		}
        return result;
        
    }
    
    
    public void isBrand2() {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(Locators.hm)).click();
    }
    
    public boolean gethm() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.hmverify));
    		Reports.generateReport(driver, test, Status.PASS, " Navigated to BRAND - H&M PRODUCTS");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Failed to navigate"); 
		}
        return result;
        
    }
    
    
   

}
