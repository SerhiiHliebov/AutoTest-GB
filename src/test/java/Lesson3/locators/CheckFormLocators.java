package Lesson3.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class CheckFormLocators {



    public By textInput() {
        return MobileBy.AccessibilityId("text-input");
    }

    public By switchB() {
        return MobileBy.AccessibilityId("switch");
    }

    public By dropdown() {
        return MobileBy.AccessibilityId("select-Dropdown");
    }

    public By value() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
    }

    public By activeButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup/android.widget.TextView");
    }

    public By checkError() {
        return MobileBy.AccessibilityId("android:id/alertTitle");
    }
}
