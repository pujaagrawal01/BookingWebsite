package com.api.test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Pathparameterization {

	public static void pathgetparam(int id)
		{
			RestAssured.given().accept(ContentType.JSON).pathParam("id",id).get("https://reqres.in/api/users/{id}").then().log().all();
		}
		
	 public static void queryParamcell()
		{
		RestAssured.given().accept(ContentType.JSON).queryParam("page", 4).get("https://reqres.in/api/users").then().log().all();
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		 pathgetparam(2);
		System.out.println("*******************");
			
		pathgetparam(3);
		System.out.println("*******************");
			
}
}

