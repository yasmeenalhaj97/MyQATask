package Pom; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 

public class HomePage {

    WebDriver driver; 

    By SickleaveBalance = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]"); // Declares and initializes a locator for the username element on the home page using XPath.
    By AnnualleaveBalance = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]");
    By LastLoginDate=By.cssSelector("div.relative.w-full div.MuiBox-root.css-k008qs:nth-child(1) div.MuiGrid-root.MuiGrid-container.overflow-auto.css-1d3bbye div.MuiGrid-root.MuiGrid-item.css-1wxaqej:nth-child(2) div.MuiStack-root.css-j7qwjs header.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation4.MuiAppBar-root.MuiAppBar-colorPrimary.MuiAppBar-positionFixed.mui-fixed.css-10kftks div.MuiToolbar-root.MuiToolbar-gutters.MuiToolbar-regular.css-i6s8oy div.MuiTypography-root.MuiTypography-h6.MuiTypography-noWrap.items-center.css-1wc980h div.MuiStack-root.css-aqeck4 div.MuiStack-root.css-b3l3c6:nth-child(2) div.flex.items-center.justify-start.p-1.bg-white.rounded-3xl.min-w-11.gap-x-2.MuiBox-root.css-c7jppo:nth-child(1) div.MuiStack-root.css-17mvcka > p.MuiTypography-root.MuiTypography-body1.font-normal.leading-none.text-right.text-slate-500.font-alexandria.css-yqifiz");
    
    public HomePage(WebDriver driver){ 
        this.driver = driver; 
    }

    
    public String getSickleavesBalance(){ 
         return driver.findElement(SickleaveBalance).getText(); 
    }
    public String getAnnualleavesBalance(){ 
        return driver.findElement(AnnualleaveBalance).getText(); 
   }
    public String getLastLoginDate(){ 
        return driver.findElement(LastLoginDate).getText(); 
   }
}
