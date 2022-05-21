package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.AmazonAction;

public class WrongURL extends Launch {
	AmazonAction Amaz;
	@BeforeClass(alwaysRun = true)
	public void beforeclass()
	{
		Amaz = new AmazonAction(driver);
	}
  @Test
  public void VerifyWrongURL() {
	  
	  Amaz.WrongUrl();
	  String ActualTitle =driver.getTitle();
	 
	  String ExpectedTitle="www.amzn.ca";
	  System.out.println("ActualTitle is >>" +ActualTitle);
	  System.out.println("ExpectedTitle is >>"+ExpectedTitle);
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  System.out.println("validated sucessfully");
  }
}
