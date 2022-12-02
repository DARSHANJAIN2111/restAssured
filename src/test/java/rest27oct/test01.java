package rest27oct;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
public class test01 {
	
	
	@Test
	public void test1() {
		
		given().get("https://reqres.in/api/users?page=2").
		then().
		       statusCode(200).log().all();
		
	}

}
