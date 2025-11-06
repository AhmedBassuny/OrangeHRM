import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Drivers.Chrome_Driver;

public class BaseTest {

    @BeforeClass
    public void setup() {
        Chrome_Driver.setupChrome();  // opens ONE browser
    }

    /*@AfterClass
    public void tearDown() {
        Chrome_Driver.chromeQuit();   // closes browser
    }*/
}
