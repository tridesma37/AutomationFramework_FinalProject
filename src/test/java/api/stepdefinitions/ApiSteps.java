package api.stepdefinitions;

import api.utils.UserAPI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

public class ApiSteps {
    UserAPI userAPI = new UserAPI();
    Response response;
    String userId;

    private void createTemporaryUser() {
        Response createResponse = userAPI.createUser();
        userId = createResponse.jsonPath().getString("id");
        System.out.println("Temporary User ID : " + userId);
    }

    @Given("User memiliki endpoint Get User")
    public void user_memiliki_endpoint_get_user() {
    }

    @When("User mengirim request GET User")
    public void user_mengirim_request_get_user() {
        createTemporaryUser();
        response = userAPI.getUser(userId);
    }

    @Then("Status code API harus 200")
    public void status_code_api_harus_200() {
        System.out.println("Status Code : " + response.getStatusCode());
        response.prettyPrint();
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Given("User memiliki endpoint Create User")
    public void user_memiliki_endpoint_create_user() {
    }

    @When("User mengirim request POST User")
    public void user_mengirim_request_post_user() {
        response = userAPI.createUser();
        userId = response.jsonPath().getString("id");
        System.out.println("Created User ID : " + userId);
    }

    @Then("User berhasil dibuat")
    public void user_berhasil_dibuat() {
        System.out.println("Status Code : " + response.getStatusCode());
        response.prettyPrint();
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Given("User memiliki endpoint Update User")
    public void user_memiliki_endpoint_update_user() {
    }

    @When("User mengirim request PUT User")
    public void user_mengirim_request_put_user() {
        createTemporaryUser();
        response = userAPI.updateUser(userId);
    }

    @Then("User berhasil diupdate")
    public void user_berhasil_diupdate() {
        System.out.println("Status Code : " + response.getStatusCode());
        response.prettyPrint();
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Given("User memiliki endpoint Delete User")
    public void user_memiliki_endpoint_delete_user() {
    }

    @When("User mengirim request DELETE User")
    public void user_mengirim_request_delete_user() {
        createTemporaryUser();
        response = userAPI.deleteUser(userId);
    }

    @Then("User berhasil dihapus")
    public void user_berhasil_dihapus() {
        System.out.println("Status Code : " + response.getStatusCode());
        response.prettyPrint();
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Given("User memiliki endpoint Tag")
    public void user_memiliki_endpoint_tag() {
    }

    @When("User mengirim request GET Tag")
    public void user_mengirim_request_get_tag() {
        response = userAPI.getTags();
    }

    @Then("Tag berhasil ditampilkan")
    public void tag_berhasil_ditampilkan() {
        Assert.assertEquals(200, response.getStatusCode());
    }
}