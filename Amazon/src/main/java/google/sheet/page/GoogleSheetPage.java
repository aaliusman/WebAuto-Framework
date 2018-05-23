package google.sheet.page;

import base.CommonAPI;
import google.api.GoogleSheetReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.LinkedList;
import java.util.List;

import static google.api.GoogleSheetReader.getGoogleSheetValue;

public class GoogleSheetPage extends CommonAPI {

    //get the actual result
    public void searchItems(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("SeleniumBooks", Keys.ENTER);
    }
    //get first 5 books name
    public List<String> getBookName() {
        List<WebElement> bookElement = driver.findElements(By.xpath("//h2]@class='a-size-medium s-inline  s-access-title  a-text-normal']"));
        List<String> bookName = new LinkedList<String>();
        for (int i = 0; i < 5; i++) {
            System.out.println(bookName.add(bookElement.get(i).getText()));
        }
        return bookName;
    }
    public String bookName(){
       String book = driver.findElement(By.xpath("//h2[text() = 'Learn Selenium in 1 Day: Definitive Guide to Learn Selenium for Beginners']")).getText();
       return book;
    }
}
