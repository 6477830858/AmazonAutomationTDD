package pom;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basic.DriverManager;
import utilis.CommonMethod;

public class MobileAction {


	WebDriver driver;
	
	CommonMethod common = new CommonMethod(DriverManager.getdriver());
	
	@CacheLookup
	@FindBy(id = "twotabsearchtextbox")
	 public WebElement Searchbox;
	@CacheLookup
	@FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
	 public WebElement ResultofSamsung;
	@CacheLookup
	@FindBy(id="a-autoid-9-announce")
	WebElement PlayMobileVideo;
	@CacheLookup
	@FindBy(xpath=" //button[@class=' a-button-close a-declarative a-button-top-right']")
	WebElement CloseVideo;
	@CacheLookup
	@FindBy(linkText = "Samsung Galaxy S10 6GB 128GB - Unlocked Phone - (Prism Black)")
	WebElement Mobileimage;
	@CacheLookup
	@FindBy(xpath="(//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay'])[1]")
	public
	WebElement Price;
	@CacheLookup
	@FindBy(xpath= "(//a[@id='acrCustomerReviewLink'])[1]")
	public
    WebElement CustmorReview;
	@CacheLookup
	@FindBy(xpath = "(//span[@id='contextualIngressPtLabel'])[1]")
	public
	WebElement location;
	@CacheLookup
	@FindBy(xpath = "(//input[@class='a-declarative a-span5'])[1]")
	WebElement postalcodeFirsttab;
	@CacheLookup
	@FindBy(xpath="(//input[@class='a-declarative a-span5'])[2]")
	WebElement postalcodesecondtab;
	@CacheLookup
	@FindBy(xpath="//span[@class='a-button a-button-span12']")
	public
	WebElement postalcodeThirdTap;
	@CacheLookup
	@FindBy(id="contextualIngressPtLabel")
	public
	WebElement AddressChanged;
	@CacheLookup
	@FindBy(id="add-to-cart-button")
	public
	WebElement AddtoCart;
	@CacheLookup
	@FindBy(xpath="//div[@class='a-section a-spacing-none a-padding-none']")
	public
	WebElement Textofaddtocart;
	@CacheLookup
	@FindBy(name = "proceedToRetailCheckout")
	WebElement ProceedToCheckOut;
	
	  public MobileAction(WebDriver driver)
	    {
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    }
	  public void sendkeyssearchbox()
	  {
		   sendkeys(Searchbox, "samsung galaxy s10");
		   Searchbox.submit();
		  
	  }

 
	  public void PlayAndCloseVideo()
	  
	  {  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	     common.jsclick(PlayMobileVideo);
		 
		 // clickelement(PlayMobileVideo);
		  
		  
		 // clickelement(CloseVideo);
	  }
	  public void mobileimage()
	  {
		 clickelement(Mobileimage);             
	  }
	  public void CustomerReviewSection()  throws InterruptedException
	  { 
		
		 
		  Thread.sleep(3000);
		
	// i used jsclick because click was not working		
		
	    common.jsclick(CustmorReview);
		//clickelement(CustmorReview);
		Thread.sleep(3000);
		driver.navigate().back();
	   Thread.sleep(3000);
		  
		 
			
		}	  
	  

	  
	  public void Location() throws InterruptedException {
	    Thread.sleep(10000);
	   //  common.scrolleleclick(location);
	      clickelement(location);
	        Thread.sleep(10000);
		  sendkeys(postalcodeFirsttab, "L6V");
		   Thread.sleep(10000);
		  sendkeys(postalcodesecondtab,"3j3");
		   Thread.sleep(10000);
		  clickelement(postalcodeThirdTap);
		  
		  
	  }

	  
	 public void addtocart() {
	 driver.navigate().refresh();
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		e.printStackTrace();
	}
		// clickelement(AddtoCart);
	 common.jsclick(AddtoCart);
		
	 }
	 public void checkout()
	 {
		
		// clickelement(ProceedToCheckOut);
		 common.jsclick(ProceedToCheckOut);
		
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
	  
	  public void clickelement( WebElement ele)
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
	  
	  
	  
//	public void mobiledetails()
//	{  // here i navigate to page the samsungglaxy 10
//		driver.navigate().to("https://www.amazon.ca/s?k=samsung+galaxy+s10&crid=BK4HA48TK7LR&sprefix=samsung+galaxy+s10%2Caps%2C127&ref=nb_sb_noss_2");
//	    List<WebElement>listlink=driver.findElements(By.xpath("//img[@class='s-image']"));
//	   // total no of results displayed of first page
//	    System.out.println("The total count of links are>>" +"   " +listlink.size());
//	    // here I choose 6th image of phone
//	   
//	    driver.findElement(By.className("//img[@data-image-index='6']")).click();
//	    //play the mobilevideo
//	    driver.findElement(By.xpath("//span[@id='a-autoid-11']")).click();
//		
//	    
//	     
//	}
	
	
	
	
}
