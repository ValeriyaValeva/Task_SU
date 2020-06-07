package mytest;

import constant.BasePaths;
import constant.ErrorMessageConstants;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pojo.uptype.UpTypeErrorMessagePojo;
import pojo.uptype.UpTypeRequestPojo;

import static io.restassured.RestAssured.given;

public class CreateUpType extends BaseClass {
    private RequestSpecification requestSpec;
    private ResponseSpecification responseSpec;

    @BeforeClass
    public void beforeClass() {

        RequestSpecBuilder builder = new RequestSpecBuilder();                      //Setting up Request Specification Builder.
        builder.addHeader("Accept", "application/json, text/plain, */*");
        builder.addHeader("Content-Type", "application/json");
        builder.addHeader("Authorization", "Bearer " + accessToken);
        requestSpec = builder.build();

        ResponseSpecBuilder builderResp = new ResponseSpecBuilder();                //Setting up Response Specification Builder.
        builderResp.expectContentType("application/json");
        responseSpec = builderResp.build();
    }

    @Test
    public void createNewUpType() {

//        UpTypePojo upType = new UpTypePojo();           //Creating Json body for the RQ
//        upType.setMaxKudos(1);
//        upType.setName("TestBE");
//        upType.setReset("M");
//        upType.setV(0);
//        upType.setDeleteOption(true);

        UpTypeRequestPojo upType = new UpTypeRequestPojo(
                1,
                "Test32",
                "M",
                0,
                true);

        RestAssuredResponseImpl response = (RestAssuredResponseImpl) given()
                .spec(requestSpec)
                .body(upType)
                .when()
                .post(BasePaths.CREATE_UP_TYPE);

        response
                .then()
                .spec(responseSpec);

//        System.out.println(response.getLogRepository().getRequestLog());
//        System.out.println(response.getLogRepository().getResponseLog());

        UpTypeErrorMessagePojo upTypeErrorMessagePojo = response.as(UpTypeErrorMessagePojo.class);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.statusCode(), 200);    //Hard assert?
        softAssert.assertEquals(upTypeErrorMessagePojo.getMaxKudos(), 1);
        softAssert.assertEquals(upTypeErrorMessagePojo.getName(), upType.getName());
        softAssert.assertEquals(upTypeErrorMessagePojo.getResetUnit(), upType.getResetUnit());
        softAssert.assertEquals(upTypeErrorMessagePojo.getCanBeDeleted(), upType.getCanBeDeleted());

        // softAssert.assertAll();  To remove
    }

    @Test //missing UpType name
    public void emptyNameError() {
        UpTypeRequestPojo upType = new UpTypeRequestPojo(
                1,
                "",
                "M",
                0,
                true);

        RestAssuredResponseImpl response = (RestAssuredResponseImpl) given()
                .spec(requestSpec)
                .body(upType)
                .when()
                .post(BasePaths.CREATE_UP_TYPE);

        response
                .then()
                .spec(responseSpec);

        System.out.println(response.getLogRepository().getRequestLog());
        System.out.println(response.getLogRepository().getResponseLog());

        UpTypeErrorMessagePojo errorMessagePojo = response.as(UpTypeErrorMessagePojo.class);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.statusCode(), 400);
        softAssert.assertEquals(errorMessagePojo.getErrors().get(0), ErrorMessageConstants.ERR_MISSING_NAME);

        softAssert.assertAll();

    }
    @Test //missing UpType name
    public void emptyResetUnitError() {
        UpTypeRequestPojo upType = new UpTypeRequestPojo(
                1,
                "test",
                "",
                0,
                true);

        RestAssuredResponseImpl response = (RestAssuredResponseImpl) given()
                .spec(requestSpec)
                .body(upType)
                .when()
                .post(BasePaths.CREATE_UP_TYPE);

        response
                .then()
                .spec(responseSpec);

        System.out.println(response.getLogRepository().getRequestLog());
        System.out.println(response.getLogRepository().getResponseLog());

        UpTypeErrorMessagePojo errorMessagePojo = response.as(UpTypeErrorMessagePojo.class);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.statusCode(), 400);
        softAssert.assertEquals(errorMessagePojo.getErrors().get(0), ErrorMessageConstants.ERR_MISSING_RESET_UNIT);
        softAssert.assertEquals(errorMessagePojo.getErrors().get(1), ErrorMessageConstants.ERR_MISSING_RESET_UNIT_2);

        softAssert.assertAll();

    }
}
