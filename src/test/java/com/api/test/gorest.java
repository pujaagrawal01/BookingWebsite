package com.api.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class gorest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	
	RestAssured.given().baseUri("https://gorest.co.in").body(getfilecontent("C:\\Project\\Eclipse\\eclipse\\BookingWebsite\\src\\test\\resources\\DataFile\\gorestPostdata.txt")).header("Content-Type","application/json").header("Accept","application/json").header("Authorization","Bearer 2f029106591e3fe4b55e7ab41f025875cd5384f2e81514460294ef8baa248b0a").when().log().all().post("/public/v2/users").then().log().all();
	
}
public static String getfilecontent(String filepath) throws FileNotFoundException
{
    File file=new File(filepath);
    Scanner sc = new Scanner(file);
    sc.useDelimiter("\\Z");
    return sc.next();
}
}