package dropDownMenu;

import home.MenuList;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestDropMenu extends MenuList{

   // @Test
//    public void dropDownMenu(){
//        List<String> txtList= getTextList("//div[@ class ='nav-search-scope nav-sprite']/select");
//        for(String st:txtList){
//            System.out.println(st);
//        }

      @Test
    public  void dropMenuList(){
        readMenuList();
      }
    }

