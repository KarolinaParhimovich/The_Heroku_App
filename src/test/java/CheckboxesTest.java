import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import pages.pompages.CheckboxPomPage;


public class CheckboxesTest extends BaseTest {
    @Test
    public void firstBoxUnchecked() {
        CheckboxPomPage checkboxPomPage = new CheckboxPomPage(driver);
        checkboxPomPage.clickCheckboxes();
        boolean unchecked = driver.findElement(By.xpath("(//input)[1]")).isSelected();
        Assert.assertFalse(unchecked, "Checked");
    }

    @Test
    public void firstBoxChecked() {
        CheckboxPomPage checkboxPomPage = new CheckboxPomPage(driver);
        checkboxPomPage.clickCheckboxes();
        checkboxPomPage.clickCheckbox1();
        boolean unchecked = driver.findElement(By.xpath("(//input)[1]")).isSelected();
        Assert.assertTrue(unchecked, "Unchecked");
    }

    @Test
    public void secondBoxChecked() {
        CheckboxPomPage checkboxPomPage = new CheckboxPomPage(driver);
        checkboxPomPage.clickCheckboxes();
        boolean unchecked = driver.findElement(By.xpath("(//input)[2]")).isSelected();
        Assert.assertTrue(unchecked, "Unchecked");
    }

    @Test
    public void secondBoxUnchecked() {
        CheckboxPomPage checkboxPomPage = new CheckboxPomPage(driver);
        checkboxPomPage.clickCheckboxes();
        checkboxPomPage.clickCheckbox2();
        boolean unchecked = driver.findElement(By.xpath("(//input)[2]")).isSelected();
        Assert.assertFalse(unchecked, "Checked");
    }
}
