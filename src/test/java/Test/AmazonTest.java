package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.AmazonAction;


public class AmazonTest extends Launch{
 
	
	AmazonAction Amaz;
	@BeforeClass(alwaysRun = true)
	public void beforeclass()
	{
		Amaz = new AmazonAction(driver);
	}
	
				
  @Test
  public void verifyURL() {
	  String actualurl = driver.getCurrentUrl();
	  System.out.println("actual url>>" +"   "  +actualurl);
	  String actualtitle = driver.getTitle();
	  System.out.println("the title of page is >>"   +" " +actualtitle);
	  String expectedurl= "https://www.amazon.ca/";
	  Assert.assertEquals(actualurl, expectedurl);
	  System.out.println("URL is validated successfully");
	  	  
  }
  @Test(priority = 1)
  public void action()
  {
	 Amaz.mousehoveronsingup();
  }
  
  @Test(priority = 2)
  public void verifysignin()
  {
	  Amaz.signinclick();
	  String actualtitle = driver.getTitle();
		 String expectedtitle = "Amazon Sign In";
		 
	 Assert.assertTrue(actualtitle.contains(expectedtitle), "this is not actual title");
	 System.out.println("validation successfully done for Signin");
  }


  @Test(priority = 3)
  public void verifyperfume()
  {
	  Amaz.sendkeyperfume();
  }

  @Test(priority = 4)
  public void verifywishlist() {
	  Amaz.wishlist();
  }
  @Test(priority = 5)
  public void VerifyContinueShoppingTab()
  {
	  Amaz.clickoncontinueshopping();
  }
  @Test(priority = 6)
  public void back1()
  {
	  Amaz.back();
  }
  

  @Test(priority = 7)
  public void verifyjewellry()
  {
	  Amaz.sendkeysjewellery();
  }

  
  @Test(priority = 8)
  public void verifywishlist2() {
	  
	  Amaz.wishlistt();
  
}
  @Test(priority = 9)
  public void verifyViewWishList()
 {
	  
		
		try {
			Amaz.viewwishlist();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 String ActualText=	Amaz.Yourlist.getText();
	 System.out.println(ActualText+" "+"This is actualText");
	  String ExpectedText="Your Lists";
	  Assert.assertTrue(ActualText.contains(ExpectedText), "This is not list");
	  System.out.println("WishList Validated Sucessfully");
		
	
  }
  @Test(priority = 10)
  public void verifyaddtocart()
  {
	  try {
		Amaz.addtocart();
	} catch (InterruptedException e) {
				e.printStackTrace();
	}
  }
  @Test(priority = 11)
  public void verifychechoutAndPayment()
  {
	  Amaz.checkoutAndPayment();
	  String ActualTitle = driver.getTitle();
	  String ExpectedTitle="Select a Payment Method - Amazon.com Checkout";
	  Assert.assertTrue(ActualTitle.contains(ExpectedTitle), " Title does not match");
	  System.out.println(" user successfully navigate to payement mathed");
  }



  @Test(priority = 12)
   public void verifyNewReleasePage()
   {
	   Amaz.navigatetonewrelease();
	   String ActualTitle=driver.getTitle();
	   System.out.println("The Actual Title of Page" +"  " +ActualTitle);
	   String ExpectedTitle="Amazon.ca Hot New Releases: The bestselling new & future releases on Amazon";
	   System.out.println("The Expected result is"+" " +ExpectedTitle);
	   Assert.assertTrue(ActualTitle.contains(ExpectedTitle), " The Title Does Not Match");
	   System.out.println(" The user successfully navigate to New Release");
	   
   }
} 
