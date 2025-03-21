package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By signupLoginButton = By.xpath("//a[normalize-space()='Signup / Login']");
    
    private By contactUsButton = By.xpath("//a[normalize-space()='Contact us']");
   
    
    private By productsButton = By.cssSelector("a[href='/products']");
    private By cartButton = By.cssSelector("a[href='/view_cart']");
    
    
    
    private By homeButton = By.cssSelector("a[href='/']");
    private By arrowUpButton = By.id("scrollUp");
    
    
    
    


    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Initialize WebDriverWait
    }

    // Methods
    public void clickSignupLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signupLoginButton)).click();
    }
    
    
    public void clickContactUsButton() {
        wait.until(ExpectedConditions.elementToBeClickable(contactUsButton)).click();
    } 

    public void clickProductsButton() {
        wait.until(ExpectedConditions.elementToBeClickable(productsButton)).click();
    }
    
    public void clickHomeButton() {
        wait.until(ExpectedConditions.elementToBeClickable(homeButton)).click();
    }

    public void clickArrowUpButton() {
        wait.until(ExpectedConditions.elementToBeClickable(arrowUpButton)).click();
    }

	public void clickcartButton() {
		
		wait.until(ExpectedConditions.elementToBeClickable(cartButton)).click();
		
	}

   
}