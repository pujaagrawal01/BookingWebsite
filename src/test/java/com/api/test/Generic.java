package com.api.test;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class Generic {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
      //----to get the booking id ------
		public void get()
		{
			RestAssured.given().accept(ContentType.JSON).get("https://restful-booker.herokuapp.com/booking").then().log().all();
		}
		
 /* Get with parameterization 
  * public void get_bookingid(int booking id)
  *{
  *    RestAssured.given().accept(ContentType.JSON).pathParam("booking id",booking id).get("https://restful-booker.herokuapp.com/booking/{booking id}").then().log().all();
  * }
  */
		
		
	public void get_assertion()
	{
		
	}
	

	//------to create new booking id -----
		public void post() throws FileNotFoundException
		{
		    RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body(getfilecontent("C:\\Project\\Eclipse\\eclipse\\BookingWebsite\\src\\test\\resources\\DataFile\\createrequestbody.txt")).header("Content-Type","application/json").header("Accept","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().post("/booking").then().log().all();
	    }
		
	//------to update existing booking id -----
		public void put(int bookingid) throws FileNotFoundException
		{
            RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body(getfilecontent("C:\\Project\\Eclipse\\eclipse\\BookingWebsite\\src\\test\\resources\\DataFile\\putrequestbody.txt")).header("Content-Type","application/json").header("Accept","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").pathParam("bookingid",bookingid).when().log().all().put("/booking/{bookingid}").then().log().all();
		}
		
		public void patch(int bookingid) throws FileNotFoundException
		{
            RestAssured.given().baseUri("https://restful-booker.herokuapp.com").body(getfilecontent("C:\\Project\\Eclipse\\eclipse\\BookingWebsite\\src\\test\\resources\\DataFile\\patchdatafile.txt")).header("Content-Type","application/json").header("Accept","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").pathParam("bookingid",bookingid).when().log().all().patch("/booking/{bookingid}").then().log().all();
		}
		
		public void delete_bookingid(int bookingid)
		{		
				RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
						.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=").pathParam("bookingid", bookingid).when().log().all().delete("/booking/{bookingid}").then()
						.log().all();	
		}
		

		
		
		public static String getfilecontent(String filepath) throws FileNotFoundException
        {
            File file=new File(filepath);
            Scanner sc = new Scanner(file);
            sc.useDelimiter("\\Z");
            return sc.next();
        }
		
	}



