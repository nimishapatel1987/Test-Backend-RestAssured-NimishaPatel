package com.virgingames.virgingamesinfo;

import com.virgingames.constants.EndPoints;
import com.virgingames.constants.Path;
import com.virgingames.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class GetVirginGames extends TestBase {

    @Test
    public void getAllBingoRecords() {


        RestAssured.registerParser("text/plain", Parser.JSON);
        Response response = given()
                .when()
                .basePath(Path.BINGO)
                .get(EndPoints.GET_ALL_GAMESINFO);
        response.then().statusCode(200);

        response.prettyPrint();
    }
}
