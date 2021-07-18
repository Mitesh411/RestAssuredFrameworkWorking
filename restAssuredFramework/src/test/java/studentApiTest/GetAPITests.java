package studentApiTest;

import org.testng.annotations.Test;

import apiConfigs.APIPath;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAPITests extends BaseTest{
	
	@Test
	public void getAPITest() {
//		RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_USERS)
//		.then()
//		.log()
//		.all();
		
	  Response response = RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_USERS);
	  System.out.println(response.getBody().asString());
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getCookies());
	  System.out.println(response.getTime());
	}
	
}
