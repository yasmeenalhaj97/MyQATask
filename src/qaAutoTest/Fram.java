package qaAutoTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      String baseUrl = "https://demoqa.com/frames";
	   driver.get(baseUrl);
	   Thread.sleep(3000);
	   WebElement NestedFrame=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]"));
	   NestedFrame.click();
	   Thread.sleep(3000);
	   driver.switchTo().frame(0);
	   List <WebElement> elements=driver.findElements(By.tagName("iframe"));
	   System.out.println(elements.size());
	   driver.switchTo().defaultContent();
	   driver.switchTo().frame("frame2");
	   WebElement text=driver.findElement(By.id("sampleHeading"));
	System.out.println(text.getText());
	
	   

	   driver.quit();
	   
	   
	}

}
