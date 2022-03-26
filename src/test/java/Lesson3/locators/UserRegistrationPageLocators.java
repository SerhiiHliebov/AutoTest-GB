package Lesson3.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class UserRegistrationPageLocators {

    public By loginMenuButton() {
        return MobileBy.AccessibilityId("Login");
    }

    public By signUpButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView");
    }

    public By inputEmail() {
        return MobileBy.AccessibilityId("input-email");
    }

    public By inputPassword() {
        return MobileBy.AccessibilityId("input-password");
    }

    public By inputRepeatPassword() {
        return MobileBy.AccessibilityId("input-repeat-password");
    }

    public By repeatSignUpButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup/android.widget.TextView");
    }

    public By checkError() {
        return MobileBy.AccessibilityId("android:id/alertTitle");
    }

    public By formButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.view.ViewGroup/android.widget.TextView");
    }

}
