package getQuote;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;

public class VehiclePurpose extends CommonAPI{

    public void vehiclePurpose(WebDriver driver1){

        clickByXpath("//div[@class='span5']/div/label/input");
        enterText("//div[@id='purchaseDate0']/div[2]", "03042018");
        clickByXpath("//div[@class='span5']/div/label[3]");
        clickWebElement("btnContinue");
    }
}
