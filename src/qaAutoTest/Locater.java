package qaAutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locater {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String baseUrl = "https://ar-ar.facebook.com/";
	   driver.get(baseUrl);
	   Thread.sleep(3000);
	 
	   WebElement english=driver.findElement(By.xpath("//a[contains(text(),'English (US)')]"));
	  if( driver.getCurrentUrl().contains("https://ar-ar.facebook.com/"))
	  {
		 english.click();
	  }
	  else{
		  driver.quit();
		  
	  }
    

	}

}
