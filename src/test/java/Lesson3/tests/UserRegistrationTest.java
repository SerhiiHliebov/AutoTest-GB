package Lesson3.tests;

import Lesson3.base.BaseTest;
import Lesson3.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class UserRegistrationTest extends BaseTest {


    @Test
    public void CheckUserRegistration() {
        openApp()
                .clickLoginMenuButton()
                .clickSignUp()
                .FillInputEmail()
                .FillInputPassword()
                .FillInputRepeatPassword()
                .clickSingUpButton()
                .checkErrorText("Signed Up!");
    }

}
