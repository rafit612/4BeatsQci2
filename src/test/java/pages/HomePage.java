package pages;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomePage  {
    private final AppiumDriver driver;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.microsoft.todos:id/email_phone_edit_text\")")).sendKeys(email);
    }

    public void clickSignIn() {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().resourceId(\"com.microsoft.todos:id/sign_in_button\")")).click();
    }


}
