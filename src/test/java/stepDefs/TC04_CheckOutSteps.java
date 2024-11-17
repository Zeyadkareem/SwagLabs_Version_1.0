package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckOut_Locators;

public class TC04_CheckOutSteps {
    CheckOut_Locators chekout=new CheckOut_Locators();

    @When("User check {string} ,{string} and {string}")
    public void user_Checking_Checkout_fields(String FirstName,String LastName,String ZipCode) {
        chekout.FirstName().sendKeys(FirstName);
        chekout.LastName().sendKeys(LastName);
        chekout.ZipCode().sendKeys(ZipCode);
    }
    @Then("Finally user press on Continue button and Finish")
    public void user_press_on_Continue_button() {
        chekout.ContinuButton().click();
        chekout.FinishButton().click();

    }
}
