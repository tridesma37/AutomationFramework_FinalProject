package api.utils;

import io.restassured.response.Response;

public class UserAPI {

    public Response getUser(){

        return HeaderManager.request()

                .get("https://dummyapi.io/data/v1/user/60d0fe4f5311236168a109ca");

    }

    public Response getTags(){

        return HeaderManager.request()

                .get("https://dummyapi.io/data/v1/tag");

    }

    public Response createUser(){

        String body = """
                {
                    "firstName":"Tridesma",
                    "lastName":"Essurgani",
                    "email":"tridesma.essurgani@gmail.com"
                }
                """;

        return HeaderManager.request()

                .body(body)

                .post("https://dummyapi.io/data/v1/user/create");

    }

    public Response updateUser(){

        String body = """
                {
                    "firstName":"Lucky Update"
                }
                """;

        return HeaderManager.request()

                .body(body)

                .put("https://dummyapi.io/data/v1/user/60d0fe4f5311236168a109ca");

    }

    public Response deleteUser(){

        return HeaderManager.request()

                .delete("https://dummyapi.io/data/v1/user/60d0fe4f5311236168a109ca");

    }

}
