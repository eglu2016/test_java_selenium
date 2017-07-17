import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Helpers
 * Created by lenovo-710s on 16.07.2017.
 */
public abstract class ConciseAPI {

    public abstract WebDriver getWebDriver();

    public void AssertThat(ExpectedCondition<Boolean> condition) {
        WebDriverWait waiter = new WebDriverWait(getWebDriver(), 5);
        waiter.until(condition);
    }

    public WebElement $(By locator) {
        return getWebDriver().findElement(locator);
    }

    public void open(String url) {getWebDriver().get(url);
    }
}
