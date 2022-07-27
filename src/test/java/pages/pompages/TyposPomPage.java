package pages.pompages;

import Constants.URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPomPage extends BasePomPage {
    public TyposPomPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage() {
        driver.get(URLS.TYPOS);
    }
}

