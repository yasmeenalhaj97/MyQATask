package qaAutoTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String baseUrl = "https://demoqa.com/alerts";
	      //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.get(baseUrl);
	   WebElement  confirmBox = driver.findElement(By.id("confirmButton"));
	 //  confirmBox.click();
	  
//	   Alert confirmAlert=driver.switchTo().alert();
//	   Thread.sleep(2000);
//	   confirmAlert.dismiss();
//	   WebElement  alertText = driver.findElement(By.id("confirmResult"));

       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       wait.until(ExpectedConditions.alertIsPresent());
       Alert confirmAlert = driver.switchTo().alert();
       confirmAlert.dismiss(); 
       WebElement confirmationResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmResult")));
       String alertText = confirmationResult.getText();

 
	   
	   if (alertText.equals("You selected Ok")) {
           System.out.println(alertText);
       } else {
           System.out.println(alertText);
       }
	   
	   driver.quit();

	}

}
