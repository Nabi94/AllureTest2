package org.example.baseURI;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeSuite;

public class myLocalAPI {

        protected RequestSpecification localAPI;
        @BeforeSuite
    public void setUP(){
            localAPI = new RequestSpecBuilder()
                    .setBaseUri("http://localhost:5000/")
                    .build();
        }
}
