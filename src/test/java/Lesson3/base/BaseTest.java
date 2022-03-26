package Lesson3.base;

import Lesson3.pages.FormPage;
import Lesson3.pages.MainPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.apache.commons.io.IOUtils.close;


public class BaseTest {

    public MainPage openApp() {
        WebDriver driver = null;
        try {
            driver = getAndroidDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Opps, we have problems with URL for driver!");
        }

        WebDriverRunner.setWebDriver(driver);
        return new MainPage();

    }

    public static WebDriver getAndroidDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", "C:\\Users\\huka7\\Downloads\\Android-NativeDemoApp-0.2.1.apk");


        Configuration.reportsFolder = "screenshots/actual";
        return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterClass
    public void setDown() throws IOException {
        close();
    }

}


