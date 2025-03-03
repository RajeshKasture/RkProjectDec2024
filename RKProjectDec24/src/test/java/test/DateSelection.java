package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DateSelection {
	     static WebDriver driver ; 
	    public static void main(String[] args) throws InterruptedException {
	     
	        
	        WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	        System.out.println("Browser launched");
			driver.get("https://jqueryui.com/datepicker/");
			driver.manage().window().maximize();
			System.out.println("Url hitted");
			
			WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		    Thread.sleep(6000);
			driver.switchTo().frame(iframe);
		    System.out.println("Switched to IFRAME");
		    
			WebElement DateBox= driver.findElement(By.id("datepicker"));
			
			

	        // Get today's date
	        LocalDate today = LocalDate.now();
	    	System.out.println("===>"+today);
	        String day = String.valueOf(today.getDayOfMonth()); // Extract only the day
	    	System.out.println("===>"+day);
	        String monthYear = today.format(DateTimeFormatter.ofPattern("MMMM yyyy")); // Example: "March 2025"
	    	System.out.println("===>"+monthYear);

	        // Click the date picker input field
	        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // Change locator based on the website
	    	System.out.println("Clicked on date box");

	        // Ensure correct month is selected
	        while (true) {
	            WebElement currentMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
	            if (currentMonth.getText().equals(monthYear)) {
	            	  System.out.println("Checked Current month");
	                break;
	                
	            }
	            driver.findElement(By.xpath("//a[@title='Next']")).click(); // Click next month if needed
	        }

	        // Select the current date
	        List<WebElement> dates = driver.findElements(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]"));
	        for (WebElement date : dates) {
	            if (date.getText().equals(day)) {
	                date.click();
	                System.out.println("Clicked on Todays Date");
	                System.out.println("===>"+date.getText());
	                break;
	                
	            }
	        }

	        // Close the browser
	        Thread.sleep(2000); // Just to see the selected date before closing
	        driver.quit();
	        System.out.println("Browser Closed");
	    }
	}


