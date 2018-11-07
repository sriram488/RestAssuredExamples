package config;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
// checkout the project https://github.com/TechieTester/VideoGameDB
// http://localhost:8080/swagger-ui/index.html#/ to explore the endpoints.
// run ./gradlew bootRun before running the tests

public class MyFirstTest extends TestConfig {

        @Test
        public void myFirstTest()
        {
        given().log().ifValidationFails().
        when().get("videogames/").
                then().log().all();
        }

        @Test
        public void getAllVideoGames()
        {
                when().get(EndPoint.GET_VIDEOGAMES).then().log().all();
        }
    }

