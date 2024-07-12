package org.page;

import org.base.BaseClass;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MyDigiRecordsLoginPage extends BaseClass {
    public MyDigiRecordsLoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"email\"]")
    private WebElement usernameField;

    public WebElement getUsernameField() {
        return usernameField;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"password\"]")
    private WebElement passwordField;

    public WebElement getPasswordField() {
        return passwordField;
    }

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Login\"])[2] ")
    private WebElement loginButton;

    public WebElement getLoginButton() {
        return loginButton;
    }
}
