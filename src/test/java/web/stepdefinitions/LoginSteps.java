package web.stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import web.pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(Hooks.driver);

    @Given("User membuka halaman login SauceDemo")
    public void openLoginPage() {

        loginPage.openWebsite();

    }

    @When("User login menggunakan username {string} dan password {string}")
    public void login(String username, String password) {

        loginPage.login(username, password);

    }

    @Then("User berhasil masuk ke halaman produk")
    public void successLogin() {

        Assert.assertEquals(
                "Products",
                loginPage.getProductTitle()
        );

    }

    @Then("Muncul pesan error login")
    public void errorLogin() {

        Assert.assertTrue(
                loginPage.getErrorMessage().contains("Username and password do not match")
        );

    }

}
