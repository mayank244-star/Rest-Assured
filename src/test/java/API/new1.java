package API;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
public class new1 {

	@Test
	public static void getResponseStatus(){
		final String url="http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
		   int statusCode= given().queryParam("CUSTOMER_ID","68195").queryParam("PASSWORD","1234!").queryParam("Account_No","1").when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
		   System.out.println(statusCode);
		  given().when().get(url).then().assertThat().statusCode(200).log().all();
		   given().queryParam("CUSTOMER_ID","68195").queryParam("PASSWORD","1234!").queryParam("Account_No","1").when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log().body();
			  
	}
}
