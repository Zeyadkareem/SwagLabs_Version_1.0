package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefs.Hooks;

public class Login_Locators {
    WebDriver driver = Hooks.driver;

    public WebElement username() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement password(){
        return driver.findElement(By.id("password"));
    }

    public WebElement button(){
        return driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
    }
    public WebElement WrongMessage(){
        return driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
    }
    public String product_page(){
        return driver.getCurrentUrl();
    }
}
