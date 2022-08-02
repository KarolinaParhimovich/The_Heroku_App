package pages.pompages;

import Constants.URLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPomPage extends BasePomPage{
    private By OPTION1=By.xpath("//select[@id='dropdown']/option[@value='1']");
    private By OPTION2=By.xpath("//select[@id='dropdown']/option[@value='2']");
    public DropdownPomPage(WebDriver driver) {
        super(driver);
    }
    public void openDropdownPage() {
        driver.get(URLS.DROPDOWN);
    }
    public int getSizeOfOptions() {
        WebElement dropdownList = driver.findElement(By.id("dropdown"));
        Select selectOption = new Select(dropdownList);
        return selectOption.getOptions().size();
    }
    public void pressOption1(){
        driver.findElement(OPTION1).click();
    }
    public void pressOption2(){
        driver.findElement(OPTION2).click();
    }
    public boolean option1IsSelected(){
        return driver.findElement(OPTION1).isSelected();
    }
    public boolean option2IsSelected(){
        return driver.findElement(OPTION2).isSelected();
    }
}
