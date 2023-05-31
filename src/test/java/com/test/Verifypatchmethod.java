package com.test;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;

import com.api.test.Generic;

public class Verifypatchmethod {


	 @Test
	 public void verify_patch_method() throws FileNotFoundException
	 {
		 Generic patchref = new Generic();
		 patchref.patch(616);
		 
	 }
	 
}
