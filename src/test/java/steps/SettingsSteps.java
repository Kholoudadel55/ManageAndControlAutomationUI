package steps;

import base.Hooks;
import com.shaft.driver.SHAFT;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SettingsSteps {
        SHAFT.GUI.WebDriver driver = Hooks.getDriver();
        pages.SettingsPage SettingsPageObject = new pages.SettingsPage(driver);


//Manage_More_Scenarios
    @And("User click on skip for now")
    public void userClicksSkipForNowBtn(){
        SettingsPageObject.clicksSkipForNowBtn();
    }
    @And("User click on manage tab")
    public void userClicksOnManageTab() {
        SettingsPageObject.clicksManageTab();
    }

    @And("User click on more tab")
    public void userClicksOnMoreTab() {
        SettingsPageObject.clicksMoreTab();
    }

    @And("User click on settings tab")
    public void userClicksOnSettingsTab() {
        SettingsPageObject.clicksSettingsTab();
    }

    @And("User click on sending time field")
    public void userClicksOnSendingTimeField() {
        SettingsPageObject.clicksSendingTimeField();
    }

    @And("User pick time from drop down box")
    public void userPicksTimeFromDropDownBox() {
        SettingsPageObject.setPickTimeOption();

    }

    @Then("User click on save changes button")
    public void userClickOnSaveChangesButton() {
        SettingsPageObject.clicksSaveChangesBtn();
    }

    }
