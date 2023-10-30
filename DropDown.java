package websitesAutomate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {
	    public static void main(String[] args) throws InterruptedException {
	        // Create a WebDriver object
	    	WebDriver driver; 			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options); 
			driver.get("https://flipkart.com/");
			driver.manage().window().maximize();
			
			// Close the login popup
			driver.findElement(By.xpath("//span[@role='button']")).click();
			
			// Find the dropdown element
	        WebElement dropdown = driver.findElement(By.xpath("//span[@class='_1sLnDu']"));
	        
	        // Create a Select object to interact with the dropdown
	        Select select = new Select(dropdown);
	        
	        // Get the list of options in the dropdown
	        List<WebElement> values = select.getOptions();
	        
	        // Loop through the options and print every second value
	        for (int i = 0; i < values.size(); i += 2) {
	           
	        	// Get the text of the option
	            String value = values.get(i).getText();
	            
	            // Print the value
	            System.out.println(value);
	        }
	    }
	}

