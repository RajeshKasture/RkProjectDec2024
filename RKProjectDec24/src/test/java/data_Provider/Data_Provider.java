package data_Provider;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Data_Provider {
	
	
	
	WebDriver driver;

	
	@Test(dataProvider="create") 
	public void Test(String username , String password) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		
        driver.findElement(By.id("user-name")).sendKeys(username);
        System.out.println("Username entered");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys(password);
        System.out.println("Password entered");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        System.out.println("Clicked on Login btn");
        Thread.sleep(2000);
        driver.close();
        
        
}
	
	 @DataProvider(name="create")
	  public String[][] getdata()
	  {
		  String[][] data =
				  
				  {
			      {"standard_user","secret_sauce"},
				  {"locked_out_user","secret_sauce"},
				  {"problem_user","secret_sauce"},
				  {"performance_glitch_user","secret_sauce"}
				  }	;  
				  return data;
	  }
	 
	
	}

