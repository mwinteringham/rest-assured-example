import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ApiTest {

    @Test
    public void myFirstRaTest(){
        assertThat(RestAssured.config(), instanceOf(RestAssuredConfig.class));
    }

    @Test
    public void mySecondRaTest(){
        Response response = given().get("https://automationintesting.online/auth/actuator/health");
        int statusCode = response.getStatusCode();

        assertThat(statusCode, is(200));
    }

}
