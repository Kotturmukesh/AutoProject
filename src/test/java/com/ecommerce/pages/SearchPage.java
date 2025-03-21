package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import java.util.List;

public class SearchPage {
	
	private WebDriver driver;
    private WebDriverWait wait;

    ExtentTest test;

    
    
    
    public SearchPage(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.test = test;
    }

    
    
    
    // search
    public void enterSearchProduct(String productName) {
    	
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.searchInput)).sendKeys(productName);
        
    }

    public void clickSearchButton() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.searchButton)).click();
        
    
    }

    public boolean isSearchedProductsVisible() {
    	
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.searchedProductsText));
    		Reports.generateReport(driver, test, Status.PASS, "search product is visible");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "search product is not visible"); 
		}
        return result;
    }
    

    public int getProductListCount() {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Locators.productsList)).size();
    }
    
    
    
    
    
    
    
    
    

    //verifyall
    public void clickViewProduct() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.viewProductButton)).click();
    }

    public String getProductName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.productName)).getText();
    }

    public String getCategory() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.category)).getText();
    }

    public String getPrice() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.price)).getText();
    }

    public String getAvailability() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.availability)).getText();
    }

    public String getCondition() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.condition)).getText();
    }

    public String getBrand() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.brand)).getText();
    }
    
    
    
    
    
    
    
    
    
    	//quantity
    
    public String getAvailability2() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.availability2)).getText();
    }

    public void clearQuantity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.quantityInput)).clear();
    }

    public void enterQuantity(String quantity) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.quantityInput)).sendKeys(quantity);
    }

    public void clickAddToCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.addToCartButton)).click();
        driver.navigate().refresh();
    }


    
    public void clickcartShoppingButton() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.carttcheck)).click();
    }
    
    
    public boolean getquantityCount() {
    	driver.navigate().refresh();
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.countverify));
    		Reports.generateReport(driver, test, Status.PASS, "Count has displayed 4");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "invalid count"); 
		}
        return result;
    }
    
    
    
    
    
    
    
    
    
    
    //recommend
    
    public void scrollToBottom() {
    	WebElement e = driver.findElement(By.cssSelector("div[class='recommended_items'] h2[class='title text-center']"));
    	Actions ac = new Actions(driver);
    	ac.moveToElement(e).perform();
    }
    
    public boolean isRecommended() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.recommendi));
    		Reports.generateReport(driver, test, Status.PASS, "Recommended items are visible");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, "Recommended items are not visible"); 
		}
        return result;
    }
    
    

    public void clickAddToCartRecommended() {
        wait.until(ExpectedConditions.elementToBeClickable(Locators.addToCartRecommended)).click();
        driver.navigate().refresh();
    }
    
    public boolean iscartquantity() {
    	boolean result = true;
    	try {
    		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.quantitycart));
    		Reports.generateReport(driver, test, Status.PASS, "The product is displayed in cartpage");
		} catch (TimeoutException te) {
			result = false;
			Reports.generateReport(driver, test, Status.FAIL, " product is not visible"); 
		}
        return result;
    }
    
    
    
    
    
    
    //add product in cart
    
    
   /* public void Firsttt() {
        Actions actions = new Actions(driver);
        WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(firstProduct));
        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonFirstProduct));
        actions.moveToElement(product).click(addToCart).build().perform();
    }

    public void Seconddd() {
        Actions actions = new Actions(driver);
        WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(secondProduct));
        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonSecondProduct));
        actions.moveToElement(product).click(addToCart).build().perform();
    }*/
    public void Firsttt() {
    	WebElement eee = driver.findElement(Locators.firstProduct);
    	eee.click();
    	WebElement ee = driver.findElement(By.cssSelector("button[type='button'] i[class='fa fa-shopping-cart']"));
    	ee.click();
    }
    
     public void clickContinueShoppingButton() {
          wait.until(ExpectedConditions.elementToBeClickable(Locators.continueShoppingButton)).click();
      }
     
     public void Seconddd() {
    	 driver.navigate().back();
    	 WebElement ee = driver.findElement(Locators.secondProduct);
    	 ee.click();
    	 WebElement e = driver.findElement(By.xpath("//button[@type='button']"));
    	 e.click();
    	 
     }
     
     public boolean verif() {
    	 boolean result = true;
     	try {
     		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.two));
     		Reports.generateReport(driver, test, Status.PASS, "Both Products are added to Cart");
 		} catch (TimeoutException te) {
 			result = false;
 			Reports.generateReport(driver, test, Status.FAIL, "No product in Cart"); 
 		}
         return result;
     }
     
     
     public String Price() {
         return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.price1)).getText();
     }
     public String Pricedemoo() {
         return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.price2)).getText();
     }
     
     public String Quantity() {
         return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.quantity1)).getText();
     }
     public String Quantitydemo() {
         return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.quantity2)).getText();
     }
     public String Total() {
         return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.total1)).getText();
     }
     public String Totaldemo() {
         return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.total2)).getText();
     }
     

     
     
     
     
     
     //review
     public boolean isWriteYourReviewVisible() {
    	 boolean result = true;
     	try {
     		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.writeYourReview));
     		Reports.generateReport(driver, test, Status.PASS, "Write review  is visible");
 		} catch (TimeoutException te) {
 			result = false;
 			Reports.generateReport(driver, test, Status.FAIL, "Write review is not visible"); 
 		}
         return result;
     }

     public void enterReviewName(String name) {
         wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.reviewName)).sendKeys(name);
     }

     public void enterReviewEmail(String email) {
         wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.reviewEmail)).sendKeys(email);
     }

     public void enterReview(String text) {
         wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.review)).sendKeys(text);
     }

     public void clickReviewSubmitButton() {
         wait.until(ExpectedConditions.elementToBeClickable(Locators.reviewSubmitButton)).click();
     }
     public boolean resultt() {
    	 boolean result = true;
     	try {
     		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.sucess));
     		Reports.generateReport(driver, test, Status.PASS, "Thank you for your review. is Visiblee");
 		} catch (TimeoutException te) {
 			result = false;
 			Reports.generateReport(driver, test, Status.FAIL, "Thank you for your review. is not visible"); 
 		}
         return result;
     }
     
     
     
     
     
     
     
     
     //UseArrow
     
     public void scrollToBottomarrow() {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    	 
     }
     
     public String getSubText() {
    	 return wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.subs)).getText();
     }
     
     
     
     public void clickArrowUpButton() {
         driver.findElement(By.id("scrollUp")).click();
     }
     
     public boolean Atuoo() {
    	 boolean result = true;
      	try {
      		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.las));
      		Reports.generateReport(driver, test, Status.PASS, "Page is Scrolled Up");
  		} catch (TimeoutException te) {
  			result = false;
  			Reports.generateReport(driver, test, Status.FAIL, "Page is not Scrolled"); 
  		}
          return result;
         
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     



     //WithoutArrow

    public void scrollToTop() {
        org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0)");
    }



}
