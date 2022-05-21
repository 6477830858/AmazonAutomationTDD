package Test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basic.DriverManager;
import utilis.ReadProperties;

public class Launch {
	
public WebDriver driver;
DriverManager dmm = new DriverManager();
Properties prop;
 ReadProperties readprop;
 String filename = "C:\\Users\\gaurp\\eclipse-workspace\\TDDAmazon\\config.properties";


@Parameters({"browser","url"})
@BeforeTest(alwaysRun = true)

public void beforetest(String br , String url) {
// public void beforetest() {
// readprop = new ReadProperties();
//  prop =readprop.readproperties(filename);
 // dmm.setup(prop.getProperty("browser"), prop.getProperty("url"));
  // dmm.setup("chrome", "https://www.amazon.ca/");
	dmm.setup(br, url);
  driver = DriverManager.getdriver();
}



	@AfterSuite
	public void aftersuit() {
		dmm.teardown();
	}
	
	@Test
	public void amazon() {
		System.out.println("run the codde");
}}
