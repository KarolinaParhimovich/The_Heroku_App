package pages.pompages;

import Constants.URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPomPage extends BasePomPage {
    private By CHECKBOX_1_INPUT = By.xpath("(//input)[1]");
    private By CHECKBOX_2_INPUT = By.xpath("(//input)[2]");

    public CheckboxPomPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckboxPage() {
        driver.get(URLS.CHECKBOXES);
    }

    public void clickCheckbox1() {
        driver.findElement(CHECKBOX_1_INPUT).click();
    }

    public void clickCheckbox2() {
        driver.findElement(CHECKBOX_2_INPUT).click();
    }
}
