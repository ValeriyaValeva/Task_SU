package mytest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUpType extends BaseClass {
    private RequestSpecification requestSpec;
    private ResponseSpecification responseSpec;

    @BeforeClass
    public void beforeClass() {

        RequestSpecBuilder builder = new RequestSpecBuilder();                      //Setting up Request Specification Builder.
        builder.addHeader("Authorization", "Bearer " + accessToken);
        requestSpec = builder.build();

        ResponseSpecBuilder builderResp = new ResponseSpecBuilder();                //Setting up Response Specification Builder.
        builderResp.expectContentType("application/json");
        responseSpec = builderResp.build();

    }

    @Test
    public void deleteNewUpType() {
        RestAssuredResponseImpl response = (RestAssuredResponseImpl) given()
                .spec(requestSpec)
                .when()
                .delete("/kudos-type/5ed6144a3b69e8750f54711c");

        response
                .then()
                .spec(responseSpec);

        System.out.println(response.getLogRepository().getResponseLog());
    }
}
