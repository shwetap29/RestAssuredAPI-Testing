package com.bridgelabz.restassuredtest;

import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class APITestingBDD {

    // BDD Approach

    @Test
    public void getTest() {
        RestAssured.given()
                .when().get("http://localhost:3000/posts")
                .then().assertThat().statusCode(200);
    }

    @Test
    public void PostTest() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 11);
        jsonObject.put("title", "BDD-Approach");
        jsonObject.put("author", "Sony");
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toJSONString())
                .when()
                .post("http://localhost:3000/posts")
                .then()
                .statusCode(201);
    }

    @Test
    public void putTest() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", "Simpler-Approach");
        jsonObject.put("author", "Annu");
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toJSONString())
                .when()
                .put("http://localhost:3000/posts/8")
                .then()
                .statusCode(200);
    }

    @Test
    public void deleteTest() {
        JSONObject jsonObject = new JSONObject();
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body(jsonObject.toJSONString())
                .when()
                .delete("http://localhost:3000/posts/3")
                .then()
                .statusCode(200);


    }

    }

