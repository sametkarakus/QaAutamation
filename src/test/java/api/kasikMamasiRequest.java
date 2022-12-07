package api;

import io.restassured.response.Response;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;


public class kasikMamasiRequest {

        Response response;
        String url = "https://www.e-bebek.com";
        String kw = "kaşık maması";

        //rest assured  kullanarak search yapar.
@Test
public void flightTiketFromListByRest(){

        response = given()
        .header("content-type","application/json")
        .when()
        .get(url+"/search?q="+kw)
        .then()
        .statusCode(200)
        .extract()
        .response();
        }

        }