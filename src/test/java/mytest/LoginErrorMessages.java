package mytest;

import constant.BasePaths;
import constant.ErrorMessageConstants;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pojo.LoginErrorMessagePojo;
import pojo.LoginRequestPojo;

import static io.restassured.RestAssured.given;

public class LoginErrorMessages {
    private RequestSpecification requestSpec;
    private ResponseSpecification responseSpec;

    @BeforeClass
    public void beforeClass() {
        RequestSpecBuilder builder = new RequestSpecBuilder();                      //Setting up Request Specification Builder.
        builder.addHeader("Accept", "application/json");
        builder.addHeader("Content-Type", "application/json;charset=UTF-8");
        requestSpec = builder.build();

        ResponseSpecBuilder builderResp = new ResponseSpecBuilder();                //Setting up Response Specification Builder.
        builderResp.expectContentType("application/json");
        responseSpec = builderResp.build();
    }

    @BeforeTest
    public void setUpEndPoint() {
        RestAssured.baseURI = "https://scaleup-api.scalefocus.com";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @Test //Incorrect password and username.
    public void wrongCred() {
        LoginRequestPojo loginRequestPojo = new LoginRequestPojo(
                "wrong@scalefocus.com",
                "pass11",
                Boolean.FALSE);

        RestAssuredResponseImpl response = (RestAssuredResponseImpl) given()
                .spec(requestSpec)
                .body(loginRequestPojo)
                .when()
                .post(BasePaths.LOGIN_ENDPOINT);

        response
                .then()
                .spec(responseSpec);

        LoginErrorMessagePojo errorMessagePojo = response.as(LoginErrorMessagePojo.class);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.statusCode(), 400);
        softAssert.assertEquals(errorMessagePojo.getMessage(), ErrorMessageConstants.ERR_WRONG_CRED);
        softAssert.assertEquals(errorMessagePojo.getName(), ErrorMessageConstants.ERR_WRONG_CRED_N);
        softAssert.assertEquals(errorMessagePojo.getCode(), 400);
        softAssert.assertAll();

        System.out.println(response.getLogRepository().getRequestLog());
        System.out.println(response.getLogRepository().getResponseLog());
    }

    @Test //Incorrect password + valid username.
    public void wrongPass() {
        LoginRequestPojo loginRequestPojo = new LoginRequestPojo(
                "kudos.user@scalefocus.com",
                "pass11",
                Boolean.FALSE);

        RestAssuredResponseImpl response = (RestAssuredResponseImpl) given()
                .spec(requestSpec)
                .body(loginRequestPojo)
                .when()
                .post(BasePaths.LOGIN_ENDPOINT);

        response
                .then()
                .spec(responseSpec);

        LoginErrorMessagePojo errorMessagePojo = response.as(LoginErrorMessagePojo.class);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.statusCode(), 400);
        softAssert.assertEquals(errorMessagePojo.getMessage(), ErrorMessageConstants.ERR_WRONG_CRED);
        softAssert.assertEquals(errorMessagePojo.getName(), ErrorMessageConstants.ERR_WRONG_CRED_N);
        softAssert.assertEquals(errorMessagePojo.getCode(), 400);
        softAssert.assertAll();

        System.out.println(response.getLogRepository().getRequestLog());
        System.out.println(response.getLogRepository().getResponseLog());
    }

    @Test //Incorrect username + valid pass
    public void wrongUsername() {
        LoginRequestPojo loginRequestPojo = new LoginRequestPojo(
                "wrong@scalefocus.com",
                "Test@123456",
                Boolean.FALSE);

        RestAssuredResponseImpl response = (RestAssuredResponseImpl) given()
                .spec(requestSpec)
                .body(loginRequestPojo)
                .when()
                .post(BasePaths.LOGIN_ENDPOINT);

        response
                .then()
                .spec(responseSpec);

        LoginErrorMessagePojo errorMessagePojo = response.as(LoginErrorMessagePojo.class);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.statusCode(), 400);
        softAssert.assertEquals(errorMessagePojo.getMessage(), ErrorMessageConstants.ERR_WRONG_CRED);
        softAssert.assertEquals(errorMessagePojo.getName(), ErrorMessageConstants.ERR_WRONG_CRED_N);
        softAssert.assertEquals(errorMessagePojo.getCode(), 400);
        softAssert.assertAll();

        System.out.println(response.getLogRepository().getRequestLog());
        System.out.println(response.getLogRepository().getResponseLog());
    }

    @Test //Missing password and username
    public void missingCred() {
        LoginRequestPojo loginRequestPojo = new LoginRequestPojo(
                "",
                "",
                Boolean.FALSE);

        RestAssuredResponseImpl response = (RestAssuredResponseImpl) given()
                .spec(requestSpec)
                .body(loginRequestPojo)
                .when()
                .post(BasePaths.LOGIN_ENDPOINT);

        response
                .then()
                .spec(responseSpec);

        LoginErrorMessagePojo errorMessagePojo = response.as(LoginErrorMessagePojo.class);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.statusCode(), 400);
        softAssert.assertEquals(errorMessagePojo.getMessage(), ErrorMessageConstants.ERR_MISSING_USER);
        softAssert.assertEquals(errorMessagePojo.getName(), ErrorMessageConstants.ERR_MISSING_USER_N);
        softAssert.assertEquals(errorMessagePojo.getCode(), 400);
        softAssert.assertAll();

        System.out.println(response.getLogRepository().getRequestLog());
        System.out.println(response.getLogRepository().getResponseLog());
    }

    @Test //Missing password + valid username
    public void missingPass() {
        LoginRequestPojo loginRequestPojo = new LoginRequestPojo(
                "kudos.user@scalefocus.com",
                "",
                Boolean.FALSE);

        RestAssuredResponseImpl response = (RestAssuredResponseImpl) given()
                .spec(requestSpec)
                .body(loginRequestPojo)
                .when()
                .post(BasePaths.LOGIN_ENDPOINT);

        response
                .then()
                .spec(responseSpec);

        LoginErrorMessagePojo errorMessagePojo = response.as(LoginErrorMessagePojo.class);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.statusCode(), 400);
        softAssert.assertEquals(errorMessagePojo.getMessage(), ErrorMessageConstants.ERR_MISSING_PASS);
        softAssert.assertEquals(errorMessagePojo.getName(), ErrorMessageConstants.ERR_MISSING_USER_N);
        softAssert.assertEquals(errorMessagePojo.getCode(), 400);
        softAssert.assertAll();

        System.out.println(response.getLogRepository().getRequestLog());
        System.out.println(response.getLogRepository().getResponseLog());

    }

    @Test // Missing username + valid password
    public void missingUsername() {
        LoginRequestPojo loginRequestPojo = new LoginRequestPojo(
                "",
                "Test@123456",
                Boolean.FALSE);

        RestAssuredResponseImpl response = (RestAssuredResponseImpl) given()
                .spec(requestSpec)
                .body(loginRequestPojo)
                .when()
                .post(BasePaths.LOGIN_ENDPOINT);

        response
                .then()
                .spec(responseSpec);

        LoginErrorMessagePojo errorMessagePojo = response.as(LoginErrorMessagePojo.class);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.statusCode(), 400);
        softAssert.assertEquals(errorMessagePojo.getMessage(), ErrorMessageConstants.ERR_MISSING_USER);
        softAssert.assertEquals(errorMessagePojo.getName(), ErrorMessageConstants.ERR_MISSING_USER_N);
        softAssert.assertEquals(errorMessagePojo.getCode(), 400);
        softAssert.assertAll();

        System.out.println(response.getLogRepository().getRequestLog());
        System.out.println(response.getLogRepository().getResponseLog());

    }

    @Test// Invalid username format
    public void invalidFormat() {
        LoginRequestPojo loginRequestPojo = new LoginRequestPojo(
                "wrong",
                "Test@123456",
                Boolean.FALSE);

        RestAssuredResponseImpl response = (RestAssuredResponseImpl) given()
                .spec(requestSpec)
                .body(loginRequestPojo)
                .when()
                .post(BasePaths.LOGIN_ENDPOINT);

        response
                .then()
                .spec(responseSpec);

        LoginErrorMessagePojo errorMessagePojo = response.as(LoginErrorMessagePojo.class);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.statusCode(), 400);
        softAssert.assertEquals(errorMessagePojo.getMessage(), ErrorMessageConstants.ERR_WRONG_CRED);
        softAssert.assertEquals(errorMessagePojo.getName(), ErrorMessageConstants.ERR_WRONG_CRED_N);
        softAssert.assertEquals(errorMessagePojo.getCode(), 400);
        softAssert.assertAll();

        System.out.println(response.getLogRepository().getRequestLog());
        System.out.println(response.getLogRepository().getResponseLog());

    }
}
