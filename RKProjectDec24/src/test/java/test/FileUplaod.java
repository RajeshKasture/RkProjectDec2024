package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUplaod {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        System.out.println("Browser opened");
        
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
        
        
         WebElement ChooseFile = driver.findElement(By.id("uploadfile"));
         ChooseFile.sendKeys("C:\\Users\\Rajesh kasture\\eclipse-workspace\\RKProjectDec24\\DataFolder\\Rajesh Kasture - Resume.pdf");
         System.out.println("File Uplaoded successfully");
	}

}
