import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {
    @Test
    public void inputsTest() {
        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.findElement((By.linkText("Inputs"))).click();
        driver.findElement(By.xpath("//input")).sendKeys(Keys.ARROW_UP, Keys.ARROW_UP);
        String upKeyResult = driver.findElement(By.xpath("//input")).getAttribute("value");
        Assert.assertEquals(upKeyResult, "2");
        driver.findElement(By.xpath("//input")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN);
        String downKeyResult = driver.findElement(By.xpath("//input")).getAttribute("value");
        Assert.assertEquals(downKeyResult, "-1");
    }
}
