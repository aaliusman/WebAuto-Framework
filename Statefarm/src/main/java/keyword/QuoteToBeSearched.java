package keyword;

import utility.DataReader;

import java.io.IOException;

public class QuoteToBeSearched {

    DataReader dr = new DataReader();
    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"/data/file1.xls";
        String [] data = dr.fileReader2(path,0);
        return data;
    }

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        String path = System.getProperty("user.dir")+"/data/file3.xls";
        String [] data = dr.fileReader2(path,0);
        return data;
    }
}
