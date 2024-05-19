package Pom; // Declares the package name for this class, used to organize related classes.

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; // Imports the By class from Selenium for locating elements.
import org.openqa.selenium.WebDriver; // Imports the WebDriver interface from Selenium for browser control.

public class Login { // Declares the Login class which is public and can be accessed by other classes.

    WebDriver driver; // Declares a WebDriver instance to interact with the web browser.

    By userName = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"); // Locator for the username input field on the login page, identified by its name attribute.
 
    By password = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]"); // Locator for the password input field on the login page, identified by its name attribute.
    By titleText = By.xpath("//head//title"); // Locator for the title element on the login page, identified by its class name.
    By login = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]"); // Locator for the login button on the login page, identified by its name attribute.

    // Constructor for the Login class. It initializes the driver instance for this class.
    public Login(WebDriver driver){ 
        this.driver = driver; // Assigns the passed WebDriver instance to the local driver variable.
      
    }

    // Method to set the username in its input field.
    public void setUserName(String strUserName){ 
        driver.findElement(userName).sendKeys(strUserName); // Locates the username input field and sends the provided username to it.
    }

    // Method to set the password in its input field.
    public void setPassword(String strPassword){ 
         driver.findElement(password).sendKeys(strPassword); // Locates the password input field and sends the provided password to it.
    }

    // Method to simulate the click action on the login button.
    public void clickLogin(){ 
            driver.findElement(login).click(); // Locates the login button and performs a click action on it.
    }

    // Method to get the title text of the login page.
    public String getLoginTitle(){ 
     return driver.findElement(titleText).getText(); // Locates the title element and returns its text content.
    }

    // Method to perform the login operation using username and password.
    public void loginToHRMS(String strUserName, String strPasword) throws InterruptedException{ 
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Thread.sleep(2000);
        this.setUserName(strUserName);
        Thread.sleep(2000);// Calls setUserName method to fill the username.
        this.setPassword(strPasword);
        Thread.sleep(2000);// Calls setPassword method to fill the password.
        this.clickLogin(); // Calls clickLogin method to submit the login form.
    }

}
