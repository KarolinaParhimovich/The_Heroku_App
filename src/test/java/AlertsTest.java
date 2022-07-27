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
        String actualText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(actualText, "I am a JS Alert");
    }
    @Test
    public void jsConfirm(){
        AlertsPomPage alertsPomPage=new AlertsPomPage(driver);
        alertsPomPage.openAlertsPage();
        alertsPomPage.pressJSConfirm();
        String actualText = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        Assert.assertEquals(actualText, "I am a JS Confirm");
    }
    @Test
    public void jsPrompt(){
        AlertsPomPage alertsPomPage=new AlertsPomPage(driver);
        alertsPomPage.openAlertsPage();
        alertsPomPage.pressJSPrompt();
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();
        WebElement actualText=driver.findElement(By.id("result"));
        boolean isActualTextDisplayed=actualText.isDisplayed();
        Assert.assertTrue(isActualTextDisplayed,"Text is not displayed");
    }
}
