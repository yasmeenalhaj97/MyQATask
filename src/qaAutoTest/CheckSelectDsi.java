package qaAutoTest;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class CheckSelectDsi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String baseUrl = "https://chandanachaitanya.github.io/selenium-practice-site/";
	     
	   driver.get(baseUrl);
	   WebElement box = new FluentWait<>(driver)
               .withTimeout(Duration.ofSeconds(20))
               .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class)
               .until(webDriver -> webDriver.findElement(By.xpath("//input[@id='bicycle-checkbox']")));

       if (!box.isSelected()) {
           box.click();
       }
	   
	
	   String baseUrl2 = "https://www.w3.org/WAI/ARIA/apg/patterns/accordion/examples/accordion/";
	   driver.get(baseUrl2);
	   WebElement status = new FluentWait<>(driver)
               .withTimeout(Duration.ofSeconds(20))
               .pollingEvery(Duration.ofSeconds(2))
               .until(webDriver -> webDriver.findElement(By.xpath("//input[@id='m-state']")));

       boolean isStatusFieldPresent = status.isDisplayed();
       System.out.println(isStatusFieldPresent);

       WebElement shipping = driver.findElement(By.xpath("//button[@id='accordion3id']"));
       shipping.click();

       isStatusFieldPresent = new FluentWait<>(driver)
               .withTimeout(Duration.ofSeconds(20))
               .pollingEvery(Duration.ofSeconds(2))
               .until(webDriver -> webDriver.findElement(By.xpath("//input[@id='m-state']")))
               .isDisplayed();

       System.out.println(isStatusFieldPresent);

driver.quit();
	}

}
