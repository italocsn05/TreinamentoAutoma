package Configuration;

import Common.BaseTest;
import io.cucumber.java.*;
import io.cucumber.messages.Messages;

public class Hooks extends BaseTest {

    @Before(value = "@web")
    public void beforeScenarioWeb(){
        System.out.println("Execução Hooks Web");
        WebApplicationInit();
    }

    @After(value = "@web")
    public void afterScenarioWeb() {
        System.out.println("Fim execução Hooks Web");
        WebApplicationClose();
    }
}
