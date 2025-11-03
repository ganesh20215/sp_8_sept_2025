package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DeleteHttpMethod {

    @Test(description = "Verify Get API Request with query parameter")
    public void verifyDeleteHttpMethod() {
        RestAssured.baseURI = "https://reqres.in/api/users";
        Response res = RestAssured
                .given()
                .header("content-type", ContentType.JSON)
                .header("x-api-key", "reqres-free-v1")
                .when()
                .log().all()
                .delete("/2")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_NO_CONTENT)
                .extract().response();
    }
}
