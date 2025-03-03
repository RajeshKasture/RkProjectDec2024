package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Iterator; 
import java.util.Set; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
  @Test
  public void Test() {
	  
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

     System.out.println("Browser launched");
	
	  // Load the website
	  driver.get("http://www.naukri.com/");

	  // It will return the parent window name as a String
	  String parent=driver.getWindowHandle();
      System.out.println(parent);
      
	  Set<String>s=driver.getWindowHandles();
	  System.out.println(s);
	  
	  // Now iterate using Iterator
	  Iterator<String> I1= s.iterator();

	  while(I1.hasNext())
	  {

	  String child_window=I1.next();


	  if(!parent.equals(child_window))
	  {
	  driver.switchTo().window(child_window);

	  System.out.println(driver.switchTo().window(child_window).getTitle());
      System.out.println("Switched to child window");
	  driver.close();
	  }

	  }
	  //switch to the parent window
	  driver.switchTo().window(parent);
	  System.out.println("Switched to Parent window");

	  }
  
	  
  }

