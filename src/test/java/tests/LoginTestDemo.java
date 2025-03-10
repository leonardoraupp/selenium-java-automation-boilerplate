package tests;

import config.WebDriverFactory;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTestDemo {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static LoginPage loginPage;

    @BeforeMethod
    public void setup() {

        driver.set(WebDriverFactory.createNewDriver());
        loginPage = new LoginPage(driver.get());
    }

    @Test
    @Description("Verify well succeed.")
    @Severity(SeverityLevel.NORMAL)
    @Feature("Login")
    @Story("User logins with valid credentials")
    public void loginTest() {
        loginPage.openLoginPage("https://practicetestautomation.com/practice-test-login/");
        loginPage.login();
        Assert.assertEquals(loginPage.getLoggedSuccessfullyMessage(), "Logged In Successfully");
    }

    @AfterMethod
    public static void tearDown() {
        driver.get().quit();
        driver.remove();
    }
}
