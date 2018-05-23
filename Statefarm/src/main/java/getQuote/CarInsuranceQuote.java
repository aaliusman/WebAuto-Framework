package getQuote;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;

public class CarInsuranceQuote extends  CommonAPI{



    public void carQuote() throws InterruptedException {

        enterText("//input[@id='quote-main-zip-code-input']", "19047");
        clickOnElement("//button[@id='quote-main-zip-code-button']");
        enterTextById("first_name", "Unhtg");
        enterTextById("last_name", "Gftmaq");
        enterTextById("street1", "800 trenton rd");
        enterTextById("street2", "230");
        enterTextById("date_of_birth", "09081987");
        enterTextById("effectiveDate", "05232018");
        Thread.sleep(3456);
        clickWebElement("btnContinue");
//        vehicleInfo();
//        vehiclePurpose();
        //findout how to fix it
       // clickOnElement("//button[@type='button']");
        //clickByXpath("//td[@class='ui-datepicker-current-day focus-day']/a/span[2]");
    //closePopUpWindow("//body[@id='P1']", "//button[@class='sfCancelButton']");
    }
    public void vehicleInfo() throws InterruptedException {

        Thread.sleep(3421);
        clickByXpath("//div[@class='row-fluid add-module-controls v2']/div/a");
        selectOptionByVisibleText("//div[@id='year0']/div[2]/select", "2018");
        selectOptionByVisibleText("//div[@id='make0']/div[2]/select", "LAND ROVER");
        selectOptionByVisibleText("//div[@id='model0']/div[2]/select", "RANGE ROVER SPORT");
        selectOptionByVisibleText("//div[@id='bodyStyle0']/div[2]/select", "HSE AWD 4D DSL");
        clickByXpath("//div[@class='span5']/button");
    }

    public void vehiclePurpose(){

        clickByXpath("//div[@class='add-module-inline']/div/div/div[2]/div[2]/div/label/input");
        enterText("//div[@id='purchaseDate0']/div[2]/input", "03042018");
        clickByXpath("//div[@class='span5']/div/label[3]");
        clickByXpath("//div[@id='antiTheftDevice0']/div[2]/div/label[2]/input");
        clickByXpath("//div[@id='isEnrolledInDSS0']/div[2]/div/label[2]/input");
        clickWebElement("btnContinue");
    }
}
