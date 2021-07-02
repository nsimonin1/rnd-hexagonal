package org.afrinnov.rnd.hex;

import io.quarkus.test.junit.QuarkusTest;
import org.afrinnov.rnd.hex.ui.AccessCodeUI;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/generator")
          .then()
             .statusCode(200)
             .body(Matchers.not(Matchers.empty()));
    }

}