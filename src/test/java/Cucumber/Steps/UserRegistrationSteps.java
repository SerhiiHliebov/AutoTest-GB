package Cucumber.Steps;

import Lesson3.base.BaseTest;
import Lesson3.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps extends BaseTest {

    MainPage mainPage;

    @Given("User is on Registration page")
    public void user_is_on_Registration_page() {
        mainPage = openApp().clickLoginMenuButton();
    }

    @When("User click SignUp button")
    public void user_click_SignUp_button() {
        mainPage.clickSignUp();
    }

    @When("User Fill Input Email")
    public void user_Fill_Input_Email() {
        mainPage.FillInputEmail();
    }

    @When("User Fill Input Password")
    public void user_Fill_Input_Password() {
       mainPage.FillInputPassword();
    }

    @When("User Fill Input Repeat Password")
    public void user_Fill_Input_Repeat_Password() {
       mainPage.FillInputRepeatPassword();
    }

    @When("User click SingUp Button")
    public void user_click_SingUp_Button() {
       mainPage.clickSingUpButton();
    }

    @Then("User checkErrorText {string}")
    public void user_checkErrorText(String string) {
        mainPage.checkErrorText("Signed Up!");
    }
}
