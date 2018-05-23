package excelReader;

import base.CommonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class EnterZipCode extends CommonAPI {

    @FindBy(xpath = "//input[@id='quote-main-zip-code-input']")
    public WebElement enterZipCode;

    @FindBy(xpath = "//button[@id='quote-main-zip-code-button']")
    public WebElement clickGetQuote;

    @FindBy(how = How.CSS, using ="#quote-main-zip-code-input")
    public static WebElement enterZipCode2;

    @FindBy(how = How.CSS, using ="#quote-main-zip-code-button")
    public static WebElement clickGetQuote2;

    public static WebElement ZipCode() {
        return enterZipCode2;
    }

    public static WebElement clickQuoteButton() {
        return clickGetQuote2;
    }

    public void searchFor(String value){
        ZipCode().sendKeys(value);
    }
    public void submitSearchButton(){
        clickQuoteButton().click();
    }
    public void clearInput(){
        ZipCode().clear();
    }
    public void navigateBack(WebDriver driver1){ driver1.navigate().back();}


    public void searchItemsAndSubmitButton(WebDriver driver1) throws IOException, InterruptedException {
        ZipToBeEntered itemsToBeSearched = new ZipToBeEntered();
        String [] value = itemsToBeSearched.getDataFromExcelFile();
        for(int i=1; i<value.length; i++) {
            searchFor(value[i]);
            submitSearchButton();
            Thread.sleep(3490);
            navigateBack(driver1);
            clearInput();
        }
    }

    public void handlePopUp(WebDriver driver1) {
        String homePage = driver1.getWindowHandle();
        System.out.println(homePage);
    }

    public void enterZip(WebDriver driver1) throws InterruptedException {
        List<String> zipCode = zip();
        for (String st : zipCode) {
            enterZipCode.sendKeys(st);
            clickGetQuote.click();
            Thread.sleep(3400);
//            HandlPopUP handlPopUP = PageFactory.initElements(driver1, HandlPopUP.class);
//            handlPopUP.handlePopUpWindow(driver1);
           driver1.navigate().back();

        }
    }

    public List<String> zip() {
        List<String> list = new LinkedList<String>();
        list.add("19047");
        list.add("19020");
        list.add("19120");
        list.add("19130");
        return list;
    }

}
