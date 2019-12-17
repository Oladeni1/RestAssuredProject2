package com.restAssuredProjt;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

//note: Always start json server before running these tests

// From cmd as administrator run: json-server --watch db.json

public class PutMethod {


    @Test
    public void putTest() {
        System.out.println("=============PUT METHOD===================");
        File datapath = new File("C:\\Temp\\Put_Json_RestAssured.txt");
        Response response = given().contentType(ContentType.JSON).
                body(datapath).put("http://localhost:3000/posts/7");
        response.prettyPrint();
    }

    @Test

    public void assertStatusCode() {

        given().get("http://localhost:3000/posts").andReturn().then().statusCode(200).log().all();

    }

}