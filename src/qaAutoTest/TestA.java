package qaAutoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestA {

	public static void main(String[] args) {
	     // declaration and instantiation of objects/variables
		  // 	System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
//		    	FirefoxOptions options = new FirefoxOptions();
//		  	options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//		    	WebDriver driver = new FirefoxDriver(options);
				//WebDriver driver = new FirefoxDriver();
		    	System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//	System.setProperty("webdriver.edge.driver", "Driver/msedgedriver.exe");
		
			  //   WebDriver driver = new EdgeDriver();

			  
		    	
		        String baseUrl = "http://demo.guru99.com/test/newtours/";
		        String expectedTitle = "Welcome: Mercury Tours";
		        String actualTitle = "";
		 
		        // launch chrome  and direct it to the Base URL
		        driver.get(baseUrl);
		 
		        // get the actual value of the title
		        actualTitle = driver.getTitle();
		       
		        /*
		         * compare the actual title of the page with the expected one and print
		         * the result as "Passed" or "Failed"
		         */
		        if (actualTitle.contentEquals(expectedTitle)){
		            System.out.println("Test Passed!");
		        } else {
		            System.out.println("Test Failed");
		        }

		 
		        driver.quit();
		    }
		 
		}