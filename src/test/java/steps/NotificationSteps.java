package steps;

import base.Hooks;
import com.shaft.driver.SHAFT;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.NotificationsPage;

public class NotificationSteps {
    SHAFT.GUI.WebDriver driver = Hooks.getDriver();
    NotificationsPage NotificationPageObject = new NotificationsPage(driver);

   //Notifications_Scenarios
    @And("User click on notifications tab")
    public void userClicksOnNotificationsTab() {NotificationPageObject.clicksNotificationTab();

    }

    @And("Users click on create notification rule button")
    public void usersClickOnCreateNotificationRuleButton() {NotificationPageObject.clicksCreateNotificationBtn();
    }
    @And("User enter name for the notification rule")
    public void userEntersNameForTheNotificationRule() {NotificationPageObject.enterNotificationRuleName();
    }

    @And("User enter apply on drop down box and select an option")
    public void userEnterApplyOnDropDownBoxAndSelectAnOption() {NotificationPageObject.clickNotificationApplyDropDownBox();
    NotificationPageObject.clickNotificationApplyOption();
    }

    @And("User enter frequency drop down box and select an option")
    public void userEnterFrequencyDropDownBoxAndSelectAnOption() {NotificationPageObject.clickNotificationFrequencyDropDownBox();
    }

 @And("User enter users drop down box and select an user")
    public void userEnterUsersDropDownBoxAndSelectAnUser() {NotificationPageObject.clickNotificationUsersDropDownBox();
    NotificationPageObject.selectNotificationUserOption();
    }

 @Then("User click on save button")
    public void userClickOnSaveButton() {NotificationPageObject.enterNotificationSaveBtn();
 }
}
