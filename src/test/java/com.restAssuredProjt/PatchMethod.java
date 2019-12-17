package com.restAssuredProjt;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

//note: Always start json server before running these tests

// From cmd as administrator run: json-server --watch db.json

public class PatchMethod {

    @Test
    public void patchTest() {
        System.out.println("=============PATCH METHOD===================");
        Response response = given().contentType(ContentType.JSON).
                body ( "{"+"\"author\": \"England, UK\""+"}").patch ("http://localhost:3000/posts/6");
        response.prettyPrint();
    }

    @Test

    public void assertStatusCode(){

        given().get("http://localhost:3000/posts").andReturn().then().statusCode(200).log().all();

    }
}
