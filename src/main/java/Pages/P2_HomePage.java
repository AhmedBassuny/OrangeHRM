package Pages;

import Locators.L2_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static java.util.Objects.requireNonNull;
public class P2_HomePage extends L2_HomePage {
    private final WebDriver driver;
    public P2_HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void AddUser(String EmployeeName ,String username, String password) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait (driver, java.time.Duration.ofSeconds(20));
        requireNonNull(wait.until(ExpectedConditions.visibilityOfElementLocated(super.AdminPanel))).click();;
        requireNonNull(wait.until(ExpectedConditions.visibilityOfElementLocated(super.AddUser))).click();
        wait.until(ExpectedConditions.elementToBeClickable(super.UsersRole)).click();
        Thread.sleep(200);
        wait.until(ExpectedConditions.elementToBeClickable(super.UserRoleOption)).click();
        wait.until(ExpectedConditions.elementToBeClickable(super.StatusMenu)).click();
        Thread.sleep(200);
        wait.until(ExpectedConditions.elementToBeClickable(super.StatusOption)).click();
        requireNonNull(wait.until(ExpectedConditions.visibilityOfElementLocated(super.EmployeeName))).sendKeys(EmployeeName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(super.EmployeeSuggestion)).click();
        requireNonNull(wait.until(ExpectedConditions.visibilityOfElementLocated(super.UsernameField))).sendKeys(username);
        requireNonNull(wait.until(ExpectedConditions.visibilityOfElementLocated(super.PasswordField))).sendKeys(password);
        requireNonNull(wait.until(ExpectedConditions.visibilityOfElementLocated(super.ConfirmPasswordField))).sendKeys(password);
        requireNonNull(wait.until(ExpectedConditions.visibilityOfElementLocated(super.SaveButton))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(super.SearchUsernameField));
        driver .findElement(super.SearchUsernameField).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(super.SearchButton));
        // Click search button
        driver.findElement(super.SearchButton).click();

// Wait until the result username cell contains the searched username
        wait.until(ExpectedConditions.textToBePresentInElementLocated(super.ResultUsername, username));
        WebElement resultUsernameElement = driver.findElement(super.ResultUsername);

        // Verify
        String resultUsername = resultUsernameElement.getText().trim();
        Assert.assertEquals(resultUsername, username, "❌ User not added or search failed!");
    }
}
