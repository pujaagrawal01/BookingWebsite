package com.api.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import bsh.org.objectweb.asm.Type;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Generic_gorest_TestNG {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	
	
	//-------to get all the existing users--------
	public void get() 
	{
		RestAssured.given().accept(ContentType.JSON).get("https://gorest.co.in/public/v2/users").then().log().all();
	
	}
	
	//-----to get existing user  with param-----
	public void get_param(int id)
	{
		 RestAssured.given().accept(ContentType.JSON).header("Authorization","Bearer 2f029106591e3fe4b55e7ab41f025875cd5384f2e81514460294ef8baa248b0a").pathParam("id", id).get("https://gorest.co.in/public/v2/users/{id}").then().log().all();
	}
	
	//-------to create new user--------
	public void post() throws FileNotFoundException
{

RestAssured.given().baseUri("https://gorest.co.in").body(getfilecontent("C:\\Project\\Eclipse\\eclipse\\BookingWebsite\\src\\test\\resources\\DataFile\\gorest_post_testng.txt")).header("Content-Type","application/json").header("Accept","application/json").header("Authorization","Bearer 2f029106591e3fe4b55e7ab41f025875cd5384f2e81514460294ef8baa248b0a").when().log().all().post("/public/v2/users").then().log().all();

}
	//------to update existing user/record -----
    public void put(int id) throws FileNotFoundException
    {
    	RestAssured.given().baseUri("https://gorest.co.in").body(getfilecontent("C:\\Project\\Eclipse\\eclipse\\BookingWebsite\\src\\test\\resources\\DataFile\\gorest_put_testng.txt")).header("Content-Type","application/json").header("accept","application/json").header("Authorization","Bearer 2f029106591e3fe4b55e7ab41f025875cd5384f2e81514460294ef8baa248b0a").pathParam("id",id).when().log().all().put("/public/v2/users/{id}").then().log().all();
    }
	
	
	public static String getfilecontent(String filepath) throws FileNotFoundException
	{
	   File file=new File(filepath);
	   Scanner sc = new Scanner(file);
	   sc.useDelimiter("\\Z");
	   return sc.next();
}
	
}
