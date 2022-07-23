import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


public class CheckboxesTest extends BaseTest {
    @Test
    public void firstBoxUnchecked() {
        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.findElement((By.linkText("Checkboxes"))).click();
        boolean unchecked = driver.findElement(By.xpath("(//input)[1]")).isSelected();
        Assert.assertFalse(unchecked, "Checked");
    }

    @Test
    public void firstBoxChecked() {
        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.findElement((By.linkText("Checkboxes"))).click();
        driver.findElement(By.xpath("(//input)[1]")).click();
        boolean unchecked = driver.findElement(By.xpath("(//input)[1]")).isSelected();
        Assert.assertTrue(unchecked, "Unchecked");
    }

    @Test
    public void secondBoxChecked() {
        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.findElement((By.linkText("Checkboxes"))).click();
        boolean unchecked = driver.findElement(By.xpath("(//input)[2]")).isSelected();
        Assert.assertTrue(unchecked, "Unchecked");
    }

    @Test
    public void secondBoxUnchecked() {
        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.findElement((By.linkText("Checkboxes"))).click();
        driver.findElement(By.xpath("(//input)[2]")).click();
        boolean unchecked = driver.findElement(By.xpath("(//input)[2]")).isSelected();
        Assert.assertFalse(unchecked, "Checked");
    }
}
