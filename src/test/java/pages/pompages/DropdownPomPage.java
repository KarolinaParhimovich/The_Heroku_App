package pages.pompages;

import Constants.URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownPomPage extends BasePomPage{
    public DropdownPomPage(WebDriver driver) {
        super(driver);
    }
    public void openDropdownPage() {
        driver.get(URLS.DROPDOWN);
    }
}
