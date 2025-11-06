package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Driver {

    // Thread-safe WebDriver instance
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Setup method to initialize ChromeDriver per thread
    public static void setupChrome() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--disable-gpu");
        options.addArguments("--incognito");
        options.addArguments("--window-size=1920,1080");

        driver.set(new ChromeDriver(options));
        getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    // Getter for the current thread's WebDriver
    public static WebDriver getDriver() {
        return driver.get();
    }

    // Quit and clean up the WebDriver for the current thread
    public static void chromeQuit() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
