package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

import java.util.List;

public class Cart_Locators {

    WebDriver driver = Hooks.driver;

    public WebElement CartButton() {
        return driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
    }

    public List<WebElement> removeFromCartButtons() {
        return driver.findElements(By.xpath("//button[contains(@class, 'cart_button')]"));
    }

    public WebElement CheckoutIcon() {
        return driver.findElement(By.xpath("//button[@id='checkout']"));
    }
}