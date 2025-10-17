package com.example.tp;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class ApiSmokeTest {
    @BeforeAll
    static void init() { RestAssured.baseURI = "http://localhost:8080/api"; }

    @Test
    void helloShouldReturn200() {
        given().header("X-API-KEY", "demo-key")
               .when().get("/hello")
               .then().statusCode(200)
               .body(containsString("Bonjour"));
    }
}
