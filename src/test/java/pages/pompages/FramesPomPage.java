package pages.pompages;

import Constants.URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FramesPomPage extends BasePomPage {
    private By FRAME = By.className("demo-frame");
    private By ACTUALTEXT = By.xpath("//p[text()='Dropped!']");

    public FramesPomPage(WebDriver driver) {
        super(driver);
    }

    public void openDropAble() {
        driver.get(URLS.DROPABLE);
    }

    public void openFrame() {
        driver.switchTo().frame(driver.findElement(FRAME));
    }

    public void dragAndDrop() {
        Actions actions = new Actions(driver);
        WebElement elementSource = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement elementTarget = driver.findElement(By.xpath("//p[text()='Drop here']"));
        actions.dragAndDrop(elementSource, elementTarget).build().perform();
    }
    public String actualText(){
        return driver.findElement(ACTUALTEXT).getText();
    }
}
