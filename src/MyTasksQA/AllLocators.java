package MyTasksQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AllLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(baseUrl);
Thread.sleep(3000);
//Xpath
		WebElement username = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]"));
		username.sendKeys("Admin");
		//name
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		//cssSelector
		WebElement button = driver.findElement(By.cssSelector("div.orangehrm-login-layout div.orangehrm-login-layout-blob div.orangehrm-login-container div.orangehrm-login-slot-wrapper div.orangehrm-login-slot div.orangehrm-login-form form.oxd-form div.oxd-form-actions.orangehrm-login-action:nth-child(4) > button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button"));
		button.click();
		Thread.sleep(3000);
		//class
		WebElement menu = driver.findElement(By.className("oxd-userdropdown-tab"));
		menu.click();
		//Link Text
		Thread.sleep(1000);
		WebElement Logout = driver.findElement(By.linkText("Logout"));
		Logout.click();
		

}}
