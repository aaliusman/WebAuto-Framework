package database.page;

import base.CommonAPI;
import com.google.common.collect.Multimaps;
import database.ConnectDB;

import findAgent.SearchAgent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SqlDataPage extends CommonAPI {


    // helpers methods to navigate to different page

    //insert expected result into database
    public void insertData() {
        ConnectDB connectDB = new ConnectDB();
        connectDB.insertDataFromStringToMySql("Andrew Reeder", "Expected_Data", "Expected_Result");
    }

    // read the expected the result
    public List<String> readData() throws Exception {
        ConnectDB connectDB = new ConnectDB();
       List<String> expectedResult = connectDB.readDataBase("Expected_Data", "Expected_Result");
       return  expectedResult;
    }

    // get the agen name from page
    public String getAgentName(){
        String result = getTextByXpath("//b[@id='agentMicrositeUrl_A']");
        return  result;
        }

    }
