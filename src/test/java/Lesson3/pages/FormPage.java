package Lesson3.pages;

import Lesson3.locators.LocatorService;
import Lesson3.locators.interfaces.CheckFormLocators;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$;

public class FormPage {

    private CheckFormLocators locator() {
        return LocatorService.CHECK_FORM_LOCATORS;
    }

    @Step("Заполнить поле любыми значениями. Например «Hello».")
    public FormPage fillInTheField() {
        $(locator().textInput()).sendKeys("Hello");
        return new FormPage();
    }

    @Step("Клик на switch")
    public FormPage clickSwitch() {
        $(locator().switchB());
        return new FormPage();
    }

    @Step("Выбрать любое значение в «Dropdown» Например Appium is awsome")
    public FormPage selectDropdown() {
        $(locator().dropdown());
        return new FormPage();
    }

    @Step("Например Appium is awsome")
    public FormPage selectValue() {
        $(locator().value());
        return new FormPage();
    }

    @Step("Клик на кнопку Active")
    public FormPage clickActiveButton() {
        $(locator().activeButton());
        return new FormPage();
    }

    @Step("Проверяем на ошибки")
    public FormPage checkErrorText(String text) {
        $(locator().checkError()).shouldHave(Condition.text(text));
        return new FormPage();
    }
}

