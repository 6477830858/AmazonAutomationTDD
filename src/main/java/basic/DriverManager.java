package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverManager {
 
	public static WebDriver driver;
	
	public void setup(String browser , String url) {
		
	String path= System.getProperty("user.dir");
	
				
	System.out.println("returning the location my dr>>" +path);
	if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", path+"\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//System.out.println("this is launched browser" +browser);
	}else if (browser.equalsIgnoreCase("Firefox")) {
		
		 System.setProperty("webdriver.gecko.driver", path+"\\driver\\geckodriver.exe")	;	
		
		 //System.out.println("this is launched br>>" + browser);
			driver = new FirefoxDriver();}
	
else if (browser.equalsIgnoreCase("opera")) {
System.getProperty("webdriver.opera.driver", "C:\\Users\\gaurp\\eclipse-workspace\\SeleniumExample\\driver\\operadriver.exe");
System.out.println("this is launched br>>" + browser);

driver = new OperaDriver();

}
else
{
	System.out.println("this is not correct of browser>>" + browser);}


	if (url!="") {
		driver.get(url);
		System.out.println("this my url" + url);
}
else {
		driver.get("about:blank");
	System.out.println("the url is blank or not as expectes>>"+ url);

	
	}

	
    driver.manage().window().maximize();
	}
	
   public void teardown() {
	   driver.quit();
   }
   
	public static WebDriver getdriver()
	{
		return driver;
	
		
	}
	 
	
	
	
	
	
	}
