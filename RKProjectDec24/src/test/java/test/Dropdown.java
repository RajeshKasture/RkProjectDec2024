package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		 
		driver.manage().window().maximize();

        System.out.println("Browser launched");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.get("https://trytestingthis.netlify.app/");
		
		WebElement dropdown = driver.findElement(By.id("option"));
		
		Select s = new Select(dropdown);
		s.selectByIndex(1);
//		s.selectByValue("Option 2");
//		s.selectByVisibleText("Option 3");
		Thread.sleep(2000);
	
		System.out.println("Option selected");
		
		Thread.sleep(2000);
		driver.quit();
	    System.out.println("Browser Closed");
}
}
