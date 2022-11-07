package utils.api;

import com.jayway.jsonpath.JsonPath;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.testng.annotations.Test;

import java.net.URLEncoder;

/**
 * @author Jorge A. López
 * @project SocialMediaSignUps
 * @created 11-06-2022 - 10:34 PM
 */
public class RandomPerson {

    @Test
    public static String[] getRandomNames(){
        //Host url
        String host = "https://api.namefake.com";
        Unirest.config().defaultBaseUrl(host);

        //endpoint
        String uri = "/english-united-states/male";

        HttpResponse<JsonNode> response = Unirest.get(uri)
                .asJson();

        String nameString = JsonPath.read(response.getBody().toString(),"$.name");

        String[] names = nameString.split(" ");
//        for (String name : names){
//            System.out.println(name);
//        }
        return names;
    }

}
