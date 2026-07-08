package api.utils;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class HeaderManager {

    public static RequestSpecification request() {

        return given()

                .header("app-id","63a804408eb0cb069b57e43a")

                .header("Content-Type","application/json");

    }

}