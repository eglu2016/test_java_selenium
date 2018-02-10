import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Google Page
 * Created by lenovo-710s on 16.07.2017.
 */
public class GooglePage extends BasePage {

    GooglePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "q")
    WebElement searchField;

    @FindBy(xpath = "(//div[@class='g']//span)[2]")
    WebElement firstResult;

    By firstResultBy = by("(//div[@class='g']//span)[2]");

    public void searchMore(String text) {
        searchField.sendKeys(text, Keys.ENTER);
    }
}
