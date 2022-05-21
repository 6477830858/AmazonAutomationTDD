package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basic.DriverManager;
import utilis.CommonMethod;

public class SignActionclass {
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
	    @FindBy(id="nav-item-signout") 
	    WebElement Singout;
	    @CacheLookup
	    @FindBy(xpath = "//span[@class='a-list-item']")
	    public
	    WebElement IncorrectPassword;
	    
	    public SignActionclass(WebDriver driver)
	    {
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
	    }
	    public void mousehoveronsingup() {
			 Actions action = new Actions(driver);
		 	action.moveToElement(Mousesignin).build().perform();
	    }
      public void sendkeyEmail(String EmailData) {
    	  sendkeys(Email,EmailData);
      }
      public void sendkeysPassword(String PasswordData)
      {
    	  sendkeys(Password, PasswordData);
      }
      public void clickAction() {
    	  clickelement(Mousesignin);
      }
      public  void clickSignIn() {
    	  clickelement(Signin);
      }
      public void ClickContinue() {
    	  clickelement(Continue);
      }
      public void clicksigninsubmit()
      {
    	  clickelement(Signin);
      }
      public void clicksignout()
      {
    	  clickelement(Singout);
      }
      
     public void sendkeys(WebElement ele,String keys) {
	common.higlightelement(ele);
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
}