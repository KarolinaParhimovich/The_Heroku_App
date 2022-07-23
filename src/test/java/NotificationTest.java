import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationTest extends BaseTest{
    @Test
    public void notificationTest() {
        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.findElement((By.linkText("Notification Messages"))).click();
        driver.findElement((By.linkText("Click here"))).click();
        String actualText = driver.findElement(By.cssSelector(".flash")).getText();
        Assert.assertEquals(actualText, "Action unsuccesful, please try again\n" + "×");
    }
}
