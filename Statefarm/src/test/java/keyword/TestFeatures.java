package keyword;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestFeatures extends Features {
    @Test
    public void testKeyword() throws IOException, InterruptedException {
        selectFeatures();
    }
}
