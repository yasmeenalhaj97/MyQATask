package qaAutoTest;

import java.net.HttpURLConnection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://demo.guru99.com/V4/");
//    login
		js.executeScript("document.getElementsByName('uid')[0].value = '123456';");
		js.executeScript("document.getElementsByName('password')[0].value = 'password';");
		js.executeScript("document.getElementsByName('btnLogin')[0].click();");
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
//reset 
		js.executeScript("document.getElementsByName('uid')[0].value = '123456';");
		Thread.sleep(2000);
		js.executeScript("document.getElementsByName('password')[0].value = 'password';");
		Thread.sleep(2000);
		js.executeScript("document.getElementsByName('btnReset')[0].click();");
		Thread.sleep(2000);
		String resetuserName = (String) js.executeScript("return document.getElementsByName('uid')[0].value;");
		String resetPassword = (String) js.executeScript("return document.getElementsByName('password')[0].value;");
		if (resetuserName.isEmpty() || resetPassword.isEmpty()) {
			System.out.println("Username field is empty after clicking reset button.");
			System.out.println("Password field is empty after clicking reset button.");
		} else {
			System.out.println("Username field is not empty after clicking reset button.");
			System.out.println("Password field is not empty after clicking reset button.");
		}
//  domain and title
		Thread.sleep(2000);
		String Domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain name = " + Domain);
		String Title = js.executeScript("return document.title;").toString();
		System.out.println("Title of the page  = " + Title);
		Thread.sleep(2000);
		driver.quit();

	}

}
