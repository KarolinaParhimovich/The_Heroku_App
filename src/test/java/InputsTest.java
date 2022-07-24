import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.InputsPomPage;

public class InputsTest extends BaseTest {
    @Test
    public void inputsTest() {
        InputsPomPage inputsPomPage = new InputsPomPage(driver);
        inputsPomPage.clickInputs();
        inputsPomPage.numberUp();
        inputsPomPage.numberUp();
        inputsPomPage.numberDown();
        String keyResult = driver.findElement(By.xpath("//input")).getAttribute("value");
        Assert.assertEquals(keyResult, "1");
    }
}
