package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basic.DriverManager;
import utilis.CommonMethod;

public class AmazonAction {
	WebDriver driver;
	 CommonMethod common = new CommonMethod(DriverManager.getdriver());
	 
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
    WebElement Mousesignin;
    
    @CacheLookup
    @FindBy(linkText = "Sign in")
    WebElement Signin;
    @CacheLookup
    @FindBy(id = "ap_email")
    WebElement Email;
    @CacheLookup
    @FindBy(id = "continue")
    WebElement Continue;
    @CacheLookup
    @FindBy(id = "ap_password")
    WebElement Password;
    @CacheLookup
    @FindBy(id = "signInSubmit")
    WebElement SigninSubmit;
    @CacheLookup
    @FindBy(id = "twotabsearchtextbox")
    WebElement Perfumes;
    @CacheLookup
    @FindBy(xpath ="(//div[@class='a-section a-spacing-base'])[1]")
//    @FindBy(linkText = "[Foellie] eau de fleur - Feminine Inner Beauty Perfume (for Underwear), Sweetly Floral Scents Fragrance, 5ml(0.169 fl oz)")
    WebElement Perfumeimage;
    @CacheLookup
    @FindBy(id  ="add-to-wishlist-button-submit") 
    WebElement Wishlist1;
    @CacheLookup
    @FindBy(xpath="//span[@id='continue-shopping']")
    WebElement ContinueShopping;
    @CacheLookup
    @FindBy(id  ="twotabsearchtextbox")
    WebElement Jewellery;
    @CacheLookup
    @FindBy(xpath ="(//a[@class='a-link-normal s-no-outline'])[1]")
   // @FindBy(linkText = "Forever Love Infinity Necklace for Women June Birthstone Pearl Jewelry Wife S925 Sterling Silver with Birthstone, Birthday Gifts Jewelry for Mom")
    WebElement Jewelleryimage;
    @CacheLookup
    @FindBy(id = "add-to-wishlist-button-submit")
    WebElement wishlist2;
    
    @CacheLookup
    @FindBy(id= "huc-view-your-list-button")
    public
    WebElement ViewWishList;
    @CacheLookup
    @FindBy(id="my-lists-tab")
    public
    WebElement Yourlist;
    @CacheLookup
   // @FindBy(id="pab-I1WT5NC8YEAKS2")
    @FindBy(xpath = "(//a[@class='a-button-text a-text-center'])[1]")
    WebElement AddToCartJeweelery;
    @CacheLookup
   // @FindBy(id="pab-IK1AES2K2O02L")
    @FindBy(xpath="(//a[@class='a-button-text a-text-center'])[2]")
    WebElement AddToCartPerfumes;
    @CacheLookup
    @FindBy(id="nav-cart")
    WebElement Cart;
 
    @CacheLookup
      @FindBy(id="add-to-cart-button")
      WebElement Addtocart;
      @CacheLookup
      @FindBy(name  ="proceedToRetailCheckout")
      WebElement checkout;
          
      @CacheLookup
      @FindBy(xpath = "(//a[@class='a-declarative a-button-text '])[1]")
      WebElement DelivertoAddress;
      
    public AmazonAction(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    public void mousehoveronsingup() {
		 Actions action = new Actions(driver);
		  	action.moveToElement(Mousesignin).build().perform();
		  	
	}
    public void signinclick()
    {
    	clickelement(Signin);
    	sendkeys(Email, "+16477830858");
    	clickelement(Continue);
    	sendkeys(Password, "godisone123");
    	clickelement(SigninSubmit);

    }
    

    public void sendkeyperfume()
    {
    	sendkeys(Perfumes, "perfume for women");
    	Perfumes.submit();
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	clickelement(Perfumeimage);
    	
    	
    }

    public void wishlist()
    {
    	clickelement(Wishlist1);
    }
    public void clearjwell() {
//    	driver.navigate().refresh();
//    	try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
    	Perfumes.clear();
    }

    public void clickoncontinueshopping()
    {
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	clickelement(ContinueShopping);
    	
    }
   
     public void sendkeysjewellery() {

	sendkeys(Jewellery, " jewellery ");
	Jewellery.submit();
	clickelement(Jewelleryimage);
}


    public void wishlistt()
    {
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	clickelement(wishlist2);
    }
  
    public void viewwishlist() throws InterruptedException 
    
    { 
    	
    	Thread.sleep(3000);
    	
    	clickelement(ViewWishList);
  
    
    
    }
    public void addtocart() throws InterruptedException {
    	
    	clickelement(AddToCartJeweelery);
    	Thread.sleep(3000);
    	clickelement(AddToCartPerfumes);
    	Thread.sleep(3000);
    	clickelement(Cart);
    	Thread.sleep(3000);
    }
   
   
    public void addcart()
    {
    	clickelement(Addtocart);
    }
    public void checkoutAndPayment()
    
    { 
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	clickelement(checkout);
    	clickelement(DelivertoAddress);
    }
   
  
    public void back()
    {
    	driver.navigate().back();
    }
   
    public void sendkeys(WebElement ele,String keys) {
		common.waitforelement(ele);
		if(ele.isDisplayed()&& ele.isEnabled()) {
			ele.clear();
			ele.sendKeys(keys); 
		}else {
			System.out.println("this is not enable and displayed");
		}
	}
    public void clickelement( WebElement ele)// here i create the common mathed for clickable function
	{   
			common.higlightelement(ele);
			common.waitforelement(ele);
		if(ele.isEnabled()) {
			ele.click();
		}else
		{
			System.out.println("element is not enabled");
		}
	}
    public  void  navigatetowishlistitem() throws InterruptedException
    {
    	  driver.navigate().to("https://www.amazon.ca/hz/wishlist/ls/?ref_=wl_add_item_to_list");
    	 String Title =driver.getTitle();
    	 
    	 Thread.sleep(3000);
    	 
    	 
    	 
    	 System.out.println("Navigation was successfull" +"   "   +Title);
    	
    }
    public void navigatetonewrelease() {
    	driver.navigate().to("https://www.amazon.ca/gp/new-releases/?ref_=nav_cs_newreleases");
    }
   public void WrongUrl()
   {
	   driver.navigate().to("http://www.amzn.ca/");
	   
   }
	
}
