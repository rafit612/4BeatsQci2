package pages;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage  {
    private final AppiumDriver driver;
    private final WebDriverWait wait;
    // Locators

    private static final String PASSWORD_FIELD_ID = "i0118";
    private static final String CREATE_EMAIL_FIELD_ID = "usernameInput";
    private static final String GET_NEW_EMAIL_FIELD_ID = "liveSwitch";
    private static final String EMAIL_DONAIN_SELECT_FIELD_ID = "domainSelect";
    private static final String EMAIL_PASS_CREATE_FIELD_ID = "Password";
    private static final String SIGN_UP_NEXT_BUTTON = "nextButton";
    private static final String FIRST_NAME_FIELD = "firstNameInput";
    private static final String LAST_NAME_FIELD = "lastNameInput";
    private static final String NEXT_BUTTON_FIRST_LAST_NAME = "nextButton";
    private static final String MONTH_FIELD = "BirthMonth";
    private static final String DAY_FIELD = "BirthDay";
    private static final String YEAR_FIELD = "BirthYear";
    private static final String ROBOT = "challengeViewTitle";


    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterEmail(String email) {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.microsoft.todos:id/email_phone_edit_text\")")).sendKeys(email);
    }
    public void homeMenuDisplayed() {
        boolean isDisplayed = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.microsoft.todos:id/alertTitle\")")).isDisplayed();
        Assert.assertTrue(isDisplayed, "The home menu is not displayed.");
    }
    public void clickContinue() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.microsoft.todos:id/sign_in_button\")")).click();
        Thread.sleep(12000);
    }
    public void enterPassword(String pass) {

        try {
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//android.widget.EditText[@resource-id=\"" + PASSWORD_FIELD_ID + "\"]")));
            passwordField.sendKeys(pass);
        } catch (Exception e) {
            throw new RuntimeException("Failed to enter password: " + e.getMessage());
        }
    }
    public void clickSignIn() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"idSIButton9\")")).click();
        Thread.sleep(10000);
    }
    public void clickYesNotification() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_button\")")).click();
        Thread.sleep(1000);
    }
    public void skipTutorial() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.microsoft.todos:id/action_bar_left_action\")")).click();
        Thread.sleep(1000);
    }
    public void clickOnNav() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.microsoft.todos:id/homeview_header\")")).click();
        Thread.sleep(1000);
    }
    public void clickManageAccounts() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(4)")).click();
        Thread.sleep(1000);
    }
    public void signoutButton() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.microsoft.todos:id/sign_out_button\")")).click();
        Thread.sleep(1000);
    }
    public void signoutConfirmButton() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"android:id/button1\")")).click();
        Thread.sleep(10000);
    }

    public void clickCreateAccount() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.microsoft.todos:id/signup_button\")")).click();
        Thread.sleep(10000);
    }
    public void getEmail() throws InterruptedException {


        WebElement getEmailField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//android.widget.Button[@resource-id=\"" + GET_NEW_EMAIL_FIELD_ID + "\"]")));
        getEmailField.click();
        Thread.sleep(10000);

    }
    public void selectEmailDomainOption() throws InterruptedException {


        WebElement getEmailField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.view.View[@resource-id=\"" + EMAIL_DONAIN_SELECT_FIELD_ID + "\"]")));
        getEmailField.click();
        Thread.sleep(1000);

    }
    public void selectEmailDomain() throws InterruptedException {


        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"@outlook.com\")")).click();
        Thread.sleep(1000);

    }
    public void enterCreateEmail2(String s) {
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.EditText[@resource-id=\"" + CREATE_EMAIL_FIELD_ID + "\"]")));
        passwordField.sendKeys(s);
    }
    public void enterCreatePass(String pass) throws InterruptedException {
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.EditText[@resource-id=\"" + EMAIL_PASS_CREATE_FIELD_ID + "\"]")));
        passwordField.sendKeys(pass);
        Thread.sleep(1000);
    }
    public void selectEmailNext() throws InterruptedException {

        WebElement nextbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.Button[@resource-id=\"" + SIGN_UP_NEXT_BUTTON + "\"]")));
        nextbutton.click();
        Thread.sleep(1000);

    }
    public void enterFirstName(String first) throws InterruptedException {
        WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.EditText[@resource-id=\"" + FIRST_NAME_FIELD + "\"]")));
        firstNameField.sendKeys(first);
        Thread.sleep(1000);
    }
    public void enterLastName(String last) throws InterruptedException {
        WebElement lastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.EditText[@resource-id=\"" + LAST_NAME_FIELD + "\"]")));
        lastNameField.sendKeys(last);
        Thread.sleep(1000);
    }
    public void clcikFLNest() throws InterruptedException {

        WebElement nextbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.Button[@resource-id=\"" + NEXT_BUTTON_FIRST_LAST_NAME + "\"]")));
        nextbutton.click();
        Thread.sleep(1000);

    }

    public void selectMonthOption() throws InterruptedException {

        WebElement nextbutton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.view.View[@resource-id=\"" + MONTH_FIELD + "\"]")));
        nextbutton.click();
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"October\")")).click();
        Thread.sleep(1000);

    }
    public void selectDay() throws InterruptedException {

        WebElement dayOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.view.View[@resource-id=\"" + DAY_FIELD + "\"]")));
        dayOption.click();
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"11\")")).click();
        Thread.sleep(1000);

    }
    public void selectYear() {
        try {
            WebElement year = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//android.widget.EditText[@resource-id=\"" + YEAR_FIELD + "\"]")));

            year.click();

            year.click(); // Focus the field
            year.clear(); // Clear existing input
            year.sendKeys("2000"); // Enter the new value


        } catch (Exception e) {
            System.out.println("Error interacting with the year field: " + e.getMessage());
        }
    }

    public boolean isRobot(String expectedText) {
        // Wait for the email field to be visible and get its text
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.TextView[@resource-id=\"" + ROBOT + "\"]")));
        String displayedText = text.getText();

        // Compare the displayed email with the expected email
        return displayedText.equals(expectedText);
    }


    public String homePagetest() {
        return driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.microsoft.todos:id/email_textview\")")).getText();
    }
    public boolean isEmailDisplayedCorrectly(String expectedEmail) {
        String displayedEmail = homePagetest();
        return displayedEmail.equals(expectedEmail);
    }

}
