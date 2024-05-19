package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

	WebDriver driver;
	By logoutbtn = By.xpath("//p[contains(text(),'Logout')]");
	public Logout(WebDriver driver) {
		this.driver = driver; 
		 
	}
	public void logoutBtn(){ 
        driver.findElement(logoutbtn).click(); 
   }

}
