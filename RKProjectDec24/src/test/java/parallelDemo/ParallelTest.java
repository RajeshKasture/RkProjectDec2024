package parallelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

	 WebDriver driver ; 
	 @Test
	 public void test1()
	 
	 {
		 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
    System.out.println("Browser launched");
	driver.get("https://en-gb.facebook.com/login/web/");
	System.out.println(driver.getTitle());
	System.out.println("Url hitted");
    System.out.println("Test1 Execution");
     System.out.println("====================================");
	 }
	 @Test
	 public void test2()
	 {		 WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
         System.out.println("Browser launched");
	   driver.get("https://www.demoblaze.com/");
	   System.out.println(driver.getTitle());
	     System.out.println("Url hitted");
		 System.out.println("Test2 Execution");
		 System.out.println("====================================");
	 }
}

