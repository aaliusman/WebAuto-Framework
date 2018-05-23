package keyword;

import authentication.LogInPage;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import searchCourse.SearchItems;
import sun.jvm.hotspot.debugger.Page;


import javax.security.auth.login.LoginContext;
import java.io.IOException;

public class Features extends CommonAPI{


    public void signIn(WebDriver driver1){
        LogInPage logInPage = PageFactory.initElements(driver1, LogInPage.class);
        logInPage.logInToForum(driver1);
    }

    public void search(WebDriver driver1) throws InterruptedException,IOException{
        SearchItems searchPage = PageFactory.initElements(driver1, SearchItems.class);
        searchPage.searchSkills(driver1);
    }

    public void select(String featureName, WebDriver driver1)throws IOException, InterruptedException{
       switch (featureName){
           case "signIn":
               signIn(driver1);
               break;
           case "search":
               search(driver1);
               break;
           default:
               throw new InvalidArgumentException("Invalid features choice");

       }
    }

    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=0; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
