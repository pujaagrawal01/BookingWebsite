package com.api.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class APITest1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		
		//RestAssured.given().baseUri("https://gorest.co.in/public/v2/users").body(getfilecontent("C:\\Project\\Eclipse\\eclipse\\BookingWebsite\\src\\test\\resources\\DataFile\\gorestPostdata.txt")).header("Content-Type","application/json").header("Accept","application/json").header("Authorization","Bearer 385970dabcbb845812f077cfaf815bde20c1de88e737cca8a5fb9f74d1d04124").when().log().all().post("/users").then().log().all();

RestAssured.baseURI = "https://restful-booker.herokuapp.com";
RequestSpecification httpRequest = RestAssured.given();
io.restassured.response.Response response = httpRequest.get("/booking/924");
// Retrieve the body of the Response
String body1 = response.getBody().toString();
//response = httpRequest.get("/booking/924").body(body1).post("/booking");
String jsonString = response.asString();
// By using the ResponseBody.asString() method, we can convert the  body
// into the string representation.
System.out.println("Response Body is: " + jsonString);

RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body(jsonString)
.header("Content-Type", "application/json").header("Accept","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log()
        .all().post("/booking").then().log().all();
	}
	
	public static String getfilecontent(String filepath) throws FileNotFoundException
    {
        File file=new File(filepath);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        return sc.next();
    }
    

}
