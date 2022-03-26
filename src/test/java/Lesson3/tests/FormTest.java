package Lesson3.tests;

import Lesson3.base.BaseTest;
import Lesson3.listeners.AllureListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class FormTest extends BaseTest {

    @Test
    public void CheckForm() {

        openApp()
                .clickFormButton()
                .fillInTheField()
                .clickSwitch()
                .selectDropdown()
                .selectValue()
                .clickActiveButton()
                .checkErrorText("This button is");
    }
}
