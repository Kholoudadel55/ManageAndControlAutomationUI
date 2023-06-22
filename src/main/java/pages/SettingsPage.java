package pages;

import com.shaft.driver.SHAFT;
import common.PageBase;
import org.openqa.selenium.By;

public class SettingsPage extends PageBase {
    By skipForNowBtn = By.cssSelector(".font-bold.text-base");
    By manageTab = By.id("sidebar_manage");
    By moreTab = By.id("sidebar_manage_more");
    By settingsTab = By.id("sidebar_manage_settings");
    By sendingTimeField = By.id("form_field_notification_emails_sending_time");
    By pickTimeOption = By.id("form_field_notification_emails_sending_time");
    By saveChangesBtn = By.cssSelector(".btn-primary");
    public SettingsPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }
    public void clicksSkipForNowBtn(){clickOnElement(skipForNowBtn);
    }
    public void clicksManageTab(){clickOnElement(manageTab);

    }
    public void clicksMoreTab(){clickOnElement(moreTab);

    }
    public void clicksSettingsTab(){clickOnElement(settingsTab);

    }
    public void clicksSendingTimeField(){clickOnElement(sendingTimeField);

    }

    public void setPickTimeOption(){clickOnElement(pickTimeOption);

    }

    public void clicksSaveChangesBtn(){clickOnElement(saveChangesBtn);

    }
}
