package websitesAutomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CurrentURL {
	 public static void main(String[] args) throws InterruptedException {
	    	WebDriver driver; 			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options); 
			driver.get("https://flipkart.com/");
			driver.manage().window().maximize();
			String currentURL = driver.getCurrentUrl();
			System.out.println(currentURL);	
	    }
}
