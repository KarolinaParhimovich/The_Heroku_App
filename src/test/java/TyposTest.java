import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TyposTest extends BaseTest {
    @Test
    public void typosTest() {
        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.findElement((By.linkText("Typos"))).click();
        String withOrWithoutTypoText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]")).getText();
        Assert.assertEquals(withOrWithoutTypoText, "Sometimes you'll see a typo, other times you won't.", "Error: the word 'won,t' is misspelled");
    }
}
