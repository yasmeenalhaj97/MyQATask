package Pom; // Declares the package name for this class, used to organize related classes.

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; // Imports the By class from Selenium for locating elements.
import org.openqa.selenium.WebDriver; // Imports the WebDriver interface from Selenium for browser control.

public class Login { 

    WebDriver driver; 

    By userName = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"); // Locator for the username input field on the login page, identified by its name attribute.
 
    By password = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]"); // Locator for the password input field on the login page, identified by its name attribute.
    By titleText = By.xpath("//head//title");
    By login = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]"); 

 
    public Login(WebDriver driver){ 
        this.driver = driver;
      
    }


    public void setUserName(String strUserName){ 
        driver.findElement(userName).sendKeys(strUserName); 
    }


    public void setPassword(String strPassword){ 
         driver.findElement(password).sendKeys(strPassword); 
    }

    public void clickLogin(){ 
            driver.findElement(login).click(); 
    }

  
    public String getLoginTitle(){ 
     return driver.findElement(titleText).getText();
    }

  
    public void loginToHRMS(String strUserName, String strPasword) throws InterruptedException{ 
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Thread.sleep(2000);
        this.setUserName(strUserName);
        Thread.sleep(2000);
        this.setPassword(strPasword);
        Thread.sleep(2000);
        this.clickLogin(); 
    }

}
