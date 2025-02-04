package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	 WebDriver driver ; 
	 ChromeOptions chrome = new ChromeOptions();
	 FirefoxOptions firefox = new FirefoxOptions();
	 EdgeOptions edge = new EdgeOptions();
	 
	 
	 @Parameters("browser")
	@BeforeTest
	public void intialize (String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 System.out.println("chrome browser launched");
			  System.out.println("===========================");
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 System.out.println("firefox browser launched");
			  System.out.println("===========================");
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			 System.out.println("edge browser launched");
			  System.out.println("===========================");
		}

	}
	@org.testng.annotations.Test
	public void Test ()
	{
		   driver.get("https://www.demoblaze.com/");
		   System.out.println(driver.getTitle());
		     System.out.println("Url hitted");
		     String act= driver.getTitle();
		     String Exp= "STORE";
		   Assert.assertEquals(act, Exp);
		   System.out.println("===========================");
	}
	@AfterTest
	public void teardown ()
	{
		driver.quit();
		System.out.println("Browser closed");
	}
}
