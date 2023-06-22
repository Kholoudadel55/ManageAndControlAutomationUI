package pages;
import com.shaft.driver.SHAFT;
import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class NotificationsPage extends PageBase {
    By notificationsTab = By.id("sidebar_manage_notifications");
    By notificationCreationBtn = By.cssSelector(".btn-primary");
    By notificationRuleNameField = By.id("form_field_name");
    By notificationApplyOnDropDownBox = By.xpath("(//span[contains(text(),'Choose')])[1]");
    By notificationApplyOnTitle = By.xpath("//span[contains(text(),'Apply on')]");
    By notificationApplyOnOption = By.cssSelector("div > a.w-full:nth-of-type(1)");
    By notificationFrequencyDropDownBox = By.id("form_field_frequency");
    By notificationFrequencyTitle = By.xpath("//span[contains(text(),'Frequency')]");
    By notificationUsersDropDownBox = By.xpath("(//span[contains(text(),'Choose')])[1]");
    By notificationUsersOption = By.cssSelector("div > a:nth-child(3)");
    By notificationUsersToBeTitle = By.xpath("//span[contains(text(),'Users to be notified')]");
    By notificationRuleSaveBtn = By.id("form_save_button");

    public NotificationsPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    public void clicksNotificationTab() {
        clickOnElement(notificationsTab);

    }

    public void clicksCreateNotificationBtn() {
        clickOnElement(notificationCreationBtn);

    }
    public void enterNotificationRuleName(){

        setElementText(notificationRuleNameField, "Trigger the purchasing");
    }
    public void clickNotificationApplyDropDownBox(){
        clickOnElement(notificationApplyOnDropDownBox);
    }
    public void clickNotificationApplyOption(){
        clickOnElement(notificationApplyOnOption);
        clickOnElement(notificationApplyOnTitle);
    }
   public void clickNotificationFrequencyDropDownBox(){
        clickOnElement(notificationFrequencyDropDownBox);

        Select frequency = new Select(driver.getDriver().findElement(notificationFrequencyDropDownBox));
        frequency.selectByValue("1");
        clickOnElement(notificationFrequencyTitle);
   }
   public void clickNotificationUsersDropDownBox(){
        clickOnElement(notificationUsersDropDownBox);
   }
   public void selectNotificationUserOption(){
        driver.element().clickUsingJavascript(notificationUsersOption);
       // clickOnElement(notificationUsersOption);
        clickOnElement(notificationUsersToBeTitle);
   }
   public void enterNotificationSaveBtn(){

        clickOnElement(notificationRuleSaveBtn);
   }
}