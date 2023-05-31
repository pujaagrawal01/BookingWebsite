package com.Steps;

import java.io.FileNotFoundException;

import com.api.test.Generic;

import io.cucumber.java.en.Given;

public class verifygetmethodsteps {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		Generic b1 = new Generic();
		
		@Given("verify Get Method")	
		public void verify_get_method ()
		{
		  b1.get();
		    
		}	
		
		@Given("verify Post Method")
		public void verify_post_method() throws FileNotFoundException {
		    b1.post();
		}
		
		@Given("verify Put Method")
		public void verify_put_method() throws FileNotFoundException 
		{
		   b1.put(1011);
		}
		
		
		@Given("verify Patch Method")
		public void verify_patch_method() throws FileNotFoundException 
		{
		    b1.patch(1011);
		}

		
		@Given("verify Delete Method")
		public void verify_delete_method()
		{
		    b1.delete_bookingid(387);
		}

	}


