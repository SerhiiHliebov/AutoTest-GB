package Lesson3.tests;

import Lesson3.base.BaseTest;
import org.testng.annotations.Test;

public class SwipeTest extends BaseTest {

    @Test
    public void CheckText() {

        openApp()
                .clickSwipe()
                .clickCircle()
                .checkText("CREAT COMMUNITY");

    }
}
