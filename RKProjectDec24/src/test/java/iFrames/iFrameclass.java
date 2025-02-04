package iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrameclass {

		static WebDriver driver ;

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
		    System.out.println("Browser launched");
			driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Tab");
			System.out.println("url hitted");
			
			WebElement iframe = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
			WebElement image = driver.findElement(By.xpath("//img[@alt='Selenium Online Training']"));
			WebElement IFRAMEBtn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]"));
			
			Thread.sleep(6000);
			IFRAMEBtn.click();
		    System.out.println("Clicked on IFRAME button");

		    Thread.sleep(6000);
			driver.switchTo().frame(iframe);
		    System.out.println("Switched to IFRAME");
		    
		    Thread.sleep(6000);
			image.click();
		    System.out.println("Clicked on image");
			
		    driver.switchTo().defaultContent();
		    
		    driver.quit();
		    System.out.println("Browser closed");
		 
			
		
	}

}
