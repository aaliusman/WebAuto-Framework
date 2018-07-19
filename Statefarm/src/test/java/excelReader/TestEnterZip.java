package excelReader;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class TestEnterZip extends EnterZipCode {

    @Test
    public void enterZipByList() throws InterruptedException {
        EnterZipCode listzip = PageFactory.initElements(driver, EnterZipCode.class);
        listzip.enterZip(driver);
    }


//    @Test
    public void findQoutebyExcel() throws InterruptedException, IOException {
        EnterZipCode enterZipCode = PageFactory.initElements(driver, EnterZipCode.class);
        enterZipCode.searchItemsAndSubmitButton(driver);
    }

}
