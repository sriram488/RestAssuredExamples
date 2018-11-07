package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.BeforeClass;

public class TestConfig {

    public static RequestSpecification videoGame_requestSpec;
    public static ResponseSpecification videoGame_responseSpec;
    public static RequestSpecification footballGame_request;
    public static ResponseSpecification footballGame_response;

    @BeforeClass
    public static void setUp()
{
    videoGame_requestSpec = new RequestSpecBuilder()
            .setBaseUri("http://localhost")
            .setPort(8080)
            .setBasePath("/app/")
            .addHeader("Content-Type", "application/json")
            .addHeader("Accept", "application/json")
            .build();

    footballGame_request = new RequestSpecBuilder()
            .setBaseUri("http://api.football-data.org")
            .setBasePath("/v1/")
            .addHeader("X-Auth-Token", "f48830f4002b419db115f5f560c9b216")
            .addHeader("X-Response-Control", "minified")
            .build();
    RestAssured.requestSpecification = videoGame_requestSpec;

    videoGame_responseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200).build();
    RestAssured.responseSpecification = videoGame_responseSpec;
}
}
