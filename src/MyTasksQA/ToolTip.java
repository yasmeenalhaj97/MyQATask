package MyTasksQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		Actions actions = new Actions(driver);
		String toolTip = "https://demoqa.com/tool-tips";
		
		driver.get(toolTip);
		Thread.sleep(2000);
		
        WebElement Field = driver.findElement(By.cssSelector("#toolTipTextField"));

        actions.moveToElement(Field).perform();
        Thread.sleep(2000);
      WebElement tooltipContent = driver.findElement(By.className("tooltip-inner"));
//        WebElement tooltipContent = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
        String tooltipText = tooltipContent.getText();
        if(tooltipText.contains("You hovered over the text field")) {
        System.out.println("you are standing now on text field and the Tooltip Text is: " + tooltipText);
        }
        else {
        	System.out.println("you are standing now on the wrong field");
        }
        Thread.sleep(2000);
//        ************************keyboard action*************************
        Field.sendKeys("20");
        Thread.sleep(2000);
         Field.sendKeys(Keys.chord(Keys.CONTROL, "a")); 
         Thread.sleep(1000);
        Field.sendKeys(Keys.BACK_SPACE); 

        System.out.println("Text field cleared successfully!");
        driver.quit();

	}

}
