package rest;

import io.restassured.response.Response;
import org.apache.poi.util.SystemOutLogger;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.*;

import static io.restassured.RestAssured.*;

public class AllEmployeeRestServices {

        @Test
    public void callAllEmployeeResources() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
            System.out.println("Status line: "+statusLine);
        int statusCode = response.getStatusCode();
            System.out.println(statusCode);
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void badCallAllEmployeeResources() {
        Response response = null;
        int statusCode = 0;
        try {
            response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources809898");
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        Assert.assertEquals(statusCode, 404);
    }

//        @Test
    public void serveErrorCallAllEmployeeResources() {
        Response response = null;
        int statusCode = 0;
        try {
            response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources").then().statusCode(500).extract().response();
            statusCode = response.getStatusCode();
        } catch (Exception ex) {
        }
        Assert.assertEquals(statusCode, 501);
    }

}