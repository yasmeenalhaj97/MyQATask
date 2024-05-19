package qaAutoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {

	protected static WebDriver driver;
	 
	public static void main(String[] args) {
	
	System.setProperty ("webdriver.chrome.driver","Driver/chromedriver.exe" );
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	String eTitle = "Demo Guru99 Page";

	
	driver.get("http://demo.guru99.com/test/guru99home/" );

	driver.manage().window().maximize() ;
	
	   WebElement  Button = driver.findElement(By.xpath("//header/div[@id='rt-header']/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"));
	   Button.click();
	   WebElement  Button2 = driver.findElement(By.className("item"));
	   Button2.click();
	 String aTitle = "" ;
	aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		
	

	
	driver.quit();
 
	
}
}