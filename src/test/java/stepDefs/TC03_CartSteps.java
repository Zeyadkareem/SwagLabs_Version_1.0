package stepDefs;

import io.cucumber.java.en.And;
import pages.Cart_Locators;

public class TC03_CartSteps {

    Cart_Locators cart = new Cart_Locators();

    @And("go to the cart")
    public void go_to_the_cart( ) {
        cart.CartButton().click();
    }

    @And("remove {int} product from the cart")
    public void Add_Number_Of_products_to_card(int P) {

        for (int i = 0; i < P; i++) {

            cart.removeFromCartButtons().get(i).click();  // Click the 'Add to Cart' button
        }

    }

    @And("go to checkout page")
    public void go_to_checkout_page( ) {
        cart.CheckoutIcon().click();
    }
}

