package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetHttpMethod {

    //1. RestAssured : Used for configure and initialized API Request
    //2. Request Specification : To define http request
    //3. Response : It represent the HTTP response return by the server
    //4. validate status code of API

    @Test(description = "Verify Get API Request")
    public void verifyGetHttpMethod() {
        RestAssured.baseURI = "https://reqres.in/api/users";
        SoftAssert sf = new SoftAssert();
        Response res = RestAssured
                .given()
                .header("content-type", ContentType.JSON)
                .header("x-api-key", "reqres-free-v1")
                .when()
                .log().all()
                .get("/2")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        sf.assertEquals(res.jsonPath().getString("data.first_name"), "Janet");
        sf.assertEquals(res.jsonPath().getString("data.last_name"), "Weaver");
        sf.assertAll();
    }


    @Test(description = "Verify Get API Request")
    public void verifyGetHttpMethodWithHamcrestMatters() {
        RestAssured.baseURI = "https://reqres.in/api/users";
        RestAssured
                .given()
                .header("content-type", ContentType.JSON)
                .header("x-api-key", "reqres-free-v1")
                .when()
                .log().all()
                .get("/2")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("data.id", Matchers.equalTo(2),
                        "data.first_name", Matchers.equalTo("Janet"),
                        "data.last_name", Matchers.equalTo("Weaver"));
    }


}
