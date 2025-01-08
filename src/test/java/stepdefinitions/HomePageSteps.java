package stepdefinitions;


import hooks.Hooks;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage(Hooks.driver);

    @Given("the user logs in with email {string}")
    public void theUserLogsInWithEmail(String email) {
        homePage.enterEmail(email);
        homePage.clickSignIn();
        System.out.println("User logged in successfully");
    }
}
