package com.actitime.qa.stepdefinitions;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.UsersPage;
import com.actitime.qa.util.TestUtil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserCreationStepDefinition extends TestBase {


    LoginPage loginPage;
    HomePage homePage;
    UsersPage userpage;

    @Given("User is logged in to Actitime as an admin user using username as {string} and password as {string}")
    public void userIsLoggedInToActitimeAsAnAdminUserUsingUsernameAsAndPasswordAs(String uname, String pwd) {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.loging(uname,pwd);
    }

    @When("User clicks on Users and selects New User")
    public void userClicksOnUsersAndSelectsNewUser() {
        userpage = homePage.clickOnUsersLink();
        userpage.clickNewUserButton();
    }
    @And("User fills in the mandatory fields with FirstName as {string} LastName as {string} Email as {string}")
    public void userFillsInTheMandatoryFieldsWithFirstNameAsLastNameAsEmailAs(String fname, String lname, String email) {
        userpage.enterUserDetails (fname ,lname,email );
    }

    @Then("User clicks the Save & Send Invitation button")
    public void userClicksTheSaveSendInvitationButton() {
        userpage.clickSaveandSubmitButton();
    }

    @Then("User validates that the new user {string} {string} is created successfully")
    public void userValidatesThatTheNewUserIsCreatedSuccessfully(String fname, String lname) {
        userpage.validateUserCreation(fname, lname);
        driver.quit();
    }
}
