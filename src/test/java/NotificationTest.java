import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.NotificationMessagePomPage;

public class NotificationTest extends BaseTest {
    @Test
    public void notificationTest() {
        NotificationMessagePomPage notificationMessagePomPage=new NotificationMessagePomPage(driver);
        notificationMessagePomPage.openNotificationMessagePage();
        notificationMessagePomPage.clickHere();
        String actualText = driver.findElement(By.cssSelector(".flash")).getText();
        Assert.assertEquals(actualText, "Action unsuccesful, please try again\n" + "×");
    }
}
