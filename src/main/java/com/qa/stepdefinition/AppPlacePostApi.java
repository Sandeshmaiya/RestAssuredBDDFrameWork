package com.qa.stepdefinition;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;

import java.io.PrintStream;

import org.junit.Assert;

import com.qa.resource.APIResources;
import com.qa.resource.Specs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class AppPlacePostApi {
	RequestSpecification reqSpec;
	RequestSpecification req;
	ResponseSpecification resSpec;
	Response res, res1;

	PrintStream stream;

	@Given("^Add place payload with \"([^\"]*)\" and  \"([^\"]*)\" and \"([^\"]*)\"$")
	public void add_place_payload_with_and_and(String name, String lang, String addrs) throws FileNotFoundException {

		reqSpec = Specs.requestSpecs();
		resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		req = given().spec(reqSpec)
				.body("{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" + "    \"lng\": 33.427362\r\n"
						+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"" + name + "\",\r\n"
						+ "  \"phone_number\": \"(+91) 9945084953\",\r\n" + "  \"address\": \"" + addrs + "\",\r\n"
						+ "  \"types\": [\r\n" + "    \"shoe park\",\r\n" + "    \"shop\"\r\n" + "  ],\r\n"
						+ "  \"website\": \"http://google.com\",\r\n" + "  \"language\": \"" + lang + "\"\r\n" + "}");

	}

	@When("^user calls \"([^\"]*)\" api with Post http request$")
	public void user_calls_api_with_Post_http_request(String resource) throws Throwable {

		APIResources resourceapi = APIResources.valueOf(resource);
		res = req.when().post(resourceapi.getResource());

	}

	@Then("^api call is success with status code (\\d+)$")
	public void api_call_is_success_with_status_code(int arg1) throws Throwable {
		res1 = res.then().spec(resSpec).extract().response();
		Assert.assertEquals(res1.getStatusCode(), arg1);

	}

	@Then("^\"([^\"]*)\" value is \"([^\"]*)\"$")
	public void value_is(String arg1, String arg2) throws Throwable {

		JsonPath js = new JsonPath(res1.asString());

		Assert.assertEquals(js.getString(arg1).toString(), arg2);

	}

}
