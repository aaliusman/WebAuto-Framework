package google.sheet.page;

import google.api.GoogleSheetReader;
import home.SearchSelenium;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class TestGoogleSheetPage extends GoogleSheetPage{

    @Test
    public void testGoogleSheetData() throws IOException, GeneralSecurityException {
        //create an object
        GoogleSheetPage gsp = new GoogleSheetPage();
        SearchSelenium ss = PageFactory.initElements(driver, SearchSelenium.class);

        //search items
        ss.searchBookName();
        //expected result
        List<List<Object>> expectedResult = GoogleSheetReader.getGoogleSheetValue();

        for(List<Object> st: expectedResult){
            System.out.println(st);
        }
        // actual result

//         gsp.getBookName();

        //assert here
//        String actualResult = gsp.bookName();
//        Assert.assertEquals(actualResult, expectedResult.get(2));

    }

}


