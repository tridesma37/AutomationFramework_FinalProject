package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");

    private final By errorMessage = By.cssSelector("h3[data-test='error']");
    private final By productTitle = By.className("title");

    private final By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private final By cartButton = By.className("shopping_cart_link");
    private final By checkoutButton = By.id("checkout");

    private final By removeButton = By.id("remove-sauce-labs-backpack");
    private final By cartBadge = By.className("shopping_cart_badge");

    private final By menuButton = By.id("react-burger-menu-btn");
    private final By logoutButton = By.id("logout_sidebar_link");

    private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By postalCode = By.id("postal-code");

    private final By continueButton = By.id("continue");
    private final By finishButton = By.id("finish");

    private final By completeHeader = By.className("complete-header");
    private final By overviewTitle = By.className("title");

    public void openWebsite() {
        driver.get("https://www.saucedemo.com/");
    }

    public void login(String user, String pass) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(username));
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }

    public String getProductTitle() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle));
        return driver.findElement(productTitle).getText();
    }

    public String getErrorMessage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return driver.findElement(errorMessage).getText();
    }

    public void addProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        driver.findElement(addToCartButton).click();
    }

    public void openCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cartButton));
        driver.findElement(cartButton).click();
    }

    public void removeProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(removeButton));
        driver.findElement(removeButton).click();
    }

    public boolean isCartEmpty() {
        return driver.findElements(cartBadge).isEmpty();
    }

    public void logout() {
        wait.until(ExpectedConditions.elementToBeClickable(menuButton));
        driver.findElement(menuButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        driver.findElement(logoutButton).click();
    }

    public boolean isLoginPageDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        return driver.findElement(loginButton).isDisplayed();
    }

    public void checkout(String first, String last, String zip) {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(first);
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(last);
        driver.findElement(postalCode).clear();
        driver.findElement(postalCode).sendKeys(zip);
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(
                overviewTitle, "Checkout: Overview"));
        wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
    }

    public boolean isCheckoutComplete() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(completeHeader));
        return driver.findElement(completeHeader)
                .getText()
                .equals("Thank you for your order!");
    }
}