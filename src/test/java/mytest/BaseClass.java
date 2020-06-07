package mytest;

import constant.BasePaths;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import pojo.LoginRequestPojo;
import pojo.LoginResponsePojo;

import static io.restassured.RestAssured.given;

public class BaseClass {
    protected String accessToken;

    @BeforeClass
    public void getAuthorizationToken1() {
        RestAssured.baseURI = BasePaths.BASE_URI;
        RestAssured.port = 9090;

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

        // Setting up the login request body
        LoginRequestPojo loginRequestPojo = new LoginRequestPojo(
                "kudos.user@scalefocus.com",
                "Test@123456",
                true);

        //Setting up Request Specification Builder.
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.addHeader("Accept", "application/json");
        builder.addHeader("Content-Type", "application/json;charset=UTF-8");
        builder.setBody(loginRequestPojo);
        RequestSpecification requestSpec = builder.build();

        //Setting up Response Specification Builder.
        ResponseSpecBuilder builderResp = new ResponseSpecBuilder();
        builderResp.expectContentType("application/json");
        ResponseSpecification responseSpec = builderResp.build();

        //Building the POST request
        Response response = given()
                .spec(requestSpec)
                .when()
                .post(BasePaths.LOGIN_ENDPOINT);

        response
                .then()
                .spec(responseSpec);

        //Getting the accessToken for Authentication
        LoginResponsePojo responsePojo = response.as(LoginResponsePojo.class);
        accessToken = responsePojo.getAccessToken();
    }
}
