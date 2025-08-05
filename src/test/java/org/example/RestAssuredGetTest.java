package org.example;


import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.File;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class RestAssuredGetTest {
    static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2ODZhYmJkZDVkMGRmNzAwM2RkNjc5MGQiLCJpYXQiOjE3NTMxMDc3NjYsImV4cCI6MTc1MzcxMjU2Nn0.fwZMQJjTXv-4vLMNlhtTHZWlo8St7EM7__jQp33JFEw";
    @BeforeEach
    public void setUp(){
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru/";

    }

   /* @Test
    public void getMyInfoStatusCode(){
        given().auth().oauth2(token).get("/api/users/me").then().statusCode(200);
    }*/

   /* @Test
    public void checkUserName() {

        Response response =  given().auth().oauth2(token)
                .get("/api/users/me");
        response.then().assertThat().body("data.name", equalTo("Жак-Ив Кусто"));
        System.out.println(response.body().asString());
    }

   @Test
    public void checkUserActivityAndPrintResponseBody() {
        Response response = given().auth().oauth2(token).get("/api/users/me");
        response.then().assertThat().body("data.about", equalTo("Исследователь"));
        System.out.println(response.body().asString());
    }

    @Test
    public void checkCardStatusCode() {
        /*given().auth().oauth2(token).get("/api/cards").then().statusCode(200);
    }

    @Test
    public void createNewPlaceAndCheckResponse(){
        File json = new File("src/test/resources/newCard.json");
       Response response = given().header("Content-type", "application/json").auth().oauth2(token).and().body(json).when().post("api/cards");
        response.then().assertThat().body("data._id", notNullValue()).and().statusCode(201);
    }
*/
  /*  @Test
    public void createNewPlaceAndCheckResponse2(){
        Card card = new Card("Интересное место", "https://code.s3.yandex.net/qa-automation-engineer/java/files/paid-track/sprint1/photoSelenide.jpg");
        Response response = given().header("Content-type", "application/json").auth().oauth2(token).and().body(card).when().post("api/cards");
        response.then().assertThat().body("data._id", notNullValue()).and().statusCode(201);
    }*/

}
