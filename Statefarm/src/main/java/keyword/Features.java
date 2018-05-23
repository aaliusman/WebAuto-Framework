package keyword;

import base.CommonAPI;
import getQuote.CarInsuranceQuote;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features extends CommonAPI{


    public void enterCode() throws InterruptedException {
        CarInsuranceQuote carInsuranceQuote = new CarInsuranceQuote();
        carInsuranceQuote.carQuote();

    }

    public void addVehicle() throws InterruptedException {
        CarInsuranceQuote carIns = new CarInsuranceQuote();
        carIns.vehicleInfo();
    }

    public void mileageInfo(){
        CarInsuranceQuote car= new CarInsuranceQuote();
        car.vehiclePurpose();
    }


    public void select(String featureName)throws IOException, InterruptedException{

        if ("enterCode".equals(featureName)) {
            enterCode();

        } else if ("addVehicle".equals(featureName)) {
            addVehicle();

        } else if ("mileageInfo".equals(featureName)) {
            mileageInfo();

        } else {
            throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures()throws IOException, InterruptedException{
        QuoteToBeSearched itemsToBeSearched = new QuoteToBeSearched();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=0; i<testSteps.length; i++) {
            select(testSteps[i]);
        }
    }
}
