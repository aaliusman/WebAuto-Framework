package agentByZipCode;

import findAgent.SearchAgent;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindAgent extends SearchAgent {

    @Test
    public void printAgentName(){
        SearchAgent searchAgent = PageFactory.initElements(driver, SearchAgent.class);
        searchAgent.findAutoInsuAgent();

    }
}
