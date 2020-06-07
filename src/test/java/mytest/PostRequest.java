/*given()
       .param("x", "y")
       .header("z", "p")
when()
       .get("something")
then()
       .statusCode(200)
       .body("x.y", equalTo("z");
       */

package mytest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;

public class PostRequest {
    public String bodyValue = "{\"username\":\"kudos.user@scalefocus.com\",\"password\":\"Test@123456\",\"keepSignedIn\":true}";

    public PostRequest() {
        RestAssured.baseURI = "https://scaleup-api.scalefocus.com";

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @Test
    public void login() {

//        JsonObject jsonObject = new JsonObject();                        //Json created with JsonObject
//        jsonObject.addProperty("username","kudos.user@scalefocus.com");
//        jsonObject.addProperty("password", "Test@123456");

//        LoginRequestPojo loginRequestPojo = new LoginRequestPojo(
//                "kudos.user@scalefocus.com",
//                "Test@123456",
//                Boolean.FALSE);
//        loginRequestPojo.setUsername("kudos.user@scalefocus.com");
//        loginRequestPojo.setPassword("Test@123456");


        RequestSpecBuilder builder = new RequestSpecBuilder();                      //Setting up Request Specification Builder.
        builder.addHeader("Accept", "application/json");
        builder.addHeader("Content-Type", "application/json;charset=UTF-8");
        builder.setBody(bodyValue);
        RequestSpecification requestSpec = builder.build();

        ResponseSpecBuilder builderResp = new ResponseSpecBuilder();                //Setting up Response Specification Builder.
        builderResp.expectContentType("application/json");
        ResponseSpecification responseSpec = builderResp.build();

        Response response = given()
                .spec(requestSpec)
                .when()
                .post("/login");

        response
                .then()
                .spec(responseSpec);


        String accessToken = response.path("accessToken").toString();
//      LoginResponsePojo responsePojo = response.as(LoginResponsePojo.class);
//      System.out.println(responsePojo.toString());
//      RestAssured.requestSpecification.header("jwt",accessToken);
//
        System.out.println("The access token is: " + accessToken);
        System.out.println();

        String clientId = response.path("client.id");
        System.out.println(clientId);

        int statusCode = response.statusCode();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(statusCode, 200);
        softAssert.assertAll();
        Reporter.log("Status code is 200 as expected");


//
//        GsonBuilder builder2 = new GsonBuilder();           //Creating a Gson object
//        builder2.setPrettyPrinting();
//        Gson gson = builder2.create();
//
//        PostRequest bodyObj = gson.fromJson(bodyValue, PostRequest.class);  //Deserialize
//        System.out.println(bodyObj.bodyValue);
//
//        String bodyValue2 = gson.toJson(bodyObj);           //Serialize
//        System.out.println(bodyValue2);

    }

}
