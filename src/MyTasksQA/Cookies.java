package MyTasksQA;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
public class Cookies {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
   		WebDriver driver = new ChromeDriver();       
      String URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
      driver.navigate().to(URL);
   driver.manage().deleteCookieNamed("orangehrm");

      Cookie cookie1 = driver.manage().getCookieNamed("orangehrm");
 
          if(cookie1==null) {
          System.out.println("Cookies deleted successfully.");
          }else {
        	  System.out.println("Cookies not deleted");
          
          driver.quit();
     


	}}}


