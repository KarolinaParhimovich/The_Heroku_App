package pages.pompages;

import Constants.URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class InputsPomPage extends BasePomPage {
    private By NUMBER_INPUT = By.xpath("//input");

    public InputsPomPage(WebDriver driver) {
        super(driver);
    }

    public void openInputsPage() {
        driver.get(URLS.INPUTS);
    }

    public void numberUp (){
        driver.findElement(NUMBER_INPUT).sendKeys(Keys.ARROW_UP);
    }
    public void numberDown(){
        driver.findElement(NUMBER_INPUT).sendKeys(Keys.ARROW_DOWN);
    }
}
