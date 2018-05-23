package pntForum;

import base.CommonAPI;
import keyword.Features;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestKeyword extends Features{

    @Test
    public void testKeyword() throws InterruptedException, IOException{
        selectFeatures(driver);
    }


}
