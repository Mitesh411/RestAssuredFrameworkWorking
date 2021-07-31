package baseTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;

public class BDDStyle {
	
	@Test
	public void GetBookingIds_VerifyStatusCode() {
		
		//Given
		given().baseUri("https://restful-booker.herokuapp.com")
		
		//When
		.when()
		.get("/booking")
		//Then
	    .then()
	    .statusCode(200)
	    .statusLine("HTTP/1.1 200 OK")
	    .log()
	    .all();
	    //To Verify booking count
	   // .body("bookingid", hasSize(10));
		// To verify booking id at index 3
		//.body("bookingid[3]", equalTo(1));
 }

	
	@Test
	public void measureResponseTimeUsingOptionsMethods() {
		//There is no need to add escape character manaually.
// Just Paste String with the quotes. It automatically add escape sequence as required
		
String jsonString = "{\"username\" : \"admin\",\"password\" : \"password123\"}";
		
		// Create a request specification 
		RequestSpecification request= RestAssured.given();
		
		// Setting content type to specify format in which request payload will be sent.
		// ContentType is an ENUM. 
		request.contentType(ContentType.JSON);
		//Adding URI
		request.baseUri("https://restful-booker.herokuapp.com/auth");
		// Adding body as string
		request.body(jsonString);
		
		// Calling POST method on URI. After hitting we get Response
		Response response = request.post();
		
		// By default response time is given in milliseconds
		long responseTime1 = response.getTime();
		System.out.println("Response time in ms using getTime():"+responseTime1);
		
		// we can get response time in other format as well
		long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using getTimeIn():"+responseTimeInSeconds);
		
		
		// Similar methods 
		long responseTime2 = response.time();
		System.out.println("Response time in ms using time():"+responseTime2);
		
		long responseTimeInSeconds1 = response.timeIn(TimeUnit.SECONDS);
		System.out.println("Response time in seconds using timeIn():"+responseTimeInSeconds1);

	}
	
}
