package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebElement {

	static WebDriver driver ; 
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
        System.out.println("Browser launched");
		driver.get("https://en-gb.facebook.com/login/web/");
		System.out.println("Url hitted");
		
		//By using Text 
		WebElement LoginBtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		LoginBtn.click();
		System.out.println("Clicked on Login Btn by using Text");
		
		//By using contaiins 
	    WebElement LoginBtn1 = driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _52e0 _4jy6 _4jy1 selected')]"));
	    LoginBtn1.click();
		System.out.println("Clicked on Login Btn by using contaiins");
	    
	    //By using child
		WebElement LoginBtn2 = driver.findElement(By.xpath("//div[@class='_xkt']/child::button[@value='1']"));
		LoginBtn2.click();
		System.out.println("Clicked on Login Btn by using child");
		
		//By using Index
		WebElement LoginBtn3 = driver.findElement(By.xpath("//button[1]"));
		LoginBtn3.click();
		System.out.println("Clicked on Login Btn by using Index");
		
		//By using cssSelector Tagname
		WebElement LoginBtn4 = driver.findElement(By.cssSelector("button"));
		LoginBtn4.click();
		System.out.println("Clicked on Login Btn by using cssSelector Tagname");
		
		//By using cssSelector ID
		WebElement LoginBtn5 = driver.findElement(By.cssSelector("#loginbutton"));
		LoginBtn5.click();
		System.out.println("Clicked on Login Btn by using cssSelector ID");
	
		
		driver.quit();
		System.out.println("Browser closed");
	
	}

}
