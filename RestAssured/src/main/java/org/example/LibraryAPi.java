package org.example;

import PayloadPackage.Payload;
import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import dataProvider.dataProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LibraryAPi {

//    @Test(dataProvider = "TestApiWithMultiData" ,dataProviderClass=dataProvider.class)
//    public void addBook(String bookName,String isbn) {
//
//        RestAssured.baseURI="http://216.10.245.166";
//
//        String response = given().log().all().header("Content-Type","application/json").body(Payload.addBooks(bookName, isbn)).when().post("Library/Addbook.php").
//                then().log().all().assertThat().statusCode(200).extract().response().asString();
//
//        JsonPath js = new JsonPath(response);
//
//        js.getString("ID");
//
//        System.out.println(js.getString("ID"));
//    }

    @Test
    public void addBookFromFile() throws IOException {

        RestAssured.baseURI="http://216.10.245.166";

        String response = given().log().all().header("Content-Type","application/json").body(String.valueOf(Files.readAllBytes(Paths.get(("/Users/sampathkumar/Desktop/addPlace.json.rtf"))))).when().post("Library/Addbook.php").
                then().log().all().assertThat().statusCode(200).extract().response().asString();

//        System.out.println("XXX"+response);
//        JsonPath js = new JsonPath(response);
//
//        String id=js.getString("ID");
//
//        System.out.println("{{{"+js.getString("ID"));
    }



//        @DataProvider(name = "TestApiWithMultiData")
//        public Object[][] giveArray() {
//            String array[][] = {{"Gandhi", "Ji"}, {"Modi", "Ji"}};
//            return array;
//    }

}
