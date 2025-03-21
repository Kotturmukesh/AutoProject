package objectrepo;

import org.openqa.selenium.By;

public class Locators {
	
	
	
	//--------------------------------------------Login-------------------------------------------------
//  Login to your account
	public static By loginToYourAccountText = By.xpath("//a[normalize-space()='Signup / Login']");
	public static By loginEmail = By.xpath("//input[@data-qa='login-email']");
	public static By loginPassword = By.xpath("//input[@placeholder='Password']");
	public static By loginButton = By.xpath("//button[normalize-space()='Login']");
	public static By incorrectLoginError = By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
	public static By loggedInAsUsername = By.xpath("//li[10]//a[1]");
	public static By logoutButton = By.xpath("//a[normalize-space()='Logout']");
    
    
    // new user 
	public static By newUserSignupText = By.xpath("//a[normalize-space()='Signup / Login']");
	public static By newUserName = By.xpath("//input[@placeholder='Name']");
	public static By newUserEmail = By.xpath("//input[@data-qa='signup-email']");
	public static By signupButton = By.xpath("//button[normalize-space()='Signup']");
	public static By gender = By.xpath("//input[@id='id_gender1']");
	public static By pass = By.xpath("//input[@id='password']");
	public static By date = By.xpath("//select[@id='days']");
	public static By month = By.xpath("//select[@id='months']");
	public static By year = By.xpath("//select[@id='years']");
	public static By letter = By.xpath("//input[@id='newsletter']");
	public static By letter2 = By.xpath("//label[@for='optin']");
	public static By firstname = By.xpath("//input[@id='first_name']");
	public static By lastname = By.xpath("//input[@id='last_name']");
	public static By street = By.xpath("//input[@id='address1']");
	public static By state = By.xpath("//input[@id='state']");
	public static By city = By.xpath("//input[@id='city']");
	public static By pin = By.xpath("//input[@id='zipcode']");
	public static By mobile = By.xpath("//input[@id='mobile_number']");
	public static By create = By.xpath("//button[normalize-space()='Create Account']");
	public static By con = By.xpath("//a[@class='btn btn-primary']");
	public static By delete = By.xpath("//a[normalize-space()='Delete Account']");
    
	
	
	public static By userlogin = By.cssSelector("a[href='/login']");
    
    
    
    
    

    //  exsist Signup!
	public static By UserSignupText = By.xpath("//a[normalize-space()='Signup / Login']");
	
	public static By UserName = By.xpath("//input[@placeholder='Name']");
	public static By UserEmail = By.xpath("//input[@data-qa='signup-email']");
	public static By usersignupButton = By.xpath("//button[normalize-space()='Signup']");
	public static By emailAlreadyExistError = By.xpath("//p[normalize-space()='Email Address already exist!']");
    
    
    
    
    
    
    // contact us
    
	public static By Contactus  = By.xpath("//a[normalize-space()='Contact us']");
	public static By verifyy = By.xpath("//h2[normalize-space()='Get In Touch']"); 
	public static By name = By.xpath("//input[@placeholder='Name']");
	public static By emaill = By.xpath("//input[@placeholder='Email']");
	public static By subject = By.xpath("//input[@placeholder='Subject']");
	public static By messagee = By.xpath("//textarea[@id='message']");
	public static By uploadd = By.xpath("//input[@name='upload_file']");
	public static By submitt = By.name("submit");
    //public static By successs = By.xpath("//span[normalize-space()='Home']");
	public static By done = By.linkText("Home");
	public static By verifyyy = By.xpath("//div[@class='item active']//span[1]");
    
    
    
    
    
    
    //Test cases
	public static By testhome = By.xpath("//div[@class='item active']//span[1]");
	public static By testclick = By.cssSelector("a[href='/test_cases']");
	public static By lastverify = By.xpath("//u[normalize-space()='Test Case 1: Register User']");
   
    
    
    
    //subscription homepage
	public static By checkdemo = By.xpath("//h2[normalize-space()='Subscription']");
	public static By subemail = By.id("susbscribe_email");
	public static By subbutton = By.id("subscribe");
	public static By subfinal = By.xpath("//div[@class='alert-success alert']");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//---------------------------------------------------search---------------------------------------------
	// search
	public static By searchInput = By.id("search_product");
	public static By searchButton = By.id("submit_search");
    
	public static By searchedProductsText = By.xpath("//h2[@class='title text-center']");
    
	public static By productsList = By.cssSelector(".features_items .col-sm-4");
    
    
    
    //verifyall
	public static By viewProductButton = By.cssSelector("a[href='/product_details/2']"); 
	public static By productName = By.cssSelector(".product-information h2");
	public static By category = By.cssSelector(".product-information p");
	public static  By price = By.cssSelector(".product-information span span");
	public static By availability = By.xpath("//*[contains(text(),'Availability:')]");
	public static By condition = By.xpath("//*[contains(text(),'Condition:')]");
	public static By brand = By.xpath("//*[contains(text(),'Brand:')]");
    
    
    
    
    
    
    
    //quantity
	public static By availability2 = By.xpath("//*[contains(text(),'Availability:')]");
	public static By quantityInput = By.id("quantity");
	public static By addToCartButton = By.cssSelector("button[type='button']");
   // private By continueShoppingButton = By.xpath("//button[@class='btn btn-success close-modal btn-block']");
	public static By carttcheck = By.cssSelector("a[href='/view_cart']");
	public static By countverify = By.xpath("//button[contains(text(),'4')]");
    
    
    
    
    
    
    
    
    //recommend
	public static By recommendi = By.cssSelector("div[class='recommended_items'] h2[class='title text-center']");
	public static By addToCartRecommended = By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(4)");
	public static By quantitycart = By.xpath("//a[normalize-space()='Summer White Top']");
    
    
    
    
    //add product 
	public static By firstProduct = By.cssSelector("a[href='/product_details/1']");
    
	public static By continueShoppingButton = By.xpath("//button[@class='btn btn-success close-modal btn-block']");
	public static By secondProduct = By.cssSelector("a[href='/product_details/2']");
  //  public static By addToCartButtonFirstProduct = By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]");
  //  public static By addToCartButtonSecondProduct = By.cssSelector(".features_items .col-sm-4:nth-child(2) .product-image-wrapper .productinfo .btn.btn-default.add-to-cart");
	public static By two = By.id("product-2");
	public static By price1 = By.cssSelector("tr[id='product-1'] td[class='cart_price'] p");
	public static By price2 = By.cssSelector("tr[id='product-2'] td[class='cart_price'] p");
	public static By quantity1 = By.cssSelector("tr[id='product-1'] button[class='disabled']");
	public static By quantity2 = By.cssSelector("tr[id='product-2'] button[class='disabled']");
	public static By total1 = By.cssSelector("tr[id='product-1'] p[class='cart_total_price']");
	public static By total2 = By.cssSelector("tr[id='product-2'] p[class='cart_total_price']");
    
    
    //review
	public static By writeYourReview = By.id("reviews");
	public static By reviewName = By.id("name");
	public static By reviewEmail = By.id("email");
	public static By review = By.id("review");
	public static By reviewSubmitButton = By.id("button-review");
	public static By sucess = By.xpath("//span[normalize-space()='Thank you for your review.']");
    
    
    
    
    //Usearrow
    
	public static By subs = By.xpath("//h2[normalize-space()='Subscription']");
	public static By las = By.cssSelector("img[alt='Website for automation practice']");
	
	
	
	

	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	//-------------------------------------------------CartPage---------------------------------------
	//subscription
    public static By cartbu = By.cssSelector("a[href='/view_cart']");
    public static By subtext = By.xpath("//h2[normalize-space()='Subscription']");
    public static  By subemail1 = By.id("susbscribe_email");
    public static By subcart = By.id("subscribe");
    public static By succart = By.xpath("//div[@class='alert-success alert']");    
    public static By ad = By.xpath("//a[normalize-space()='View Product']");
    
    
    
    //remove product
    public static By productButton = By.cssSelector("a[href='/products']");
    public static By anyProduct = By.cssSelector("a[href='/product_details/2']");
    public static By cancel = By.xpath("//a[@class='cart_quantity_delete']");
    public static By veri = By.cssSelector(".cart_quantity_delete");
    
    
    
    
    
    
    
    
    
    //verifyafter
    
    public static By probu = By.cssSelector("a[href='/products']");
    public static By vv = By.xpath("//h2[@class='title text-center']");
    public static By searchh = By.id("search_product");
    public static By searchButon = By.id("submit_search");
    public static By searchp = By.xpath("//h2[@class='title text-center']");
    public static By Tshirt = By.xpath("//a[normalize-space()='Pure Cotton V-Neck T-Shirt']");
    public static By signn = By.xpath("//a[normalize-space()='Signup / Login']");
    
    
    
    
    
    //View Category
    
    public static By cat = By.xpath("//h2[normalize-space()='Category']");
    
    public static By plus = By.xpath("//a[normalize-space()='Women']//i[@class='fa fa-plus']");    
    
    public static By ms = By.xpath("//h2[@class='title text-center']");
    
    public static By plus2 = By.xpath("//a[normalize-space()='Men']//i[@class='fa fa-plus']");
    //public static By plus2 = By.xpath("//a[normalize-space()='Kids']");
    
    public static By ls = By.xpath("//h2[@class='title text-center']");
    
    
  
    
    
    
    //Brand
    public static By br = By.cssSelector("div[class='brands_products'] h2");
    public static By polo = By.xpath("//a[@href='/brand_products/Polo']");
    public static By poloverify = By.xpath("//h2[@class='title text-center']");
   // public static By poloverify2 = By.xpath("//div[@class='overlay-content']//p[contains(text(),'Premium Polo T-Shirts')]");
    
    public static By hm = By.xpath("//a[@href='/brand_products/H&M']");
    public static By hmverify = By.xpath("//h2[@class='title text-center']");
    
    
    
    
    
    
    
    
    
    
    
    
    
    //------------------------------Checkout-----------------------------------------
    //logincheck
    public static By checklog = By.cssSelector("a[href='/login']");
    public static By cartsignupbutton = By.cssSelector("a[href='/login']");
	public static By loginEmaill = By.xpath("//input[@data-qa='login-email']");
	public static By loginPasswordd = By.xpath("//input[@placeholder='Password']");
	public static By loginButtonn = By.xpath("//button[normalize-space()='Login']");
	public static By loggedInAsUsernamee = By.xpath("//li[10]//a[1]");
	public static By addToCartcheck = By.cssSelector("body > section:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(4)");
	public static By carttcheckk = By.cssSelector("a[href='/view_cart']");
	public static By checkkcart = By.xpath("//a[normalize-space()='Summer White Top']");
    public static By proceed = By.xpath("//a[@class='btn btn-default check_out']");
    public static By detaill = By.id("address_delivery");
    public static By reviewmessagee = By.name("message");
    
    public static By cardname = By.name("name_on_card");
    public static By cardno = By.name("card_number");
    public static By cvc = By.name("cvc");
    public static By cardmonth = By.name("expiry_month");
    public static By cardyear = By.name("expiry_year");
    public static By cardsubmit = By.id("submit");
    
    public static By orderpla = By.xpath("//p[normalize-space()='Congratulations! Your order has been confirmed!']");
    
   
    
    
    //Registercheck
    
    public static By signname = By.xpath("//input[@placeholder='Name']");
	public static By signemail = By.xpath("//input[@data-qa='signup-email']");
    public static By signButton = By.xpath("//button[normalize-space()='Signup']");
    
    public static By gender1 = By.xpath("//input[@id='id_gender1']");
	public static By pass1 = By.xpath("//input[@id='password']");
	public static By date1 = By.xpath("//select[@id='days']");
	public static By month1 = By.xpath("//select[@id='months']");
	public static By year1 = By.xpath("//select[@id='years']");
	public static By letter1 = By.xpath("//input[@id='newsletter']");
	public static By letter21 = By.xpath("//label[@for='optin']");
	public static By firstname1 = By.xpath("//input[@id='first_name']");
	public static By lastname1 = By.xpath("//input[@id='last_name']");
	public static By street1 = By.xpath("//input[@id='address1']");
	public static By state1 = By.xpath("//input[@id='state']");
	public static By city1 = By.xpath("//input[@id='city']");
	public static By pin1 = By.xpath("//input[@id='zipcode']");
	public static By mobile1 = By.xpath("//input[@id='mobile_number']");
	public static By create1 = By.xpath("//button[normalize-space()='Create Account']");
	public static By con1 = By.xpath("//a[@class='btn btn-primary']");
	public static By delete1 = By.xpath("//a[normalize-space()='Delete Account']");
	
	
	public static By delver = By.xpath("//b[normalize-space()='Account Deleted!']");
	
	public static By condel = By.xpath("//a[@class='btn btn-primary']");
	
	public static By billl = By.id("address_invoice");
	
	
	//invoice
	public static By invoice = By.xpath("//a[@class='btn btn-default check_out']");
}
