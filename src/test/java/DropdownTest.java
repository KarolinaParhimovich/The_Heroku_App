import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.DropdownPomPage;

import java.util.List;

public class DropdownTest extends BaseTest {
    @Test
    public void dropdownAllElementsTest() {

        WebElement dropdownList = driver.findElement(By.id("dropdown"));
        Select selectOption = new Select(dropdownList);
        Assert.assertEquals(selectOption.getOptions().size(), "3");
    }
    @Test
    public void dropDownTest() {
        DropdownPomPage dropdownPomPage = new DropdownPomPage(driver);
        dropdownPomPage.openDropdownPage();
        WebElement option1 = driver.findElement(By.xpath("//select[@id='dropdown']/option[@value='1']"));
        option1.click();
        Assert.assertEquals(option1.isSelected(), true, "Option 1 is selected");
        WebElement option2= driver.findElement(By.xpath("//select[@id='dropdown']/option[@value='2']"));
        option2.click();
        Assert.assertEquals(option2.isSelected(), true, "Option 2 is selected");
    }
}
