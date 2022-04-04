package Lesson3.locators.Android;

import Lesson3.locators.interfaces.SwipeHorizontalLocators;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class AndroidSwipeHorizontalLocators implements SwipeHorizontalLocators {

    @Override
    public By clickCircle() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Carousel\"]/android.view.ViewGroup[2]");
    }

    @Override
    public By checkText() {
        return MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"card\"])[1]/android.widget.TextView[2]");
    }

}
