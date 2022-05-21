package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import pom.SignActionclass;

public class SignTest extends Launch
{
	SignActionclass Sign;
	@BeforeClass(alwaysRun= true)
	public void beforeclass()
	{
		Sign = new SignActionclass(driver);
	}
	@Test(priority = 1)
	public void verifyMousehoverAction()
	{
		Sign.clickAction();
//		String ActualTitle= driver.getTitle();
//		String ExpectedTitle = "Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
//		Assert.assertTrue(ActualTitle.contains(ExpectedTitle), "Title did not Mached");
//		
	}
	@Test(priority = 2)
		public void verifySigninButton()
		{
		Sign.clickSignIn();
		String actualtitle = driver.getTitle();
		 String expectedtitle = "Amazon Sign In";
	
	   Assert.assertTrue(actualtitle.contains(expectedtitle), "this is not actual title");
	   System.out.println("user navigate to signpage successfully");
		}
	@Parameters({"ValidUserName"})
	@Test(priority = 3)
	public void VerifyValidUserNmae(String UserNmae) {
		Sign.sendkeyEmail(UserNmae);
	}	
	@Test(priority = 4)
	public void verifycontinue()
	{
	 Sign.ClickContinue();
	}
	
	@Parameters({"ValidPassword"})
	@Test(priority = 5)
	public void VerifyValidPassword(String Password) {
		Sign.sendkeysPassword(Password);
	}
	@Test(priority = 6)
	public void verifysubmitbutton()
	{
		Sign.clicksigninsubmit();
		 String ActualTitle= driver.getTitle();
		 String ExpectedTitle = "Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
		 Assert.assertTrue(ActualTitle.contains(ExpectedTitle), "Title does not match");
		 System.out.println("user navigate successfully on home page");
	}
	@Test(priority = 7)
	public void verifysignoutbutton()
	{
	Sign.clicksignout();
	String ActualTitle =driver.getTitle();
	String ExpectedTitle ="Amazon Sign In";
	Assert.assertTrue(ActualTitle.contains(ExpectedTitle), " Title does not match");
	System.out.println(" user successfully signout");
	}
	@Parameters({"InvalidEmail"})
	@Test(priority = 8)
	public void VerifyInValidEmail(String InvalidUserName) {
		Sign.sendkeyEmail(InvalidUserName);
	}	
	@Test(priority = 9)
	public void verifycontinuee()
	{
	 Sign.ClickContinue();
	}
	@Parameters({"InvalidPasword"})
	@Test(priority = 10)
	public void VerifyInValidPassword(String InvalidPaaword) {
		Sign.sendkeysPassword(InvalidPaaword);
		String ActualText = Sign.IncorrectPassword.getText();
		String ExpectedText ="Your password is incorrect";
		Assert.assertTrue(ActualText.contains(ExpectedText), "Title does not match");
		System.out.println("Validate successfully");
		
	}	

}
