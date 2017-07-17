import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Base Page
 * Created by lenovo-710s on 16.07.2017.
 */
public class BasePage extends ConciseAPI {

    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private WebDriver driver;

    @Override
    public WebDriver getWebDriver() {
        return driver;
    }
}