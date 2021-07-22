package baseTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyle {
	
	//Without Static import and Builder Pattern
	@Test
	public void GetBookingIds_VerifyStatusCode() {
		
		//Create a Request Specification
		RequestSpecification request = RestAssured.given();
		
		//Adding URI
		request.baseUri("https://restful-booker.herokuapp.com/booking");
		
		//Calling GET Method on URI.After hitting we get Response 
		Response response = request.get();
		
		//Lets print response Body 
		String restring = response.asString();
		System.out.println("Response Details :- "+restring);
		
		/*
		 * To Perform Validation on response like Status Code or Value, we need to 
		 * get ValidatableResponse type of response using then() method of Response
		 * interface. ValidatableResponse is also an interface
		 */  
		 
		 ValidatableResponse valRes = response.then();
		 //It will Check for the Status code is 200;
		 valRes.statusCode(200);
		 //It will check if status Line is as expected
		 valRes.statusLine("HTTP/1.1 200 OK");
	
	}
	
}
