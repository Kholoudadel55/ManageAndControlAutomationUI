package common;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class PageBase {
    protected SHAFT.GUI.WebDriver driver;
public PageBase (SHAFT.GUI.WebDriver driver) {this.driver = driver;}
    public void clickOnElement (By elementLocator) {
    driver.element().click(elementLocator);
    }

    public void setElementText(By elementLocator, String text) {
    driver.element().type(elementLocator,text);
    }
}
