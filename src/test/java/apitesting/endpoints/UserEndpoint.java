package apitesting.endpoints;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import apitesting.utils.ApiBaseTest;
import org.json.JSONObject;
import org.junit.Assert;

public class UserEndpoint extends ApiBaseTest {
    // setup RestAssured.baseURI
    public UserEndpoint() {
        setup();
    }

    String userId;
    String endpoint;
    String appId = "63a804408eb0cb069b57e43a";
    Response response;
    JSONObject payload = new JSONObject();

    // untuk endpoint yang pakai userId
    public void setUserIdEndPoint(String userId) {
        endpoint = "/user/" + userId;
    }

    // Get user by id
    public void sendGetUserByIdRequest() {
        response = RestAssured
                .given()
                .header("app-id", appId)
                .when()
                .get(endpoint);
    }
    public void sendGetUserByIdRequestWihoutAppId() {
        response = RestAssured
                .given()
                .when()
                .get(endpoint);
    }

    // Input Payload
    public void setFirstName(String firstName) {
        payload.put("firstName", firstName);
    }
    public void setLastName(String lastName) {
        payload.put("lastName", lastName);
    }
    public void setEmail(String email) {
        payload.put("email", email);
    }

    // Create
    public void setCreateUserEndpoint() {
        endpoint = "/user/create/";
    }
    public void sendCreateUserRequest() {
        response = RestAssured
                .given()
                .header("app-id", appId)
                .contentType("application/json")
                .body(payload.toString())
                .when()
                .post(endpoint);
    }
    public void createRandomUser() {
        payload.put("firstName", "John");
        payload.put("lastName", "Doe");
        payload.put("email", "john" + System.currentTimeMillis() + "@gmail.com");
        response = RestAssured
                .given()
                .header("app-id", appId)
                .contentType("application/json")
                .body(payload.toString())
                .when()
                .post("/user/create");
        userId = response.jsonPath().getString("id");
    }

    // Update
    public void sendUpdateUserRequest() {
        response = RestAssured
                .given()
                .header("app-id", appId)
                .contentType("application/json")
                .body(payload.toString())
                .when()
                .put(endpoint);
    }

    // Delete
    public void sendDeleteUserRequest() {
        response = RestAssured
                .given()
                .header("app-id", appId)
                .when()
                .delete("/user/" + userId);
    }

    public void sendWrongDeleteUserRequest(String userId) {
        response = RestAssured
                .given()
                .header("app-id", appId)
                .when()
                .delete("/user/" + userId);
    }

    public void validateStatusCode(int statusCode) {
        response.then().statusCode(statusCode);
    }

    public void validateEmailNotUpdated() {
        String email = response.jsonPath().getString("email");
        Assert.assertEquals(
                "iniuntukgetuserbyiddanupdate@gmail.com",email
        );
    }
}
