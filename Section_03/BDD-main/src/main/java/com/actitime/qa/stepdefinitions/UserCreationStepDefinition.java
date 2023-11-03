package com.actitime.qa.stepdefinitions;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.UsersPage;
import com.actitime.qa.util.TestUtil;

//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserCreationStepDefinition extends TestBase {


    LoginPage loginPage;
    HomePage homePage;

    UsersPage userpage;
    String sheetName = "Users";
    TestUtil testUtil;


    @Given("User is logged in to Actitime as an admin user")
    public void userIsLoggedInToActitimeAsAnAdminUser() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.loging("socialstat1104@gmail.com","jgAE65BB");
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

    @Then("User validates that the new user is created successfully")
    public void userValidatesThatTheNewUserIsCreatedSuccessfully() {
        userpage.validateUserCreation();
        driver.quit();
    }


}
