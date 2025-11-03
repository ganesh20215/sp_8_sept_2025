package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PutHttpMethod {

    @Test(description = "Verify Get API Request with query parameter")
    public void verifyPostHttpMethod() {
        RestAssured.baseURI = "https://reqres.in/api/users";
        JSONObject js = new JSONObject();
        js.put("fname", "Laxmi");
        js.put("lname", "Saraswati");
        js.put("company", "Edso Services");
        SoftAssert sf = new SoftAssert();
        Response res = RestAssured
                .given()
                .header("content-type", ContentType.JSON)
                .header("x-api-key", "reqres-free-v1")
                .body(js.toString())
                .when()
                .log().all()
                .put("/2")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        sf.assertEquals(res.jsonPath().getString("fname"), "Laxmi");
        sf.assertEquals(res.jsonPath().getString("lname"), "Saraswati");
        sf.assertEquals(res.jsonPath().getString("company"), "Edso Services");
        sf.assertNotNull(res.jsonPath().getString("updatedAt"));
        sf.assertAll();
    }
}
