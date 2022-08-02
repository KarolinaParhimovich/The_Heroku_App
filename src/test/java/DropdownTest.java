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
        DropdownPomPage dropdownPomPage=new DropdownPomPage(driver);
        dropdownPomPage.openDropdownPage();
        dropdownPomPage.getSizeOfOptions();
        Assert.assertEquals(dropdownPomPage.getSizeOfOptions(),3);
    }
    @Test
    public void dropDownTest() {
        DropdownPomPage dropdownPomPage = new DropdownPomPage(driver);
        dropdownPomPage.openDropdownPage();
        dropdownPomPage.pressOption1();
        dropdownPomPage.option1IsSelected();
        Assert.assertEquals(dropdownPomPage.option1IsSelected(), true, "Option 1 is selected");
        dropdownPomPage.pressOption2();
        dropdownPomPage.option2IsSelected();
        Assert.assertEquals(dropdownPomPage.option2IsSelected(), true, "Option 2 is selected");
    }
}
