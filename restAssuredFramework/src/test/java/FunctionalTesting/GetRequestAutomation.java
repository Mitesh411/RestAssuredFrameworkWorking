package FunctionalTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetRequestAutomation {
	@Test
	public void getRequestAutomation() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		Response response = RestAssured.given().param("page", "2").when().get();
		
		System.out.println("\n"+response.getBody().asString());
		System.out.println("\n Get Status Code :- \t"+response.getStatusCode());
		System.out.println("\n Get Content Type :- \t"+response.getContentType());
		System.out.println("\n Time :- \t"+response.getTime());
		System.out.println("\n Cookies :- \t "+response.getCookies());
		
		System.out.println(response.prettyPrint());
		
		
//		RestAssured.given().param("page", "2")
//			.when()
//			.get()
//			.then()
//			.assertThat()
//			.log()
//			.all()
//			.statusCode(200);
		
	}
}
