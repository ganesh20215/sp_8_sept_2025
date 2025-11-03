package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetWithQueryParameter {

    @Test(description = "Verify Get API Request with query parameter")
    public void verifyGetWithQueryParameter() {
        RestAssured.baseURI = "https://reqres.in/api/users";
        SoftAssert sf = new SoftAssert();
        Response res = RestAssured
                .given()
                .header("content-type", ContentType.JSON)
                .header("x-api-key", "reqres-free-v1")
                .queryParam("page", 2)
                .when()
                .log().all()
                .get()
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        sf.assertEquals(res.jsonPath().getString("page"), "2");
        sf.assertEquals(res.jsonPath().getString("per_page"), "6");
        sf.assertEquals(res.jsonPath().getString("data[0].id"), "7");
        sf.assertEquals(res.jsonPath().getString("data[0].first_name"), "Michael");
        sf.assertEquals(res.jsonPath().getString("data[0].last_name"), "Lawson");
        sf.assertAll();
    }
}
