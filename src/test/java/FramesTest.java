import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.FramesPomPage;

public class FramesTest extends BaseTest {
    @Test
    public void dragAndDropTest()  {
        FramesPomPage framesPomPage=new FramesPomPage(driver);
        framesPomPage.openDropAble();
        framesPomPage.openFrame();
        framesPomPage.dragAndDrop();
        String actualText= framesPomPage.actualText();
        Assert.assertEquals(actualText, "Dropped!");

    }
}

