package Pages;

import Locators.L3_Logout;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class P3_Logout extends L3_Logout {
    WebDriver driver;
    public P3_Logout(WebDriver driver) {
        this.driver = driver;
    }
    public void logout() {
        driver.findElement(super.ProfileMenu).click();
        driver.findElement(super.LogoutButton).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", "❌ Not redirected to Login Page");

    }
}
