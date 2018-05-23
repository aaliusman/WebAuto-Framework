package pntForum;

import authentication.LogInPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAuthentication extends CommonAPI {

    @Test
    public void loginAuthentication(){
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.logInToForum(driver);
    }
}
