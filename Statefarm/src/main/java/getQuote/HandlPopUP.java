//package getQuote;
//
//import base.CommonAPI;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class HandlPopUP extends CommonAPI{
//
//    @FindBy(xpath = ".//div[@class='sfBody']")
//    public WebElement feedbackPopUpWindowWebElement;
//    @FindBy(xpath = "//button[@class='sfCancelButton']")
//    public WebElement xFeedbackPopUpWindowCloseWebElement;
//
//    public WebElement getFeedbackPopUpWindowWebElement() {
//        return feedbackPopUpWindowWebElement;
//    }
//
//    public void setFeedbackPopUpWindowWebElement(WebElement feedbackPopUpWindowWebElement) {
//        this.feedbackPopUpWindowWebElement = feedbackPopUpWindowWebElement;
//    }
//
//    public WebElement getFeedbackPopUpWindowCloseWebElement() {
//        return xFeedbackPopUpWindowCloseWebElement;
//    }
//
//    public void setFeedbackPopUpWindowCloseWebElement(WebElement feedbackPopUpWindowCloseWebElement) {
//        this.xFeedbackPopUpWindowCloseWebElement = feedbackPopUpWindowCloseWebElement;
//    }
//
//    public boolean isFeedbackWindowDisplayed(String locator){
//        boolean value = CommonAPI.isPopupWindowDisplayed(locator);
//        return  value;
//    }
//
//    public void closePopUpWindow(){
//        setFeedbackPopUpWindowCloseWebElement(xFeedbackPopUpWindowCloseWebElement);
//        getFeedbackPopUpWindowCloseWebElement().click();
//    }
//
//    public void handlePopUpWindow(){
//        if(isFeedbackWindowDisplayed( ".//div[@class='sfBody']")){
//            closePopUpWindow();
//        }
//    }
//}
