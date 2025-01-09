package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	
	WebDriver driver;

	@Test
	public void assertion()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        
        String ExpetcedTitle = "STORE";
        String ActualTitle = driver.getTitle();
      
        Assert.assertEquals(ActualTitle,ExpetcedTitle);
        System.out.println("Assertion verify");
	
	    driver.quit();
	}
	@Test(priority=2)
	void test () {
		    byte a= 2;
	        byte b =2;
	        Assert.assertEquals(a,b);
	        Assert.assertTrue(false);
	        System.out.println("Test Assertion verify");
	}
	int x =10;
	double c=55.5;
	@Test(priority=1)
	void test2()
	{
		System.out.println(c%10);
	}
}
