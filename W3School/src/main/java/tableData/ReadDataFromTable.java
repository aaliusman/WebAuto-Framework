package tableData;

import base.CommonAPI;
import reporting.TestLogger;

import java.util.List;

public class ReadDataFromTable extends CommonAPI {

    public void readData() {
        TestLogger.log(getClass().getSimpleName() + ": "+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = getTextFromWebElements("//div[@class = 'w3-responsive']/table/tbody/tr[2]/td");
        // String cellData = getTextByXpath("//div[@class = 'w3-responsive']/table/tbody/tr[4]/td[2]");
        for (String st : list) {

            System.out.println(st);
        }
    }
}