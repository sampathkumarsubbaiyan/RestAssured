package org.example;


import PayloadPackage.Payload;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matchers;

import javax.imageio.ImageTranscoder;

import static io.restassured.RestAssured.*;


public class FirstApi {

  public static void main(String[] args) {
      baseURI="https://rahulshettyacademy.com";

      // POST method

      String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body(Payload.requiredPayload()).
              when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("scope",Matchers.equalTo("APP")).
      header("Server","Apache/2.4.41 (Ubuntu)").extract().response().asString();

      JsonPath json = new JsonPath(response);

      String place_id = json.getString("place_id");

      System.out.println("PlaceId for the added location is " + place_id);

      //PUT method

     given().log().all().queryParam("key","qaclick123").queryParam("place_id",place_id).header("Content-Type","application/json").body("{\n" +
             "\"place_id\":\""+place_id+"\",\n" +
             "\"address\":\"70 winter walk, USA\",\n" +
             "\"key\":\"qaclick123\"\n" +
             "}").when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200).body("msg",Matchers.equalTo("Address successfully updated"));

     //GET method

     String response1 = given().log().all().queryParam("key","qaclick123").queryParam("place_id",place_id).
             when().get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).body("address", Matchers.equalTo("70 winter walk, USA")).
     extract().response().asString();

     JsonPath jsonPath = new JsonPath(response1);
     String updatedLocation = jsonPath.get("address");
      System.out.println("UL" + updatedLocation);

  }



}
