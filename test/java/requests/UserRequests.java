package requests;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static utils.Config.*;

public class UserRequests {

    public Response getUserList() {
        return RestAssured
                .given()
                .header("app-id", APP_ID)
                .baseUri(BASE_URL)
                .when()
                .get("user");
    }

    public Response getUserById(String id) {
        return RestAssured
                .given()
                .header("app-id", APP_ID)
                .baseUri(BASE_URL)
                .when()
                .get("user/" + id);
    }

    public Response getUserByInvalidId(String id) {
        return getUserById(id);
    }
}
