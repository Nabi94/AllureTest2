package org.example;
import io.qameta.allure.*;
import org.example.POJO.myAPIPojo;
import io.restassured.response.Response;
import org.example.baseURI.myLocalAPI;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

@Epic("Login Functionality")
@Feature("Valid Login")

public class GetMehtod extends myLocalAPI {

    @Test(description = "Check login with valid credentials")
    @Severity(SeverityLevel.CRITICAL)
    @Story("User logs in with correct credentials")
    @Description("User should be able to login with valid username and password")
    public void getmyAPI (){
        localAPI.pathParams("pp1","posts","pp2",2);

        Response response = given().spec(localAPI)
                .when()
                .get("/{pp1}/{pp2}");

                response
                        .then().log().all();
        myAPIPojo myAPIPojo = response.as(myAPIPojo.class);
        assertEquals(myAPIPojo.getBody(),"sasd");
    }
}
