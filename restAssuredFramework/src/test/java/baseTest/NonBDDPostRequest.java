package baseTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class NonBDDPostRequest {	
	public static void main(String[] args) {

// There is no need to add Escape Character manually.
// Just Paste the String with Double Quotes 
// It will Automatically add Sequence as required
		
    String jsonString = 
    "{\"username\" : \"admin\",\"password\" : \"password123\"}";		

     // Create a Request Specification 
    RequestSpecification request = RestAssured.given();
    
//Setting Content Type to Specify Format in which request payload will be sent 
// ContentType is ENUM
   request.contentType(ContentType.JSON);

   
   // Adding URI
request.baseUri("https://restful-booker.herokuapp.com/auth");   

//Adding body as String 
request.body(jsonString);

//Calling  a Post Method on URI. After hitting we get Response 
Response reponse = request.post();

//Printing Response as String
System.out.println(reponse.asString());

//Get Validatable response to perform Validation 
ValidatableResponse validatbleresponse = reponse.then();

//Validate status code is 200
validatbleresponse.statusCode(200);

//Validate token field is null
		// SInce response is one to one mapping so passing key name will give you value.
		// Below method validates that value of token is not null.
	//	validatableResponse.body("token", Matchers.notNullValue());
		
		// Validate token length is 15
	//	validatableResponse.body("token.length()", Matchers.is(15));
		
		// Validate token is an alphanumeric value
//		validatableResponse.body("token", Matchers.matchesRegex("^[a-z0-9]+$"));
		
		
	}

}
