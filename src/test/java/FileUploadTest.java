import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.FileUploadPomPage;

public class FileUploadTest extends BaseTest {
    @Test
    public void fileUploadTest() {
        FileUploadPomPage fileUploadPomPage=new FileUploadPomPage(driver);
        String path = System.getProperty("user.dir").concat("/src/test/resources/cart.jpg");
        fileUploadPomPage.openFileUploadPage();
        fileUploadPomPage.uploadFile(path);
        fileUploadPomPage.submitFile();
        String fileName=driver.findElement(By.className("panel")).getText();
        Assert.assertEquals(fileName, " 47e1adaa0e55e1d4a6f286125dd20bf6.jpg ");
    }
}
