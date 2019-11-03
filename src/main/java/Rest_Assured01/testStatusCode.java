package Rest_Assured01;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import javafx.beans.binding.When;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class testStatusCode {

    @Test
    public void testStatusCodes(){

      //  given()
              //  .when()
                    // .get("https://reqres.in/api/users/2")
               // .get("http://developer.marvel.com/V1/public/Characters")

     // Response response = RestAssured .get("http://gateway.marvel.com/v1/public/characters?ts=2019101901&apikey=874d437afb96472629ea17980ab974a5&hash=0d0bfd8d535eae721cb00325a9e0200d");
      //  System.out.println(response.asString());

             //   .get("http://gateway.marvel.com/v1/public/characters?ts=2019101901&apikey=874d437afb96472629ea17980ab974a5&hash=0d0bfd8d535eae721cb00325a9e0200d")



             // .then()
            //   .statusCode(200);



        given()
                .when()
                //.get("https://petstore.swagger.io/v2/store/inventory")
                .get("http://gateway.marvel.com/v1/public/characters?ts=2019101901&apikey=874d437afb96472629ea17980ab974a5&hash=0d0bfd8d535eae721cb00325a9e0200d")
                .then()
                .statusCode(200);



    }



}



