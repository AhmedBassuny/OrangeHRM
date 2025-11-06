package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class L2_HomePage {
 protected final By AdminPanel=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");
 protected final By AddUser=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
 protected final By UsersRole=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i" );
 protected final By UserRoleOption = By.xpath("//div[@role='option']/span[text()='Admin']");
 protected final By StatusMenu=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i" );
 protected final By StatusOption = By.xpath("//div[@role='option']/span[text()='Enabled']");
 protected final By EmployeeName=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");
 protected final By EmployeeSuggestion = By.xpath("//div[@role='listbox']//span");
 protected final By UsernameField=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input" );
 protected final By PasswordField=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input" );
 protected final By ConfirmPasswordField=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input" );
 protected final By SaveButton=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]" );
 protected final By SearchUsernameField=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input" );
 protected final By SearchButton=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]" );
 protected final By ResultUsername=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[2]/div" );
}
