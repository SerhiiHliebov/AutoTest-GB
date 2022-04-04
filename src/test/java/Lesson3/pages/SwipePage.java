package Lesson3.pages;

import Lesson3.locators.LocatorService;
import Lesson3.locators.interfaces.CheckFormLocators;
import Lesson3.locators.interfaces.SwipeHorizontalLocators;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class SwipePage {

    private SwipeHorizontalLocators locator() {
        return LocatorService.SWIPE_HORIZONTAL_LOCATORS;
    }


    @Step("Клик на Круг")
    public SwipePage clickCircle() {
        $(locator().clickCircle()).click();
        return new SwipePage();
    }

    @Step("Клик на Круг")
    public SwipePage checkText(String text) {
        $(locator().checkText()).shouldHave(Condition.text(text));
        return new SwipePage();
    }

}
