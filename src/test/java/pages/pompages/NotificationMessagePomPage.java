package pages.pompages;

import Constants.URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationMessagePomPage extends BasePomPage {
    private By CLICK_HERE_LINK=By.linkText("Click here");
    public NotificationMessagePomPage(WebDriver driver) {
        super(driver);
    }
    public void openNotificationMessagePage(){
        driver.get(URLS.NOTIFICATION);
    }

    public void clickHere(){
        driver.findElement(CLICK_HERE_LINK).click();
    }
}
