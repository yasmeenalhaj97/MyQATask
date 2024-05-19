package qaAutoTest;

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
//		 String dragdrop = "https://jqueryui.com/draggable/";
//         driver.get(dragdrop);
//         driver.switchTo().frame(0);
//         WebElement draggableElement = driver.findElement(By.id("draggable"));
//         
//         actions.clickAndHold(draggableElement)
//                .moveByOffset(150, 100) 
//                .release()
//                .perform();
//              System.out.println("Drag and drop successful!");
//              Thread.sleep(3000);
//		
		
		
		
		
		
//		*****************tooltip*******************
		String toolTip = "https://jqueryui.com/tooltip/";
	
		driver.get(toolTip);
		Thread.sleep(2000);
		driver.switchTo().frame(0); 
        WebElement Field = driver.findElement(By.id("age"));

        actions.moveToElement(Field).perform();
        Thread.sleep(2000);
      WebElement tooltipContent = driver.findElement(By.className("ui-tooltip-content"));
//        WebElement tooltipContent = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
        String tooltipText = tooltipContent.getText();
        if(tooltipText.contains("We ask for your age only for statistical purposes")) {
        System.out.println("you are standing now on age field and the Tooltip Text is: " + tooltipText);
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
				
////***************upload file**********
//	      String uploadFileURL = "https://demo.guru99.com/test/upload/";
//	  	
//	  	driver.get(uploadFileURL);
//	  	WebElement UploadFile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
//	  	UploadFile.sendKeys("C:\\Users\\yalhajissa\\OneDrive - Estarta Solutions\\Desktop\\recycling(yasmeen alhaj).pptx");
//	  	Thread.sleep(2000);
//	  	driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
//	  	Thread.sleep(2000);
//	  	driver.quit();
//	  	
//	  	
//	  	;

	}

}
