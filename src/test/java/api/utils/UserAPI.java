package api.utils;

import io.restassured.response.Response;

public class UserAPI {

    public Response getUser(String id){
        return HeaderManager.request()
                .get("https://dummyapi.io/data/v1/user/" + id);
    }

    public Response getTags(){
        return HeaderManager.request()
                .get("https://dummyapi.io/data/v1/tag");

    }

    public Response createUser(){
        String email = "tridesma" + System.currentTimeMillis() + "@gmail.com";
        String body = """
            {
                "title":"mr",
                "firstName":"Tridesma",
                "lastName":"Essurgani",
                "email":"%s"
            }
            """.formatted(email);
        return HeaderManager.request()
                .body(body)
                .post("https://dummyapi.io/data/v1/user/create");

    }

    public Response updateUser(String id){

        String body = """
            {
                "firstName":"Tridesma Updated"
            }
            """;

        return HeaderManager.request()
                .body(body)
                .put("https://dummyapi.io/data/v1/user/" + id);
    }

    public Response deleteUser(String id){
        return HeaderManager.request()
                .delete("https://dummyapi.io/data/v1/user/" + id);
    }

    public Response getInvalidUser() {
        return HeaderManager.request()
                .get("https://dummyapi.io/data/v1/user/507f1f77bcf86cd799439011");
    }
}
