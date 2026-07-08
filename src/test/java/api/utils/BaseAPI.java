package api.utils;

import io.restassured.RestAssured;

public class BaseAPI {

    public static final String BASE_URL = "https://dummyapi.io/data/v1";

    static {

        RestAssured.baseURI = BASE_URL;

    }

}
