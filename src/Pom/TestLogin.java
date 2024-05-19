package Pom; // Declares the package name for this class, used to organize related classes.

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;



public class TestLogin { // Declares the TestLogin class which is public and can be accessed by other classes.

	 static String driverPath = "Driver/chromedriver.exe"; // Static variable to hold the path to the ChromeDriver executable.
    
    static WebDriver driver; // Static variable to hold the WebDriver instance.

    static Login objLogin; // Static variable to hold the Login object for login functionality.
static Logout objLogout;
    static HomePage objHomePage; // Static variable to hold the HomePage object for home page interactions.

	public static void main(String[] args) throws InterruptedException { // Main method, which is the entry point of the program.
        System.setProperty("webdriver.chrome.driver", driverPath); // Sets the system property to point to the ChromeDriver location.
        
        driver = new ChromeDriver(); // Instantiates the ChromeDriver, opening a Chrome browser instance.

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Sets an implicit wait of 10 seconds to allow elements to load.

        driver.get("https://172.16.16.170:555/login"); // Navigates to the specified URL for the test.
        WebElement  AdvanceBox = driver.findElement(By.id("details-button"));
        WebElement  proceedlink = driver.findElement(By.id("proceed-link")); 
        AdvanceBox.click();       
        proceedlink.click();
        Thread.sleep(3000);
        test_Home_Page_Appear_Correct(); // Calls the method to test if the home page appears as expected after login.
        driver.quit(); // Closes the browser and quits the WebDriver.
	}

    // Method to test if the home page appears correctly after login.
    public static void test_Home_Page_Appear_Correct() throws InterruptedException{
        objLogin = new Login(driver); // Instantiates a new Login object with the current driver.

        // Retrieves and verifies the title of the login page.
        String loginPageTitle = objLogin.getLoginTitle(); // Calls getLoginTitle method to fetch the title text.

    
       // Assert.assertTrue(loginPageTitle.contains("estarta Solutions Self Service Portal"));
 
  

        // Performs login using specified credentials.
        objLogin.loginToHRMS("ES2064", "P@ssw0rd"); // Calls the login method with username and password.
Thread.sleep(2000);
        objHomePage = new HomePage(driver); // Instantiates a new HomePage object with the current driver.
System.out.println("Sick Leave Balance = " +objHomePage.getSickleavesBalance());
System.out.println("Annual Leave Balance = " +objHomePage.getAnnualleavesBalance());
System.out.println("Your Last Login Date is=" +objHomePage.getLastLoginDate());
objLogout = new Logout(driver);
Thread.sleep(2000);
objLogout.logoutBtn();
        // Verifies the user name on the home page.
      // Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123")); // Asserts that the user name on the home page contains the expected ID.
    }
}
