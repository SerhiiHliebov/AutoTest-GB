package Lesson3.pages;

import Lesson3.locators.CheckFormLocators;
import Lesson3.locators.UserRegistrationPageLocators;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import io.qameta.allure.Step;

import java.awt.image.BufferedImage;
import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.AssertJUnit.assertEquals;

public class MainPage {


        // Метод позволяет нам работать с локаторами для нужной нам страницы.
        private UserRegistrationPageLocators locator() {
            return new UserRegistrationPageLocators();
        }


        @Step("Кликаем по кнопке логина в меню и переходим на новую страницу логина")
        public MainPage clickLoginMenuButton() {
            $(locator().loginMenuButton()).click();
            return new MainPage();
        }

        @Step("Кликаем на вкладку SIGN UP")
        public MainPage clickSignUp() {
            $(locator().signUpButton()).click();
            return new MainPage();
        }

        @Step("Заполнить поле «Email»")
        public MainPage FillInputEmail() {
            $(locator().inputEmail()).sendKeys("gggg@gmail.com");
            return new MainPage();
        }

        @Step("Заполнить поле «Password»")
        public MainPage FillInputPassword() {
            $(locator().inputPassword()).sendKeys("12345678");
            return new MainPage();
        }

        @Step("Заполнить поле «Confirm Password»")
        public MainPage FillInputRepeatPassword() {
            $(locator().inputRepeatPassword()).sendKeys("12345678");
            return new MainPage();
        }

        @Step("Кликаем на кнопку SignUp")
        public MainPage clickSingUpButton() {
           $(locator().repeatSignUpButton());
           return new MainPage();
        }

        @Step("Проверяем на ошибки")
        public MainPage checkErrorText(String text) {
            $(locator().checkError()).shouldHave(Condition.text(text));
            return new MainPage();
        }

         @Step("Кликаем по кнопке Forms в Navigation bar")
         public FormPage clickFormButton() {
            $(locator().formButton()).click();
            return new FormPage();
    }


        @Step("Делаем скриншот страницы после регистрации.")
        public MainPage checkScreenshot() {
            // Загружаем ожидаемое изображения для сравнения.
            BufferedImage expectedImage = ImageComparisonUtil.readImageFromResources("src/main/resources/expectedScreenshots/mainPage.png");
            // Делаем актуальный скриншот, используя элемент и игнорируя другие части экрана.
            File actualScreenshot = $(locator().repeatSignUpButton()).screenshot();
            // Загружаем актуальный скриншот.
            BufferedImage actualImage = ImageComparisonUtil.readImageFromResources("screenshots/actual/" + actualScreenshot.getName());

            // Где будем хранить скриншот с различиями в случае падения теста.
            File resultDestination = new File("diff/diff_CheckMainPageScreenshot.png");

            // Сравниваем.
            ImageComparisonResult imageComparisonResult = new ImageComparison(expectedImage, actualImage, resultDestination).compareImages();
            assertEquals(ImageComparisonState.MATCH, imageComparisonResult.getImageComparisonState());
            return this;
        }

}






