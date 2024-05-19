package MyTasksQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UplaodFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		Actions actions = new Actions(driver);
	      String uploadFileURL = "https://demo.guru99.com/test/upload/";
	  	
	  	driver.get(uploadFileURL);
	  	WebElement UploadFile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
	  	UploadFile.sendKeys("C:\\Users\\yalhajissa\\OneDrive - Estarta Solutions\\Desktop\\recycling(yasmeen alhaj).pptx");
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
	  	Thread.sleep(2000);
	  System.out.println(driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/ul[1]/li[1]/div[2]/h3[1]/center[1]")).getText());
	  	driver.quit();
	  	
	  	
	  	;

	}

	}


