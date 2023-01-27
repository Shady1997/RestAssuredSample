package requests;

import io.restassured.RestAssured;

public class FirstRequest {

	public static void main(String[] args) {

		// 1- use Rest Assured Interface
		RestAssured.given().baseUri("https://simple-books-api.glitch.me").basePath("/books/1").when().get()
				.prettyPrint();
	}

}
