package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.api.test.Generic_gorest_TestNG;

public class verifygorestputtestng {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

	@Test
	
	public void verify_put_gorest() throws FileNotFoundException
	{
		Generic_gorest_TestNG mput= new Generic_gorest_TestNG();
		mput.put(2273505);
	}
}
