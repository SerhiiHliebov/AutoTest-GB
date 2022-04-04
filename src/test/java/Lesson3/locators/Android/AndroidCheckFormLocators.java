package Lesson3.locators.Android;

import Lesson3.locators.interfaces.CheckFormLocators;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AndroidCheckFormLocators implements CheckFormLocators {


    @Override
    public By textInput() {
        return MobileBy.AccessibilityId("text-input");
    }

    @Override
    public By switchB() {
        return MobileBy.AccessibilityId("switch");
    }

    @Override
    public By dropdown() {
        return MobileBy.AccessibilityId("select-Dropdown");
    }

    @Override
    public By value() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
    }

    @Override
    public By activeButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup/android.widget.TextView");
    }

    @Override
    public By checkError() {
        return MobileBy.AccessibilityId("android:id/alertTitle");
    }
}
