package com.actitime.qa.pages;

import com.actitime.qa.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends TestBase  {

    Logger log = Logger.getLogger(UsersPage.class);
    @FindBy(xpath = "//div[@class='components_button_label' and text()='New User']")
    WebElement newUser;

    @FindBy(xpath = "//input[@name='firstName' and not(@disabled)]")
    WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName' and not(@disabled)]")
    WebElement lastName ;
    @FindBy(xpath = "//input[@name='email' and not(@disabled)]")
    WebElement eMail;

    @FindBy(xpath = "//div[@class='components_button_label' and text()='Save & Send Invitation']")
    WebElement saveButton;

    @FindBy(xpath = "//div[@class='invitationInfoHeader' and contains(text(),'has been created')]")
    WebElement successMessage;

    public UsersPage() {

        PageFactory.initElements(driver, this);


    }
    public void clickUsersButton() {

        newUser.click();

    }
    public void clickNewUserButton() {

        newUser.click();

    }

    public void enterUserDetails(String firstname, String lastname, String email) {
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        eMail.sendKeys(email);

    }

    public void clickSaveandSubmitButton() {
        saveButton.click();
    }

    public boolean validateUserCreation() {
        log.info("Validated User Creation");
        return successMessage.isDisplayed();
    }
}
