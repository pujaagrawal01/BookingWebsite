package com.api.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class APITest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//---GET Method to fetch all booking IDs present ---
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").when().log().all().get("/booking").then().log().all();

		//---POST Method to create new booking ---
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body(getfilecontent("C:\\Project\\Eclipse\\eclipse\\BookingWebsite\\src\\test\\resources\\DataFile\\createrequestbody.txt")).header("Content-Type","application/json").header("Accept","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().post("/booking").then().log().all();
	
		//----PUT Method to update the existing booking---
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body(getfilecontent("C:\\Project\\Eclipse\\eclipse\\BookingWebsite\\src\\test\\resources\\DataFile\\createrequestbody.txt")).header("Content-Type","application/json").header("Accept","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().put("/booking/154").then().log().all();
		
		//----PATCH Method for partial update on Booking ---
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body(getfilecontent("C:\\Project\\Eclipse\\eclipse\\BookingWebsite\\src\\test\\resources\\DataFile\\patchdatafile.txt")).header("Content-Type","application/json").header("Accept","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().patch("/booking/3262").then().log().all();
		
		//C:\Project\Eclipse\eclipse\BookingWebsite\src\test\resources\DataFile\patchdatafile.txt
		
		//----DELETE Method to delete the existing Booking--
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/booking/3262").then().log().all();
		
    }
    
public static String getfilecontent(String filepath) throws FileNotFoundException
        {
            File file=new File(filepath);
            Scanner sc = new Scanner(file);
            sc.useDelimiter("\\Z");
            return sc.next();
        }
		
	}


