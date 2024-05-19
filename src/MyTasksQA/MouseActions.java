package MyTasksQA;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		Actions actions = new Actions(driver);
		
//		***********mouse actions****************
		 String dragdrop = "https://jqueryui.com/draggable/";
         driver.get(dragdrop);
         driver.switchTo().frame(0);
         WebElement draggableElement = driver.findElement(By.id("draggable"));
         
         actions.clickAndHold(draggableElement)
                .moveByOffset(150, 100) 
                .release()
                .perform();
              System.out.println("Drag and drop successful!");
              Thread.sleep(3000);

	}

}
