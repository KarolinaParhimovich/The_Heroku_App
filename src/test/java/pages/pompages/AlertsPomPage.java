package pages.pompages;

import Constants.URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    public String actualText(){
        return driver.switchTo().alert().getText();
    }
    public void alertAccept(){
        driver.switchTo().alert().accept();
    }
    public void alertDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void promptText(){
        driver.switchTo().alert().sendKeys("Hello");
    }
    public boolean isTextDisplayed() {
        WebElement actualText=driver.findElement(By.id("result"));
        return actualText.isDisplayed();
    }
}

