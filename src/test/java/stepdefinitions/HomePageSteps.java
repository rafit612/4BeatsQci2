package stepdefinitions;


import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

import java.util.Random;

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

    @Given("user click on microsoft account")
    public void getNewEmailAccount() throws InterruptedException {
        step("click on microsoft accountt");
        homePage.clickCreateAccount();
    }
    @When("the user click get new email")
    public void createButton() throws InterruptedException {
        step("click on get new email");
        homePage.getEmail();
    }
    @And("the user click on email domain option")
    public void clickDomainOption() throws InterruptedException {
        step("click on create account");
        homePage.selectEmailDomainOption();
    }

    @And("the user select on email domain")
    public void clickDomain() throws InterruptedException {
        step("select outlook");
        homePage.selectEmailDomain();
    }
    @And("the user create email")
    public void theUserEnterEmail() {
        String email_name = generateRandomNameNumber();
        step("Enter Random "+email_name+" email");
        homePage.enterCreateEmail2(email_name);
    }
    @And("the user create password")
    public void theUserCreatePassword() throws InterruptedException {
        String random_pass =generatePassword(10);
        step("Enter Random "+random_pass+"  password");
        homePage.enterCreatePass(random_pass);
    }
    @And("the user clicks next")
    public void clickNext() throws InterruptedException {
        step("click on create account");
        homePage.selectEmailNext();
    }
    @And("the user enter random first name")
    public void enterFirstName() throws InterruptedException {
        String first_name = generateFirstName() ;
        step("Enter Random "+first_name+" First Name");
        homePage.enterFirstName(first_name);
    }
    @And("the user enter random last name")
    public void enterLastName() throws InterruptedException {
        String last_name = generateLastName() ;
        step("Enter Random "+last_name+"  Last Name");
        homePage.enterLastName(last_name);
    }
    @And("the user click next after enter first and last name")
    public void enterNEXTfl() throws InterruptedException {
        step("Click Next ");
        homePage.clcikFLNest();
    }
    @And("the user select month")
    public void selectMonthName() throws InterruptedException {
        step("the user select month ");
        homePage.selectMonthOption();
    }
    @And("the user select date")
    public void selectDAy() throws InterruptedException {
        step("the user select date");
        homePage.selectDay();
    }
    @And("the user enter year")
    public void enterYear() throws InterruptedException {
        step("the user enter year ");
        homePage.selectYear();
    }
    @And("the user click next after enter date month")
    public void enterNEXTdate() throws InterruptedException {
        step("Click Next ");
        homePage.clcikFLNest();
        Thread.sleep(8000);
    }
    @Then("text displayed in robot {string}")
    public void robotText(String text) throws InterruptedException {
        step("text displayed in robot");
        homePage.isRobot(text);
    }





    // Function to generate a random email
    public static String generateRandomNameNumber() {
        // Array of random name prefixes
        String[] namePrefixes = {"Rafit", "Zarix", "Fynor", "Lemix", "Jorvan", "Kryth", "Novik", "Veyra"};

        // Create a Random object
        Random random = new Random();

        // Generate a random name prefix
        String randomName = namePrefixes[random.nextInt(namePrefixes.length)];

        // Generate a random year (between 2020 and 2099)
        int randomYear = random.nextInt(2099 - 2020 + 1) + 2020;

        // Combine the name and number
        return randomName + randomYear;
    }

    // Function to generate a random password
    public static String generatePassword(int length) {
        if (length < 8) {
            throw new IllegalArgumentException("Password length must be at least 8 characters.");
        }

        // Characters pools
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        String allCharacters = upperCaseLetters + lowerCaseLetters + digits + specialCharacters;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Ensure at least one character from each category
        password.append(upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length())));
        password.append(lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialCharacters.charAt(random.nextInt(specialCharacters.length())));

        // Fill the remaining length with random characters from all categories
        for (int i = 4; i < length; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        // Shuffle the characters for randomness
        return shuffleString(password.toString());
    }

    // Function to shuffle a string
    private static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        Random random = new Random();
        for (int i = 0; i < characters.length; i++) {
            int randomIndex = random.nextInt(characters.length);
            // Swap characters
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }
        return new String(characters);
    }
    // Function to generate a random first name
    public static String generateFirstName() {
        // Array of 100 sample first names
        String[] firstNames = {
                "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda",
                "William", "Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica",
                "Thomas", "Sarah", "Charles", "Karen", "Christopher", "Nancy", "Daniel", "Lisa",
                "Matthew", "Betty", "Anthony", "Margaret", "Donald", "Sandra", "Mark", "Ashley",
                "Paul", "Kimberly", "Steven", "Emily", "Andrew", "Donna", "Kenneth", "Michelle",
                "George", "Dorothy", "Joshua", "Carol", "Kevin", "Amanda", "Brian", "Melissa",
                "Edward", "Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Sharon",
                "Jeffrey", "Laura", "Ryan", "Cynthia", "Jacob", "Kathleen", "Gary", "Amy",
                "Nicholas", "Shirley", "Eric", "Angela", "Jonathan", "Helen", "Stephen", "Anna",
                "Larry", "Brenda", "Justin", "Pamela", "Scott", "Nicole", "Brandon", "Emma",
                "Benjamin", "Samantha", "Samuel", "Katherine", "Gregory", "Christine", "Frank", "Debra",
                "Alexander", "Rachel", "Patrick", "Catherine", "Raymond", "Carolyn", "Jack", "Janet",
                "Dennis", "Ruth", "Jerry", "Maria", "Tyler", "Heather"
        };

        // Create a Random object
        Random random = new Random();

        // Select a random first name from the array
        return firstNames[random.nextInt(firstNames.length)];
    }
    // Function to generate a random Bangladeshi last name
    public static String generateLastName() {
        // Array of 100 Bangladeshi last names
        String[] lastNames = {
                "Ahmed", "Hossain", "Chowdhury", "Khan", "Sarker", "Rahman", "Islam", "Sheikh",
                "Faruque", "Hasan", "Munshi", "Biswas", "Uddin", "Patwari", "Mollah", "Majumder",
                "Kabir", "Bhuiyan", "Talukdar", "Begum", "Ali", "Jahan", "Karim", "Mazumdar",
                "Naser", "Sharif", "Miah", "Anwar", "Nazrul", "Shahid", "Mahmud", "Habib",
                "Rashid", "Barua", "Rumi", "Azad", "Kabir", "Zaman", "Anam", "Sobhan",
                "Ehsan", "Arif", "Latif", "Bashar", "Iqbal", "Niaz", "Shahed", "Rubel",
                "Rumi", "Farid", "Fahim", "Tahmid", "Nayem", "Jahid", "Imran", "Sajid",
                "Touhid", "Shafiq", "Aminul", "Rahat", "Samiul", "Murshed", "Rafiq", "Shams",
                "Tariq", "Haque", "Parvez", "Sabbir", "Halim", "Ashraf", "Tanvir", "Sami",
                "Faisal", "Rakib", "Zahid", "Sohan", "Ebrahim", "Junaid", "Arefin", "Rana",
                "Shahriar", "Hasib", "Kaiser", "Adnan", "Nashid", "Kamal", "Shahab", "Omar",
                "Zubair", "Tamim", "Mashrafi", "Habibur", "Shahin", "Ahsan", "Zahidul", "Anis",
                "Ripon", "Samad", "Jamal", "Asad"
        };

        // Create a Random object
        Random random = new Random();

        // Select a random last name from the array
        return lastNames[random.nextInt(lastNames.length)];
    }
}
