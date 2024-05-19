package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag {

	  public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	        String baseUrl = "http://demo.guru99.com/test/link.html";					
	    	System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();;
	    	
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
	        WebElement userNameField = driver.findElement(By.linkText("click here"));
	        userNameField.sendKeys("testUser");

	        driver.quit();
}
}
