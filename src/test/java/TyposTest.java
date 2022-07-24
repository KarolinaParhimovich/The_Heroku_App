import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.TyposPomPage;

public class TyposTest extends BaseTest {
    @Test
    public void typosTest() {
        TyposPomPage typosPomPage=new TyposPomPage(driver);
        typosPomPage.clickTypos();
        String withOrWithoutTypoText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]")).getText();
        Assert.assertEquals(withOrWithoutTypoText, "Sometimes you'll see a typo, other times you won't.", "Error: the word 'won,t' is misspelled");
    }
}
