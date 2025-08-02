package tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.UserRequests;

public class UserNegativeTests {

    UserRequests user = new UserRequests();

    @Test
    public void testGetUserWithInvalidId() {
        String invalidId = "invalid123";
        Response response = user.getUserByInvalidId(invalidId);
        Assert.assertEquals(response.getStatusCode(), 400);
    }
}
