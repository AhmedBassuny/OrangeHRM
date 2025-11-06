import Drivers.Chrome_Driver;
import Locators.L1_Login;
import Pages.P1_Login;
import Pages.P2_HomePage;
import Pages.P3_Logout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Add_Logout extends BaseTest {
    @Test
    public void testLoginAddLogout() throws InterruptedException {
        WebDriver driver = Chrome_Driver.getDriver();
        P1_Login login_obj = new P1_Login(driver);
        P2_HomePage home_obj = new P2_HomePage(driver);
        P3_Logout logout_obj = new P3_Logout(driver);
        login_obj.login("Admin", "admin123");
        home_obj.AddUser("Peter Mac Anderson", "JOANNA1", "JD123@!a");
        logout_obj.logout();
    }
}

