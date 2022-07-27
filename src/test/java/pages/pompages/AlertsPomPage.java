package pages.pompages;

import Constants.URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPomPage extends BasePomPage{
    private By JSALERT=By.xpath("//button[text()='Click for JS Alert']");
    private By JSCONFIRM=By.xpath("//button[text()='Click for JS Confirm']");
    private By JSPROMPT=By.xpath("//button[text()='Click for JS Prompt']");
    public AlertsPomPage(WebDriver driver) {
        super(driver);
    }
    public void openAlertsPage() {
        driver.get(URLS.ALERTS);
    }
    public void pressJSAlert(){
        driver.findElement(JSALERT).click();
    }
    public void pressJSConfirm(){
        driver.findElement(JSCONFIRM).click();
    }
    public void pressJSPrompt(){
        driver.findElement(JSPROMPT).click();
    }
}

