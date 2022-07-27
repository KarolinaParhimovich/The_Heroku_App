package pages.pompages;

import org.openqa.selenium.WebDriver;

abstract public class BasePomPage {
    public WebDriver driver;
    public BasePomPage(WebDriver driver){
        this.driver=driver;
    }
}
