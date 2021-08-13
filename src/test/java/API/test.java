package API;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;
public class test {
	@Test
	  public static void getResponseBody(){
		  
		  Response response = RestAssured.get("http://reqres.in/api/users?page=2");  
int s=response.getStatusCode();
	System.out.println(s );
		  
		 System.out.println( response.getTime());
		 Assert.assertEquals(s  , 200 );
		 System.out.println("Correct status code returned");
		System.out.println( response.getBody().asString());
			System.out.println(response.getStatusLine());
			System.out.println(response.headers());
			Headers allHeaders = response.headers();
			for(Header header : allHeaders)
			{
				System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
			}
			
		 Response response1 = RestAssured.get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1");  
			System.out.println( response1.getStatusCode());
				  
				 System.out.println( response1.getTime());
				System.out.println(response1.getTimeIn(TimeUnit.MILLISECONDS));
			System.out.println(response1.getStatusLine());
			System.out.println(response1.headers());
			System.out.println(response1.header("Content-Encoding"));
		
			 Response response2 = RestAssured.get("https://bookstore.toolsqa.com/BookStore/v1/Books");
			 	
				System.out.println( response2.getStatusCode());
					  
					 System.out.println( response2.getTime());
					System.out.println(response2.getTimeIn(TimeUnit.MILLISECONDS));
				System.out.println(response2.getStatusLine());
				System.out.println(response2.headers());
			System.out.println(response2.header("Content-Encoding"));
			
	  }

}
