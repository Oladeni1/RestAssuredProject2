package com.restAssuredProjt;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class PostMethod {


    @Test
    public void postTest() {
        System.out.println("=============POST METHOD===================");
        File datapath = new File("C:\\Temp\\Post_Json_RestAssured.txt");
        Response response = given().contentType(ContentType.JSON).
                body(datapath).post("http://localhost:3000/posts");
        response.prettyPrint();
    }

    @Test

    public void assertStatusCode() {

        given().get("http://localhost:3000/posts").andReturn().then().statusCode(200).log().all();

    }

}