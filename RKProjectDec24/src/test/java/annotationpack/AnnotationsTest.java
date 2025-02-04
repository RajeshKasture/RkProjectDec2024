package annotationpack;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsTest {
	WebDriver driver;
	  @BeforeSuite
	  public void launchappliction() {
		  System.out.println("beforeSuite");
		    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			System.out.println("Browser is launched successfully");
			driver.get("https://www.demoblaze.com/");
			System.out.println("Url hit");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("beforeTest");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeClass");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("beforeMethod");
	  }
  @Test
  public void TestMethod1() {
	  System.out.println("TestMethod 1");
  }
  @Test
  public void TestMethod2() {
	  System.out.println("TestMethod 2");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }
  @AfterSuite
  public void afterSuite() {
	  driver.quit();
	  System.out.println("browser closed");
	  System.out.println("afterSuite");
  }

}
