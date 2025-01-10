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

    public String homePagetest() {
        return driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.microsoft.todos:id/email_textview\")")).getText();
    }
    public boolean isEmailDisplayedCorrectly(String expectedEmail) {
        String displayedEmail = homePagetest();
        return displayedEmail.equals(expectedEmail);
    }

}
