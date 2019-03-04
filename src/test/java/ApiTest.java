import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.Header;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;
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

    @Test
    public void myThirdRaTest(){
        Header acceptHeader = new Header("accept","application/json");

        Response response = given()
                                .header(acceptHeader)
                                .get("https://restful-booker.herokuapp.com/booking/1");

        int statusCode = response.getStatusCode();

        assertThat(statusCode, is(200));
    }

    @Test
    public void myFourthRaTest(){
        Response response = given().get("https://restful-booker.herokuapp.com/booking/1");
        BookingResponse responseBody = response.as(BookingResponse.class);
        String additionalneeds = responseBody.getAdditionalneeds();

        assertThat(additionalneeds, is("Breakfast"));
    }

    @Test
    public void myFifthRaTest(){
        AuthPayload authPayload = new AuthPayload("admin", "password123");

        Response response = given()
                                .body(authPayload)
                                .contentType("application/json")
                                .post("https://restful-booker.herokuapp.com/auth");

        String authResponse = response.getBody().print();

        assertThat(authResponse, containsString("token"));
    }

}
