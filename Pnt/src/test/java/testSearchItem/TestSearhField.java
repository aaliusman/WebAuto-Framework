package testSearchItem;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import searchCourse.SearchItems;

public class TestSearhField extends SearchItems {

    @Test
    public void testSearch(){
        SearchItems searchItems = PageFactory.initElements(driver, SearchItems.class);
        searchItems.searchSkills(driver);
    }
}
