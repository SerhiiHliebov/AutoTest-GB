package Lesson3.locators.Android;

import Lesson3.locators.interfaces.UserRegistrationPageLocators;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AndroidUserRegistrationLocators implements UserRegistrationPageLocators {
    @Override
    public By loginMenuButton() {
        return MobileBy.AccessibilityId("Login");
    }

    @Override
    public By signUpButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView");
    }

    @Override
    public By inputEmail() {
        return MobileBy.AccessibilityId("input-email");
    }

    @Override
    public By inputPassword() {
        return MobileBy.AccessibilityId("input-password");
    }

    @Override
    public By inputRepeatPassword() {
        return MobileBy.AccessibilityId("input-repeat-password");
    }

    @Override
    public By repeatSignUpButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup/android.widget.TextView");
    }

    @Override
    public By checkError() {
        return MobileBy.AccessibilityId("android:id/alertTitle");
    }

    @Override
    public By formButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.view.ViewGroup/android.widget.TextView");
    }

    @Override
    public By swipeMenuButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Swipe\"]/android.view.ViewGroup/android.widget.TextView");
    }
}
