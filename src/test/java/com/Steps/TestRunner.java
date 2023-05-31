package com.Steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Project\\Eclipse\\eclipse\\BookingWebsite\\src\\test\\resources\\Feature\\TestFeature.feature"
,glue ="com.Steps",tags ="@Smoke_test",plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
