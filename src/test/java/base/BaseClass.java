package base;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;


public class BaseClass {

	@Test
	public void getTest() {
		given().
        auth().
        preemptive().
        basic("username", "password").   //this is used when we are using basic authentication
    when().
        get("http://path.to/basic/secured/api").
    then().
        assertThat().
        statusCode(200);
	}
}
