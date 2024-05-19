package qaAutoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String baseUrl = "https://chandanachaitanya.github.io/selenium-practice-site/";
	      Thread.sleep(3000);
	   driver.get(baseUrl);
	   //******************checkbox*************************
	   WebElement twoWheel = driver.findElement(By.id("twoWheelVehicles"));
       List<WebElement> checkboxes1 = twoWheel.findElements(By.tagName("input"));
	   WebElement fourWheelVehiclesDiv = driver.findElement(By.id("fourWheelVehicles"));
       List<WebElement> checkboxes2 = fourWheelVehiclesDiv.findElements(By.tagName("input"));

	   for (WebElement checkbox : checkboxes1) {
		   Thread.sleep(1000);
           if (!checkbox.isSelected()) {
               checkbox.click();
           }
       }
	   for (WebElement checkbox : checkboxes2) {
		   Thread.sleep(1000);
           if (!checkbox.isSelected()) {
               checkbox.click();
           }
       }
	   //*******************Radio selector*********************
	   Thread.sleep(3000);
	   WebElement magazines= driver.findElement(By.id("magazines-radio-btn"));

       if (!magazines.isSelected()) {
          
    	   magazines.click();
       }
       Thread.sleep(1000);

       WebElement selfhelp = driver.findElement(By.id("self-help-radio-btn"));

   
       if (!selfhelp.isSelected()) {

    	   selfhelp.click();
       }

//*********************************list***************************
       Thread.sleep(3000);
       Select ProgramingLanguage=new Select(driver.findElement(By.id("programming-languages")));
       
       ProgramingLanguage.selectByValue("C++");
       Thread.sleep(1000);
       ProgramingLanguage.selectByIndex(0);
       
       Select selenium_suite=new Select(driver.findElement(By.id("selenium_suite")));
       selenium_suite.selectByIndex(2);
       Thread.sleep(1000);
       selenium_suite.deselectAll();
       
       
	}}
