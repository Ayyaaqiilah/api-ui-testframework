package web.steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        loginPage.open();
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("clicks login button")
    public void clicks_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should be redirected to the products page")
    public void user_should_be_redirected_to_the_products_page() {
        assertTrue(driver.getCurrentUrl().contains("inventory.html"));
        driver.quit();
    }

    @Then("user should see error message {string}")
    public void user_should_see_error_message(String expectedMessage) {
        String actualMessage = loginPage.getErrorMessage();
        assertEquals(expectedMessage, actualMessage);
        driver.quit();
    }
}
