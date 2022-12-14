package jsonUtil;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonUtil {
    private static ObjectMapper mapper;

    static {
        mapper =new ObjectMapper();
    }
    //1.Method: Json datasını Java objesine çevirir (Se-Serilization)
    public static <T> T   convertJsonToJavaObject(String json, Class<T> cls){//Generic method
        T javaResult=null;
        try {
            javaResult = mapper.readValue(json,cls);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return javaResult;


    }

    //2.Method: Java Objesini JSON dataya çecirir

    public static String convertJavaObjectToJson(Object obj){
        String jsonResult = null;

        try {
            jsonResult= mapper.writeValueAsString(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonResult;

    }


}
