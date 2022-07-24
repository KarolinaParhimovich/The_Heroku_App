package pages.pompages;

import Constants.URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPomPage extends BasePomPage{
    private By TYPOS_LINK = By.linkText("Typos");
    public TyposPomPage(WebDriver driver) {
        super(driver);
    }
    public void openTyposPage() {
        driver.get(URLS.TYPOS);
    }

    public void clickTypos() {
        driver.findElement(TYPOS_LINK).click();
    }
}
