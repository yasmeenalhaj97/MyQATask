package MyTasksQA;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class accessDropDownCountry {
 public static void main(String[] args) { 
	 System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
	    String baseURL = "https://demo.guru99.com/test/newtours/register.php";
		WebDriver driver = new ChromeDriver();
//		driver.get(baseURL);

//		Select drpCountry = new Select(driver.findElement(By.name("country")));
//		drpCountry.selectByIndex(50);
		//drpCountry.selectByVisibleText("CHAD");
	
		//drpCountry.selectByValue("CHAD");
		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		fruits.deselectAll();
		
		driver.quit();
 }
}