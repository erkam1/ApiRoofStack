package BaseUrls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
public class baseUrl {

    protected RequestSpecification spec;
    @Before
    public void setUp(){
        spec=new RequestSpecBuilder().setBaseUri("https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users").build();
    }


    //https://3e3d2990-3fca-4144-8b26-1538cf135a09.mock.pstmn.io/users


}
