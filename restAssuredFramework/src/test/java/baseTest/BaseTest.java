package baseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import utils.ExtentReportListner;
import utils.FileandEnv;

public class BaseTest extends ExtentReportListner{
	
	@BeforeClass
	public void baseTest() {
		RestAssured.baseURI = "https://reqres.in/";
	}
	
	
	
	@Test
	public void utilsTest() {
		//System.out.println(FileandEnv.envAndFile());
		
		
	}
}
