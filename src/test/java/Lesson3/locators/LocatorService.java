package Lesson3.locators;

import Lesson3.locators.Android.AndroidCheckFormLocators;
import Lesson3.locators.Android.AndroidSwipeHorizontalLocators;
import Lesson3.locators.Android.AndroidUserRegistrationLocators;
import Lesson3.locators.iOS.iOSCheckFormLocators;
import Lesson3.locators.iOS.iOSSwipeHorizontalLocators;
import Lesson3.locators.iOS.iOSUserRegistrationPageLocators;
import Lesson3.locators.interfaces.CheckFormLocators;
import Lesson3.locators.interfaces.SwipeHorizontalLocators;
import Lesson3.locators.interfaces.UserRegistrationPageLocators;


public class LocatorService {

    public static final CheckFormLocators CHECK_FORM_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidCheckFormLocators() : new iOSCheckFormLocators();
    public static final UserRegistrationPageLocators USER_REGISTRATION_PAGE_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidUserRegistrationLocators() : new iOSUserRegistrationPageLocators();
    public static final SwipeHorizontalLocators SWIPE_HORIZONTAL_LOCATORS = System.getProperty("platform")
            .equals("Android") ? new AndroidSwipeHorizontalLocators() : new iOSSwipeHorizontalLocators();
}
