import io.qameta.allure.*;
import io.restassured.response.Response;
import org.example.POJO.myAPIPojo;
import org.example.baseURI.myLocalAPI;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Epic("Post Method")
@Feature("Valid Post Method")

public class PostMethod extends myLocalAPI {

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Post test newUser")
    @Description("yeni post method ile yoxlanish")
    public  void postTest(){

        localAPI.pathParams("pp1","posts");
        myAPIPojo myAPIPojo = new myAPIPojo();
        myAPIPojo.setBody("Nabi");
        myAPIPojo.setId(22);
        myAPIPojo.setTitle("necesen");
        myAPIPojo.setUserId(2223);

        Response response = given()
                .spec(localAPI)
                .when()
                .contentType("application/json")
                .body(myAPIPojo)
                .post("/{pp1}");


    }




}
