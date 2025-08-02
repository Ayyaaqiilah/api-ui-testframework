package tests;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.UserRequests;

public class UserPositiveTests {

    UserRequests user = new UserRequests();

    @Test
    public void testGetUserListSuccess() {
        Response response = user.getUserList();
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.getBody().asString().contains("data"));
    }

    @Test
    public void testGetUserByIdSuccess() {
        String userId = user.getUserList().jsonPath().getString("data[0].id");

        Response response = user.getUserById(userId);
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getString("id"), userId);
    }
}
