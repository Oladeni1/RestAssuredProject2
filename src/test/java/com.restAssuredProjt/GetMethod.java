package com.restAssuredProjt;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

//note: Always start json server before running these tests

// From cmd as administrator run: json-server --watch db.json


public class GetMethod {


@Test
    public void getTest(){
    System.out.println("=============GET METHOD===================");
        Response response = given().contentType(ContentType.JSON).get("http://localhost:3000/posts");
        response.prettyPrint();

    }
    @Test

    public void assertStatusCode(){

    given().get("http://localhost:3000/posts").andReturn().then().statusCode(200).log().all();

    }

}
