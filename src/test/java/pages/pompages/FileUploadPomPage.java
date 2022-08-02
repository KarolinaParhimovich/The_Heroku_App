package pages.pompages;

import Constants.URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPomPage extends BasePomPage{
    private By FILE_UPLOAD_INPUT=By.id("file-upload");
    private By FILE_SUBMIT_INPUT=By.id("file-submit");
    private By FILEMAME=By.className("panel");
    public FileUploadPomPage(WebDriver driver) {
        super(driver);
    }
    public void openFileUploadPage() {
        driver.get(URLS.FILEUPLOAD);
    }
    public void uploadFile(String path){
        driver.findElement(FILE_UPLOAD_INPUT);
    }
    public void submitFile(){
        driver.findElement(FILE_SUBMIT_INPUT).click();
    }
    public String fileName(){
        return driver.findElement(FILEMAME).getText();
    }
}
