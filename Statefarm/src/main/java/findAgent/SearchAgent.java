package findAgent;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class SearchAgent extends CommonAPI{

    @FindBy(xpath = "//div[@id='promo1-container']/div[2]/div/ul/li[4]/a")
    public WebElement clickAgents;

    @FindBy(id = "qam-agent-zip-code-input")
    public WebElement enterZipCode;

    @FindBy(id = "distance")
    public WebElement selectDistance;

    @FindBy(id = "products")
    public WebElement selectProduct;

    @FindBy(id = "search")
    public WebElement clickSearch;

    @FindBy(id = "locationListlistArea")
    public WebElement agnetName;

    @FindBy(tagName = "body")
    public WebElement getAgentName;

    public void searchAgent(){
        clickAgents.click();
    }
    public void zipcode(){
        enterZipCode.sendKeys("19047", Keys.ENTER);
    }
    public void pickDistance(){
        Select select = new Select(selectDistance);
        select.selectByIndex(3);
    }
    public void pickProduct(){
        Select select = new Select(selectProduct);
        select.selectByValue("200");
        select.selectByVisibleText("Auto");
    }
    public void clickSearchButton(){

        clickSearch.click();
    }

    public void verifyAgentName(){
        System.out.println(agnetName.getText());
        String agent_Name = getAgentName.getText();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(agent_Name.contains("Jeffrey T Hughes"), "Can't find Jeffrey");
        softAssert.assertTrue(agent_Name.contains("Andrew Reeder"), "Can't find Andrew");
        softAssert.assertTrue(agent_Name.contains("Kevin Seese"), "Can't find Kevin");
        Assert.assertTrue(agent_Name.contains("Steve Leist"), "Can't find Steve");
        softAssert.assertAll();
    }

    public void findAutoInsuAgent(){
        searchAgent();
        zipcode();
        pickDistance();
        pickProduct();
        clickSearchButton();
        verifyAgentName();
    }
}
