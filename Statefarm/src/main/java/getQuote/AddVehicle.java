package getQuote;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;

public class AddVehicle extends CommonAPI{


    public void vehicleInfo() throws InterruptedException {

        Thread.sleep(3421);
        clickByXpath("//div[@class='row-fluid add-module-controls v2']/div/a");
        selectOptionByVisibleText("//div[@id='year0']/div[2]/select", "2018");
        selectOptionByVisibleText("//div[@id='make0']/div[2]/select", "LAND ROVER");
        selectOptionByVisibleText("//div[@id='model0']/div[2]/select", "RANGE ROVER SPORT");
        selectOptionByVisibleText("//div[@id='bodyStyle0']/div[2]/select", "HSE AWD 4D DSL");
        clickWebElement("sfx_add-veh-step[0]_Add_btn_input");

    }
}
