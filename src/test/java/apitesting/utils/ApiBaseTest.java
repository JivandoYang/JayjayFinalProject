package apitesting.utils;

import io.restassured.RestAssured;

public class ApiBaseTest {
    public static void setup() {
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";
    }
}
