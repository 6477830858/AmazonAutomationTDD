package Test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pom.MobileAction;

public class MobileTest extends Launch {
	MobileAction  Mobile;
	@BeforeClass(alwaysRun = true)
	public void beforeclass()
	{
		Mobile = new MobileAction(driver);
	}
	
  @Test(priority = 1)
  public void VerifySamsungGlaaxyPage() {
	  Mobile.sendkeyssearchbox();
	  String ActualTitle =driver.getTitle();
	  
	  String ExpectedTitle ="Amazon.ca : samsung galaxy s10";
	  Assert.assertTrue(ActualTitle.contains(ExpectedTitle), " This is not actual Title");
	  System.out.println(" user navigate successfully on Mobile Glaxy Page");
  }

  @Test(priority = 2)
    public void verifyResuls()
 {  try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    String  ActualResult = Mobile.ResultofSamsung.getText();
    System.out.println(" The Actual Result is >>"+ActualResult);
	// String ExpectedResult=" 1-48 of 317 results for  samsung galaxy s10";
    String ExpectedResult="samsung galaxy s10";
	 System.out.println(" The expected Result is >>"+ExpectedResult);
	 Assert.assertTrue(ActualResult.contains(ExpectedResult), " Result does not match");
	  
  }
  @Test(priority = 3)
  public void verifyMobileImage()
  {
	  Mobile.mobileimage();
  }
  
  
  
  @Test(priority = 4)
  public void verifyVideo()
  {
	  Mobile.PlayAndCloseVideo();
  }
 
  @Test(priority = 5)
  public void VerifyPrice()
  {    
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    String  ActualPrice=  Mobile.Price.getText();
	    
		
		String  ExpectedPrice="$639";
	   
		System.out.println("The Price Of Mobile IS >>" + "  " +ActualPrice);
		System.out.println("Expected Price IS>>" + "  " +ExpectedPrice);
        Assert.assertTrue(ActualPrice.contains(ExpectedPrice), "The price does not match");
        System.out.println("Price is validated successfully");
  }
  @Test(priority = 6)
  public void verifyCustomerSection()
  {
	  
		try {
			Mobile.CustomerReviewSection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	  String ActualTitle = Mobile.CustmorReview.getText();
	  System.out.println("The Actual Title is >>" +ActualTitle);
	  String ExpectdedTitle= "144 ratings";
	  System.out.println("The Expected Title is >>" +"  " +ExpectdedTitle);
	  Assert.assertTrue(ActualTitle.contains(ExpectdedTitle), " This is not actual title");
	  System.out.println(" user successfully navigate to custmore review section");
	  
  }
//  @Test(priority = 5)
//  public void verifylocation()
//  {
//	  Mobile.clicklocation();
//  }
 
  @Test(priority = 7)
  public void verifyLocation() throws InterruptedException
  {
	  Mobile.Location();
	 // String actualtext = Mobile.
	 // Text = Mobile.postalcodeThirdTap.getText();
//	  System.out.println(" the text is >>"+Text);
//	  
	//  String ActuaLText= Mobile.Location.getText();
	 // String ExpexctedText=
  }
//  @Test(priority = 7)
//  public void verifypostalcode2()
//  {
//	  Mobile.postalcode2();
//  }
//  @Test(priority = 8)
//  public void verifypostalcode3()
//  {
//	  Mobile.apply();
//  }
  @Test(priority = 8)
 public void verifyaddresschange()
  {
	String AcutualText=  Mobile.AddressChanged.getText();
	System.out.println(" Actual Text  is " +AcutualText);
	String ExpectedText="Deliver to L6V 3J3?";
	
		  
	Assert.assertTrue(AcutualText.contains(ExpectedText), "THis is not Actual Text");
	System.out.println(" Address has been changed successfully");
			
		
  }
  @Test(priority = 9)
  public void verifyAddCart() {
	  Mobile.addtocart();
	  
  }
  @Test(priority = 9)
  public void verifyaddedtocarttext()
  { 
	  String Actualtext =Mobile.Textofaddtocart.getText();
	  System.out.println(Actualtext);
	  String Expectedtext="Added to Cart";
	  System.out.println(Expectedtext);
	  Assert.assertEquals(Actualtext,Expectedtext );
	  System.out.println("Validation is successfully done for added to cart");
	  
  }
  @Test(priority = 10)
  public void verifycheckout()
  {
	  Mobile.checkout();
	  String ActualTitle = driver.getTitle();
	  System.out.println(ActualTitle);
	  String ExpecedTitle="Amazon Sign In";
	  Assert.assertTrue(ActualTitle.contains(ExpecedTitle), " Title does not match");
	  System.out.println(" User Navigate to SIgnIn page");
  }	  
	  
  
 
}


