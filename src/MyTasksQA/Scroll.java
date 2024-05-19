package MyTasksQA;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String baseUrl = "http://demo.guru99.com/test/guru99home/";
      driver.get(baseUrl);
      JavascriptExecutor js=(JavascriptExecutor)driver;
	     
	      js.executeScript("window.scrollBy(0,700)"); //down
	      Thread.sleep(2000);
      js.executeScript("window.scrollBy(0, -200)");//up
	      Thread.sleep(1000);
	
	      	
	      
		   Thread.sleep(3000);
		   String baseUrl2 = "https://www.facebook.com/";
		   driver.get(baseUrl2);
		   driver.manage().window().setSize(new Dimension(450, 450));
		   Thread.sleep(2000);
	        js.executeScript("window.scrollBy(200, 0)");//right
	        Thread.sleep(2000);
	     js.executeScript("window.scrollBy(-100, 0)");//left
	     Thread.sleep(2000);
	        driver.quit();
	}

}
//yasmeen