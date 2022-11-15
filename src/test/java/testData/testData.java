package testData;

import java.util.*;

public class testData {
    public Map<String,Object> expectedDataWithAllKeys(String ıd,String username, String firstName, String lastName, Boolean isActive ) {
        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("ıd",ıd);
        expectedData.put("firstName", firstName);
        expectedData.put("lastName", lastName);
        expectedData.put("username", username);
        expectedData.put("isActive",isActive);

        return expectedData;
        /*
        [
    {
        "id": "c4f6c088-f91b-494e-b7f0-a08f48df3180",
        "username": "doejj",
        "firstName": "jane",
        "lastName": "doe",
        "isActive": true
    },
    {
        "id": "c3e140a4-99db-44c2-a9ea-896904745993",
        "username": "johnthesavior",
        "firstName": "john",
        "lastName": "doe",
        "isActive": false
    }
]
         */
    }

    public List<Boolean> expectedDataWithAllCasesList(boolean isActive) {

        List<Boolean> expectedDataTwo = new ArrayList<Boolean>(Collections.singleton(isActive));
        expectedDataTwo.contains(isActive);



        return expectedDataTwo;
        /*
        {
    "userId": "c4f6c088-f91b-494e-b7f0-a08f48df3180",
    "isActive": true
}
         */


    }



    public Map<String,String> expectedDataWithAllCasess(String firstName, String lastName){
        Map<String , String> expectedData=new HashMap<>();
        expectedData.put("firstName", firstName);
        expectedData.put("lastName",lastName);

        return expectedData;
    }

}

