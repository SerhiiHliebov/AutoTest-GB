package Cucumber.Steps;

import Lesson3.base.BaseTest;
import Lesson3.pages.FormPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormSteps extends BaseTest {

    FormPage formPage;

    @Given("User is on Form page")
    public void user_is_on_Form_page() {
        formPage = openApp().clickFormButton();
    }

    @When("User fill In The Field")
    public void user_fill_In_The_Field() {
        formPage.fillInTheField();
    }

    @When("User click switch")
    public void user_click_switch() {
        formPage.clickSwitch();
    }

    @When("User select dropdown")
    public void user_select_dropdown() {
        formPage.selectDropdown();
    }

    @When("User select value")
    public void user_select_value() {
        formPage.selectValue();
    }

    @When("User click active button")
    public void user_click_active_button() {
       formPage.clickActiveButton();
    }

    @Then("User check error text {string}")
    public void user_check_error_text(String string) {
       formPage.checkErrorText("This button is");
    }
}
