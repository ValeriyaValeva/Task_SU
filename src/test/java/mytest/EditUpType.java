package mytest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pojo.uptype.UpTypeRequestPojo;

import static io.restassured.RestAssured.given;

public class EditUpType extends BaseClass {
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
    public void updateNewUpType() {

        UpTypeRequestPojo upType = new UpTypeRequestPojo(
                10,
                "TestChanged",
                "M",
                0,
                true);

        RestAssuredResponseImpl response = (RestAssuredResponseImpl) given()
                .spec(requestSpec)
                .body(upType)
                .when()
                .put("/kudos-type/5ed4e6e83b69e8750f547112");

        response
                .then()
                .spec(responseSpec);


    }
}
