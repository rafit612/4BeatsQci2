package hooks;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class Hooks {
    public static AppiumDriver driver;
    @Before
    public void setup() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium:appActivity", "com.microsoft.todos.ui.LaunchActivity");
        capabilities.setCapability("appium:appPackage", "com.microsoft.todos");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:deviceName", "POCO F4");
        capabilities.setCapability("appium:platformVersion", "14");
        capabilities.setCapability("appium:udid", "adb-944dd9d-L80hY0._adb-tls-connect._tcp");
        capabilities.setCapability("platformName", "Android");

        URL url = new URL("http://192.168.10.168:4723/");
        driver = new AndroidDriver(url, capabilities);
        Thread.sleep(10000);
        System.out.println("App launched successfully");
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver quit successfully");
        }
    }
}
