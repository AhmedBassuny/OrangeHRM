package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import Locators.L1_Login;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class P1_Login extends L1_Login {
   private final WebDriver driver;
    public P1_Login(WebDriver driver) {
        this.driver = driver;
    }
    public void login (String username, String password){
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(super.username));
        wait.until(ExpectedConditions.visibilityOfElementLocated(super.password));
        wait.until(ExpectedConditions.visibilityOfElementLocated(super.loginButton));

        driver.findElement(super.username).sendKeys(username);
        driver.findElement(super.password).sendKeys(password);
        driver.findElement(super.loginButton).click();
        WebDriverWait wait3 = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        wait3.until(ExpectedConditions.urlToBe("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", "❌ Not redirected to dashboard!");

    }
}
