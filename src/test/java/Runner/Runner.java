package Runner;

import Common.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty", "html:src/evidence/cucumber-html-report.html"},
        glue = { "StepDefinition","Configuration" },
        features = {"src/test/Feature"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@web"
)
class Runner extends BaseTest {
    @AfterClass
    public static void AfterTests(){
        if (webDriver != null){
            WebApplicationClose();
        }
    }
}
