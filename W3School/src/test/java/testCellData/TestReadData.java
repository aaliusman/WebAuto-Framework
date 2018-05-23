package testCellData;

import org.testng.annotations.Test;
import reporting.TestLogger;
import tableData.ReadDataFromTable;

public class TestReadData extends ReadDataFromTable {

    @Test
    public void read(){
        TestLogger.log(getClass().getSimpleName() + ": "+ convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        readData();
    }
}
