package apitesting.endpoints;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ListTagEndpoint {
    public ListTagEndpoint() {
        RestAssured.baseURI = "https://dummyapi.io/data/v1/";
    }

    String endpoint;
    String appId = "63a804408eb0cb069b57e43a";
    Response response;

    public void setGetEndpoint() {
        endpoint = "/tag";
    }

    public void sendGetTagRequest(){
        response = RestAssured
                .given()
                .header("app-id",appId)
                .when()
                .get(endpoint);
    }

    public void sendGetTagRequestWithoutAppId(){
        response = RestAssured
                .given()
                .when()
                .get(endpoint);
    }

    public void validateStatusCode(int statusCode) {
        response.then().statusCode(statusCode);
    }
}
