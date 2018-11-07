package config;

import org.junit.Test;

import static io.restassured.RestAssured.*;

public class VideoGameDBTests extends TestConfig{

    @Test
    public void getAllGames()
        {
            given().get(EndPoint.GET_VIDEOGAMES).then().log().all();
        }
}
