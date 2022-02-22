package com.bridgelabz.restassuredtest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class GetTest {

    @Test
    public void getTest() {
        Response response = RestAssured.get("http://localhost:3000/posts");
        System.out.println("Response code: " + response.getStatusCode());
        JsonPath jsonPath = response.jsonPath();
        //response.prettyPrint();
        System.out.println("id: " + jsonPath.get("id"));
    }

    @Test
    public void postTest(){
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 10);
        jsonObject.put("title", "restassured");
        jsonObject.put("author", "Shweta");
        requestSpecification.body(jsonObject.toJSONString());
        Response response = requestSpecification.post("http://localhost:3000/posts");
        System.out.println("responsecode:" +response.getStatusCode());
        response.prettyPrint();

    }

    @Test
    public void putTest() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", "RestApi");
        jsonObject.put("author", "Shakti");
        requestSpecification.body(jsonObject.toJSONString());
        Response response = requestSpecification.put("http://localhost:3000/posts/8");
        System.out.println("responsecode:" +response.getStatusCode());
        response.prettyPrint();

    }

    @Test
    public void deleteTest() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.header("Content-Type", "application/json");
        Response response = requestSpecification.delete("http://localhost:3000/posts/3");
        System.out.println("responsecode:" +response.getStatusCode());
        response.prettyPrint();



    }
}