package pages;

import com.shaft.driver.SHAFT;
import common.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    By loginPageTitle = By.xpath("//a[text()='Login To Your Account']");
    By accountNumberField = By.id("business_ref");
    By emailField = By.name("email");
    By passwordField = By.name("password");
    By loginBtn = By.cssSelector("button.btn.btn-primary");
    By errorMsgBox = By.cssSelector("div.w-full.p-4");

    public LoginPage(SHAFT.GUI.WebDriver driver) {
        super(driver);
    }

    public void assertThatLoginPageAppears() {
        driver.assertThat().element(loginPageTitle).text().isEqualTo("Login To Your Account").perform();
    }

    public void setAccountNumber() {
        setElementText(accountNumberField, "313087");
    }

    public void setEmail() {
        setElementText(emailField, "K.adel@foodics.com");
    }

    public void setPassword() {
        setElementText(passwordField, "Foodics@123");
    }

    public void clickLoginBtn() {
        clickOnElement(loginBtn);
    }

    public void setInvalidAccountNumber() {
        setElementText(accountNumberField, "888888");

    }

    public void assertAnErrorMsgAppeares() {
        driver.assertThat().element(errorMsgBox).text().contains("Invalid Credentials!").perform();
    }
    public void setInvalidEmail(){
        setElementText(emailField, "K.adel@yahoo.com");
    }
}
