package MyTasksQA;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
;
    driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");

    WebElement checkbox= driver.findElement(By.xpath("//input[@id='bicycle-checkbox']"));
Thread.sleep(3000);
    checkbox.click();
    boolean status = checkbox.isSelected();

    System.out.println(status);
    if(status){
        System.out.println("The element is selected in the web page");
    }
    driver.quit();
}

}
