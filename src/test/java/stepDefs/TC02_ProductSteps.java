package stepDefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import pages.Product_Locators;

public class TC02_ProductSteps {

    Product_Locators product = new Product_Locators();

    @And("Add {int} product to the cart")
    public void Add_Number_Of_products_to_card(int P) {

        for (int i = 0; i < P; i++) {

            product.addToCartButtons().get(i).click();  // Click the 'Add to Cart' button
        }

    }


}
