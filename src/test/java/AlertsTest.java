import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.AlertsPomPage;

public class AlertsTest extends BaseTest {
    @Test
    public void jsAlert() {
        AlertsPomPage alertsPomPage = new AlertsPomPage(driver);
        alertsPomPage.openAlertsPage();
        alertsPomPage.pressJSAlert();
        String actualText = alertsPomPage.actualText();
        alertsPomPage.alertAccept();
        Assert.assertEquals(actualText, "I am a JS Alert");
    }
    @Test
    public void jsConfirm(){
        AlertsPomPage alertsPomPage=new AlertsPomPage(driver);
        alertsPomPage.openAlertsPage();
        alertsPomPage.pressJSConfirm();
        String actualText = alertsPomPage.actualText();
        alertsPomPage.alertDismiss();
        Assert.assertEquals(actualText, "I am a JS Confirm");
    }
    @Test
    public void jsPrompt(){
        AlertsPomPage alertsPomPage=new AlertsPomPage(driver);
        alertsPomPage.openAlertsPage();
        alertsPomPage.pressJSPrompt();
        alertsPomPage.promptText();
        alertsPomPage.alertAccept();
        alertsPomPage.isTextDisplayed();
        Assert.assertTrue(alertsPomPage.isTextDisplayed(),"Text is not displayed");
    }
}
