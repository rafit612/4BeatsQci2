package stepdefinitions;


import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage(Hooks.driver);

    @Given("the user logs in with email {string}")
    public void theUserEnterEmail(String email) {
        homePage.enterEmail(email);
        System.out.println("User logged in successfully");
    }
    @Then("the application should display the task list")
    public void theButtonLogsIn() {
        homePage.clickSignIn();
    }

}
