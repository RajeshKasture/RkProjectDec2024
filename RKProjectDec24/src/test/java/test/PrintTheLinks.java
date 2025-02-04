package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTheLinks {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();	  
		driver.manage().window().maximize();
	    System.out.println("Browser launched");
		driver.get("https://www.demo.guru99.com/test/newtours/");
		System.out.println("url hitted");
		 Thread.sleep(10000);
		 
		 List<WebElement> elements =driver.findElements(By.tagName("a"));
		 System.out.println("Printing the links available on webpage :");
		 int count = 0;
		 for(WebElement element : elements)
		 {
			
			 System.out.println(" ="+element.getText());
			 count++;
		 }
		
		 
		 System.out.println("The links count is :"+count);
		 
		    driver.quit();
		   System.out.println("Browser closed");
	  
  }
}
