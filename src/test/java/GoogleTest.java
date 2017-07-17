import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * класс
 * Created by lenovo-710s on 15.07.2017.
 */
public class GoogleTest extends BaseTest {

    private GooglePage googlePage = new GooglePage(driver);

    @Test
    public void testSearchTest(){

        open("http://google.com/ncr");

        googlePage.searchMore("Selenium");
        AssertThat(ExpectedConditions.textToBePresentInElement(googlePage.firstResult,"Selenium"));

        googlePage.searchMore(" chemical element");
        AssertThat(ExpectedConditions.textToBePresentInElement(googlePage.firstResult,
                "Selenium is a chemical element"));

    }
}
