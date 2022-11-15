package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.RoofStackPojo;
import testData.testData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class roofStackStepDefination {

    //*****************     apıGetTest        ******************************

    @Given("go to desired url")
    public void go_to_desired_url() {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users";
        Response response=given().when().get(url);
        response.prettyPrint();

    }
    @When("show and print contact list")
    public void show_and_print_contact_list() {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users";
        Response response=given().when().get(url);

    }
    @Then("status code should be {int}")
    public void status_code_should_be(Integer int1) {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users";
        Response response=given().when().get(url);
        assertEquals(response.getStatusCode(),200);
        response.prettyPrint();



    }

    //**************  apıGetByIdTest    *************************
    @Given("call user from url with id")
    public void call_user_from_url_with_id() {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users/c4f6c088-f91b-494e-b7f0-a08f48df3180";

        RoofStackPojo expectedDataPojo=new RoofStackPojo("c4f6c088-f91b-494e-b7f0-a08f48df3180","doejj","jane","doe",true);


        Response response=given().when().get(url);
        response.prettyPrint();



    }
    @When("check user")
    public void check_user() {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users/c4f6c088-f91b-494e-b7f0-a08f48df3180";

        RoofStackPojo expectedDataPojo=new RoofStackPojo("c4f6c088-f91b-494e-b7f0-a08f48df3180","doejj","jane","doe",true);


        Response response=given().when().get(url);
        response.prettyPrint();

        HashMap<String,String> actualDataMap=response.as(HashMap.class);
        System.out.println(actualDataMap);


        Assert.assertEquals(expectedDataPojo.getId(), actualDataMap.get("id"));
        assertEquals(expectedDataPojo.getFirstName(),actualDataMap.get("firstName"));
        assertEquals(expectedDataPojo.getLastName(),actualDataMap.get("lastName"));
        assertEquals(expectedDataPojo.getUsername(),actualDataMap.get("username"));
        assertEquals(expectedDataPojo.getActive(),true);

    }
    @Then("check the statüs code")
    public void check_the_statüs_code() {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users/c4f6c088-f91b-494e-b7f0-a08f48df3180";

        RoofStackPojo expectedDataPojo=new RoofStackPojo("c4f6c088-f91b-494e-b7f0-a08f48df3180","doejj","jane","doe",true);


        Response response=given().when().get(url);
        response.prettyPrint();

        HashMap<String,String> actualDataMap=response.as(HashMap.class);

        assertEquals(response.getStatusCode(),200);


    }





    //**************** apıPostTest ************************

    @Given("goes to the desired url and pulls the user information with map")
    public void goesToTheDesiredUrlAndPullsTheUserInformationWithMap() {

        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users";

        RoofStackPojo expectedDataPojo=new RoofStackPojo("c4f6c088-f91b-494e-b7f0-a08f48df3180","sa12ads56","berlek","karlek",true);

        Response response= given().contentType(ContentType.JSON).body(expectedDataPojo).when().post(url);
        response.prettyPrint();
        String actualData="c4f6c088-f91b-494e-b7f0-a08f48df3180";
        JsonPath json =response.jsonPath();
        String userId=json.getString("userId");
        assertEquals(actualData,userId);

    }

    @When("status code should be {int}ok")
    public void statusCodeShouldBeOk(int arg0) {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users";

        RoofStackPojo expectedDataPojo=new RoofStackPojo("c4f6c088-f91b-494e-b7f0-a08f48df3180","sa12ads56","berlek","karlek",true);

        Response response= given().contentType(ContentType.JSON).body(expectedDataPojo).when().post(url);
        assertEquals(response.getStatusCode(),200);
    }




    //***********    apıDelTest   *******************


    @Given("goes to url with id")
    public void goes_to_url_with_id() {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users/c4f6c088-f91b-494e-b7f0-a08f48df3180";

        Response response= given().contentType(ContentType.JSON).when().delete(url);
        response.prettyPrint();



    }
    @Then("deletes the user and checks the status code")
    public void deletes_the_user_and_checks_the_status_code() {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users/c4f6c088-f91b-494e-b7f0-a08f48df3180";

        Response response= given().contentType(ContentType.JSON).when().delete(url);

        response.body().toString().isEmpty();

        response.then().assertThat().statusCode(200);


    }



    //***************   apıPatchTest       ***************************

    @Given("goes to user activity url")
    public void goes_to_user_activity_url() {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users/c4f6c088-f91b-494e-b7f0-a08f48df3180/activity";

        testData testData=new testData();
        List<Boolean> actualData=testData.expectedDataWithAllCasesList(true);
        Response response=given().when().contentType(ContentType.JSON).body(actualData).patch(url);

    }
    @Then("updates user activity")
    public void updates_user_activity() {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users/c4f6c088-f91b-494e-b7f0-a08f48df3180/activity";

        testData testData=new testData();
        List<Boolean> actualData=testData.expectedDataWithAllCasesList(true);
        Response response=given().when().contentType(ContentType.JSON).body(actualData).patch(url);


    }
    @Then("check the status code")
    public void check_the_status_code() {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users/c4f6c088-f91b-494e-b7f0-a08f48df3180/activity";

        testData testData=new testData();
        List<Boolean> actualData=testData.expectedDataWithAllCasesList(true);
        Response response=given().when().contentType(ContentType.JSON).body(actualData).patch(url);
        assertEquals(response.getStatusCode(),200);
        response.prettyPrint();


    }


    //*************            apıPutTest        ****************************************

    @Given("reaches the user by id")
    public void reaches_the_user_by_id() {

        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users/c4f6c088-f91b-494e-b7f0-a08f48df3180";
        testData expectedData=new testData();
        Map<String,String> expectedDataMap= expectedData.expectedDataWithAllCasess("askana","paskana");
        Response response= given().when().contentType(ContentType.JSON).body(expectedDataMap).when().put(url);


    }
    @When("It assigns the information it brings with the map to the user.")
    public void ıt_assigns_the_information_it_brings_with_the_map_to_the_user() {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users/c4f6c088-f91b-494e-b7f0-a08f48df3180";
        testData expectedData=new testData();
        Map<String,String> expectedDataMap= expectedData.expectedDataWithAllCasess("askana","paskana");
        Response response= given().when().contentType(ContentType.JSON).body(expectedDataMap).when().put(url);
        String actualData="c4f6c088-f91b-494e-b7f0-a08f48df3180";
        response.prettyPrint();
        JsonPath json=response.jsonPath();
        String userId=json.getString("userId");
        assertEquals(actualData,userId);


    }
    @Then("check the status codee")
    public void check_the_status_codee() {
        String url="https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users/c4f6c088-f91b-494e-b7f0-a08f48df3180";
        testData expectedData=new testData();
        Map<String,String> expectedDataMap= expectedData.expectedDataWithAllCasess("askana","paskana");
        Response response= given().when().contentType(ContentType.JSON).body(expectedDataMap).when().put(url);
        assertEquals(response.getStatusCode(),200);


    }
}
