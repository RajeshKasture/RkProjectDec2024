package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	static WebDriver driver ; 
	
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
       System.out.println("Browser launched");
		driver.get("https://en-gb.facebook.com/login/web/");
		System.out.println("Url hitted");
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		FileUtils.copyFile(source, new File("./Screenshots/fb.png"));
		System.out.println("Screenshot is captured");
		
		driver.quit();
		System.out.println("Browser closed");

		}
}
