package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class MenuList extends CommonAPI{


    public void readMenuList(){
        List<String> menuList= getTextList("//div[@ class ='nav-search-scope nav-sprite']/select");
        for(String st:menuList){
            System.out.println(st);
        }
        List<String> expectedMenu = menuList;
        Assert.assertEquals(menuList, expectedMenu);
    }

}
