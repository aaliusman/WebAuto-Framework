package home;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchSelenium {

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBook;

    public void searchBookName(){
        searchBook.sendKeys("selenium books", Keys.ENTER);
    }
}
