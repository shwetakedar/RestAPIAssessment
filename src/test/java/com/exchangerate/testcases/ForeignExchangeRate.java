package com.exchangerate.testcases;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import com.exchangerate.Utilities.ReadConfig;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ForeignExchangeRate {
	
	ReadConfig readconfig = new ReadConfig();
	public String url = readconfig.getApplicationUrl();
	
	RequestSpecification rs;
	Response response;
	
	@Given("Rates API for latest Foreign Exhchange rates")
	public void rates_API_for_latest_Foreign_Exhchange_rates() throws IOException {
		rs = given().baseUri(url);
	}
	
	@When("user calls latest Foreign Exchange Rates API {string} with GET http request")
	public void user_calls_latest_Foreign_Exchange_Rates_API_with_GET_http_request(String apiUrl) {
		//System.out.println("The response url is" +apiUrl);
		response = rs.when().get(url+apiUrl);		
	}

	
	@Then("the API call is displayed with status code {int}")
	public void the_API_call_is_displayed_with_status_code(Integer expectedStatusCode) {
		Integer statusCode = response.getStatusCode();
		assertEquals(statusCode,expectedStatusCode);
	}

	@And("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String expectedValue) {
           String resp = response.asString();
		   JsonPath js = new JsonPath(resp);
		   assertEquals(js.get(keyValue),expectedValue); 
		   System.out.println("Key value of " + keyValue + " is: " +expectedValue); 
		  }
	
	@Then("{string} is displayed")
	public void is(String string){
		String res = response.jsonPath().getString("rates");
		System.out.println("Rates is :" +res);
		}
}
