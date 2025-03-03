package headlessExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessExecution {
    public static void main(String[] args) {
        // Set path for ChromeDriver (if not in system PATH)
    	WebDriverManager.chromedriver().setup();

        // Create ChromeOptions object
        ChromeOptions options = new ChromeOptions();
        
        // Enable headless mode
        options.addArguments("--headless");
        
        // Additional options (optional)
        options.addArguments("--disable-gpu"); // For better performance on some OS
        options.addArguments("--window-size=1920,1080"); // Set screen size
        options.addArguments("--remote-allow-origins=*"); // Fix potential CORS issues

        // Initialize WebDriver with ChromeOptions
        WebDriver driver = new ChromeDriver(options);

        // Open a website
        driver.get("https://www.google.com");

        // Print the title to verify execution
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
        System.out.println("Browser Closed");
    }
}

