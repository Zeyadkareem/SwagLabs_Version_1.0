package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

import java.util.List;

public class Product_Locators {
    WebDriver driver = Hooks.driver;

    public List<WebElement> addToCartButtons() {
        return driver.findElements(By.xpath("//button[contains(@class,'btn_inventory')]"));
    }

}
