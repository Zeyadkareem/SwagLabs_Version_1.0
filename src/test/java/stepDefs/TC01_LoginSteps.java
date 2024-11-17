package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.asserts.SoftAssert;
import pages.Login_Locators;

public class TC01_LoginSteps {
    private static final Logger log = LoggerFactory.getLogger(TC01_LoginSteps.class);
    Login_Locators login = new Login_Locators();

    @When("user login with valid {string} and {string}")
    public void user_Login_with_valid(String user , String password){
        login.username().sendKeys(user);
        login.password().sendKeys(password);
    }
    @And("Press on Login button")
    public void Press_on_Login_Button(){
        login.button().click();
    }

    @Then("User go to product page")
    public void User_go_to_product_page(){
        SoftAssert softAssert =new SoftAssert();
        String Product_page = "https://www.saucedemo.com/inventory.html";
        softAssert.assertEquals(Product_page , login.product_page());
    }

    @When("user login with Invalid {string} and {string}")
    public void user_Login_with_Invalid(String user,String password) {
        login.username().sendKeys(user);
        login.password().sendKeys(password);
    }

    @Then("User can not go to product page")
    public void User_can_not_go_to_product_page(){
        SoftAssert softAssert = new SoftAssert();
        String Actual = login.WrongMessage().getText();
        String Expected = "Epic sadface: Username and password do not match any user in this service";
        softAssert.assertEquals(Actual,Expected);
    }

}
