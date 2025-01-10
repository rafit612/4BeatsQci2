package stepdefinitions;


import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

import static io.qameta.allure.Allure.step;
import static org.testng.Assert.assertTrue;

public class HomePageSteps {

    HomePage homePage = new HomePage(Hooks.driver);

    @Given("the user logs in with email {string}")
    public void theUserEnterEmail(String email) {
        step("Enter Email "+email+" in login page");
        homePage.enterEmail(email);
        System.out.println("User logged in successfully");
    }
    @When("the user clicks continue")
    public void theButtonLogsIn() throws InterruptedException {
        step("clcik continue button");
        homePage.clickContinue();
    }

    @And("the user enters password {string}")
    public void theUserEnterPassword(String pass) {
        step("Enter Password "+pass+" in login page");
        homePage.enterPassword(pass);
        System.out.println("User logged in successfully");
    }
    @And("the user clicks sign in")
    public void theSignInButton() throws InterruptedException {
        step("clcik continue button");
        homePage.clickSignIn();
    }
    @And("the user give permission for notification")
    public void theNotificationButton() throws InterruptedException {
        step("clcik notification button");
        homePage.clickYesNotification();
    }
    @And("user skip tutorial")
    public void skipTutorialButton() throws InterruptedException {
        step("skipped tutorial");
        homePage.skipTutorial();
    }
    @Then("the displayed email should match in home page {string}")
    public void validateDisplayedEmail(String expectedEmail) {
        step("Verify the displayed email matches " + expectedEmail);
        boolean isEmailCorrect = homePage.isEmailDisplayedCorrectly(expectedEmail);
        assertTrue(isEmailCorrect, "The displayed email does not match the expected email.");
        System.out.println("Displayed email matches successfully");
    }
    @And("user click on navigation")
    public void theNavigation() throws InterruptedException {
        step("click on navigation bar");
        homePage.clickOnNav();
    }
    @And("user click on manage accounts")
    public void theManageAccount() throws InterruptedException {
        step("click on manage account");
        homePage.clickManageAccounts();
    }
    @And("click on sign out")
    public void signOutButton() throws InterruptedException {
        step("click on sign out");
        homePage.signoutButton();
    }
    @And("confirm sign out")
    public void signOutButtonConfirm() throws InterruptedException {
        step("click yes ");
        homePage.signoutConfirmButton();
    }
    @Then("home page displayed")
    public void homeMenu() throws InterruptedException {
        step("Home menu is showned");
        homePage.homeMenuDisplayed();
    }

    @When("user click on microsoft account")
    public void createButton() throws InterruptedException {
        step("click on create account");
        homePage.clickCreateAccount();
    }



}
