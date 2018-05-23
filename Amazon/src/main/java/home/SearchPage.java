package home;

import base.CommonAPI;
import database.ConnectDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import search.ItemsToBeSearched;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class SearchPage extends CommonAPI{

    @FindBy(how = How.CSS, using ="#twotabsearchtextbox")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using =".nav-input")
    public static WebElement submitButtonWebElement;

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton(){
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        getSearchInputWebElement().clear();
    }

    public void searchItemsAndSubmitButton() throws IOException, InterruptedException {
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] value = itemsToBeSearched.getDataFromExcelFile();
        for(int i=1; i<value.length; i++) {
            searchFor(value[i]);
            submitSearchButton();
            Thread.sleep(3490);
            clearInput();
        }
    }

    public WebElement getSearchInputField() {
        return searchInputWebElement;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputWebElement = searchInputField;
    }

    public void searchItems()throws InterruptedException{
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }

    public static List<String> getItemValue() {
        List<String> itemslist = new LinkedList<String>();
        itemslist.add("Java Books");
        itemslist.add("selenium books");
        itemslist.add("MacBook Pro");
        itemslist.add("Sony TV");
        itemslist.add("Samsung TV");
        itemslist.add("MacBook Air");
        itemslist.add("Iphone X");
        itemslist.add("Samsung S8 edge");

        return itemslist;
    }

    public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        connectDB.insertDataFromArrayListToMySql(getItemValue(), "searchList", "items");
    }

}
