package testcases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class OAuth1PostDelete {

	public static void main(String[] args) {
		
		Response resp=RestAssured.given()
		.accept(ContentType.JSON)
		.auth()
		.oauth("d9W4SCFLele7sWPtEx6k7pr96","NlrEB5DrmYUltXdtOEcBwixapAjP4brtAuaeHhsI5gO7aDYp5E", "327819018-Mtlgq9tS5yoEVVTuYOydMDy3HsqduMqtrk3iWJrg","EG26tt8bCEIIunduSCs7IR4CJZjBjjMuQsunUXtlDbh91")
		.post("https://api.twitter.com/1.1/statuses/destroy/1165873281846497280.json");
		
		System.out.println(resp.getStatusCode());
		//System.out.println(resp.getStatusLine());
		System.out.println(resp.getBody().jsonPath().prettify());


	}

}
