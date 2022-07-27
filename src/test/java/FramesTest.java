import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest {
    @Test
    public void dragAndDropTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.getWindowHandle();
        WebElement frame=driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);
        Actions actions=new Actions(driver);
        WebElement elementSource=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement elementTarget=driver.findElement(By.xpath("//p[text()='Drop here']"));
        actions.dragAndDrop(elementSource,elementTarget).build().perform();
        String actualText=driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
        driver.quit();
        Assert.assertEquals(actualText, "Dropped!");

    }
}

