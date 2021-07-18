package FunctionalTesting;


import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostRequestAutomation {

	@Test
	public void postAPIAutomation() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		String  json = "{\\r\\n\" + \r\n" + 
				"				\"    \\\"name\\\": \\\"morpheus\\\",\\r\\n\" + \r\n" + 
				"				\"    \\\"job\\\": \\\"leader\\\"\\r\\n\" + \r\n" + 
				"				\"}";
		
		RestAssured.given().body(json).post().then()
		.log()
		.all()
		.assertThat()
		.statusCode(201);
		
		
	}
	
}
