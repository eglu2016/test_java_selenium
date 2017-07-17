import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Base Test
 * Created by lenovo-710s on 16.07.2017.
 */
public class BaseTest extends ConciseAPI {

    protected static WebDriver driver = new FirefoxDriver();

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    @Override
    public WebDriver getWebDriver() {
        return driver;
    }
}
