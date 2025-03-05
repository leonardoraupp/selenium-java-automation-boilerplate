package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.SeleniumUtils;

public class LoginPage {
    private By username = By.id("username");
    private By password = By.id("password");
    private By submitButton = By.id("submit");
    private By loggedSuccessfully = By.className("post-title");
    private SeleniumUtils utils;
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.utils = new SeleniumUtils(driver);
    }

    public void login() {
        utils.sendKeys(username, "student");
        utils.sendKeys(password, "Password123");
        utils.clickElement(submitButton);
    }

    public void openLoginPage(String url) {
        driver.get(url);
    }

    public String getLoggedSuccessfullyMessage() {
        return utils.waitForElementVisibility(loggedSuccessfully).getText();
    }
}
