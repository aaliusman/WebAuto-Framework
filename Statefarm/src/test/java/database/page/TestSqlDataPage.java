package database.page;

import findAgent.SearchAgent;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSqlDataPage extends SqlDataPage{
    //Test Methods
    @Test
    public void testDataBase() throws InterruptedException, Exception {
        SearchAgent searchAgent = PageFactory.initElements(driver, SearchAgent.class);
        SqlDataPage sdp = new SqlDataPage();
        //insert data
        sdp.insertData();
        //read data
      String expected =  sdp.readData().get(28);
        searchAgent.findAutoInsuAgent();
       String actual = sdp.getAgentName();
        System.out.println("actual:"+actual);
        System.out.println("expected:"+expected);

        //Assert
//        Assert.assertEquals(actual, expected);

    }
}
