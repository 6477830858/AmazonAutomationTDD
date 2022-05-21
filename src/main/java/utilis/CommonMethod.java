package utilis;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethod {

	WebDriver driver;
	public CommonMethod (WebDriver driver) {
		this.driver= driver;
		
	}
	 public void waitforelement(WebElement ele)
	   {
		  WebDriverWait wait  =  new WebDriverWait(driver, 5);
		  wait.until(ExpectedConditions.visibilityOf(ele));
	   }
		
		public void higlightelement(WebElement ele) {
			
			JavascriptExecutor jsexe = (JavascriptExecutor)driver;
			jsexe.executeScript("arguments[0].style.border='2px solid yellow'", ele);
		}
		
		public void scrolleleclick(WebElement ele) {
			
			JavascriptExecutor jsexe = (JavascriptExecutor)driver;
			jsexe.executeScript("arguments[0].scrollIntoview();" ,ele);
		}
		
		public void jsclick(WebElement ele) {
			
			JavascriptExecutor jsexe = (JavascriptExecutor)driver;
			jsexe.executeScript("arguments[0].click();", ele);
		}
		
//	    public void mousehover() {
//	    	Actions action = new Actions(driver);
//	    	action.moveToElement(Mousesignin).
//	    	
//	    }
//	
//	
	
	
}
