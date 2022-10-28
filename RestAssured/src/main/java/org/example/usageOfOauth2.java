package org.example;

import io.restassured.path.json.JsonPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class usageOfOauth2 {


    @Test
    public void oauth() {

//        WebDriver driver = new ChromeDriver();
//        driver.get("https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php");
        String url="https://rahulshettyacademy.com/getCourse.php?code=4%2F0ARtbsJpaUSde61roOCxfomeeW3H8iWzIYGSKNkFKQSr1Wwd-8W3RjBAhTD3P_AIO_oIOMA&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=none";
        String spliting[] = url.split("code=");
        String codes[] = spliting[1].split("&");
        String code = codes[0];
        System.out.println("VEX IS " + codes[0]);
        String response = given().urlEncodingEnabled(false).queryParams("code", code).queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                .queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
                .queryParams("grant_type", "authorization_code")
                .queryParams("state", "verifyfjdss")
                .queryParams("session_state", "ff4a89d1f7011eb34eef8cf02ce4353316d9744b..7eb8")
                .queryParam("scope", "email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email")
                .queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
                .when().log().all()
                .post("https://www.googleapis.com/oauth2/v4/token").asString();

        System.out.println("CODE RESPONSE IS" + response);

        JsonPath jsonPath = new JsonPath(response);

        String accessToken = jsonPath.getString("access_token");

        System.out.println(accessToken);


        String apiResponse = given().contentType("application/json").queryParam("access_token", accessToken).when()
                .get("https://rahulshettyacademy.com/getCourse.php").asString();

        System.out.println("RESPONSE" + apiResponse);



    }

    }


