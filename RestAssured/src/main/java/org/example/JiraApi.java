package org.example;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class JiraApi {

    @Test
    public void addCommentApi() {
        RestAssured.baseURI = "http://localhost:8080";

        SessionFilter sessionFilter=new SessionFilter();

        String response = given().header("Content-Type", "application/json").body("{ \"username\": \"sampathkumar240399\", \"password\": \"sampath@123\" }").log().all()
        .filter(sessionFilter).when().post("/rest/auth/1/session").then().log().all().assertThat().statusCode(200).extract().response().asString();

        JsonPath jp = new JsonPath(response);
        String sessionId = jp.get("session.value");

//        String createResponse = given().header("Content-Type", "application/json").log().all().
//                body("{ \n" +
//                        "    \"fields\": {\n" +
//                        "            \"project\":  {\n" +
//                        "                \"key\": \"RA\"\n" +
//                        "            },\n" +
//                        "             \"summary\": \"Automation Ticket\",\n" +
//                        "              \"description\": \"descriptionhgghg\",\n" +
//                        "               \"issuetype\": {\n" +
//                        "                \"name\": \"Bug\"\n" +
//                        "            }\n" +
//                        "       }\n" +
//                        "}").filter(sessionFilter).when().post("/rest/api/2/issue").then().log().all().extract().response().asString();
//
//        JsonPath jp1 = new JsonPath(createResponse);
//        String id = jp1.get("key");
//        System.out.println("MIC TEST"+id);

        String response1 = given().header("Content-Type", "application/json").filter(sessionFilter).pathParam("key", "RA-17").body("{\n" +
                "    \"body\": \"THIS IS VEX\",\n" +
                "    \"visibility\": {\n" +
                "        \"type\": \"role\",\n" +
                "        \"value\": \"Administrators\"\n" +
                "    }\n" +
                "}").log().all().when().post("rest/api/2/issue/{key}/comment").then().log().all().assertThat().statusCode(201).extract().response().asString();


        JsonPath jp1 = new JsonPath(response1);
        String id = jp1.get("id");

        given().filter(sessionFilter).header("X-Atlassian-Token","no-check").header("Content-Type","multipart/form-data").pathParam("key","RA-17").multiPart("file",new File("/Users/sampathkumar/Desktop/AutomationRepo/RestAssured/src/test/java/org/example/Attachment/attachment.txt")).multiPart(new File("/Users/sampathkumar/Desktop/Screenshot 2022-09-23 at 1.31.01 PM.png")).log().all().when().post("rest/api/2/issue/{key}/attachments")
                .then().log().all().assertThat().statusCode(200);

        String getComment = given().filter(sessionFilter).pathParam("key","RA-17").queryParam("fields","comment").log().all().when().get("/rest/api/2/issue/{key}").then().log().all().extract().response().asString();
        JsonPath getCommentJp = new JsonPath(getComment);
        int commentSize = getCommentJp.get("fields.comment.comments.size()");
        System.out.println("fuck"+commentSize);
        for(int i=0;i<commentSize;i++){
            if(getCommentJp.get("fields.comment.comments["+i+"].id").equals(id))
                System.out.println("COMMENT IS PRESENT"+getCommentJp.get("fields.comment.comments["+i+"].body"));
        }

    }
}
