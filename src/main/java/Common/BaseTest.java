package Common;

import PropertiesManager.PropertiesManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    protected static WebDriver webDriver;
    protected static WebDriverWait webDriverWait;
    protected PropertiesManager propertiesManager = new PropertiesManager();
    protected DataFaker dataFaker = new DataFaker();

    protected void WebApplicationInit(){
        System.setProperty("webdriver.chrome.driver", "src/chrome/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(PropertiesManager.getPropertiesValue("URL"));
        webDriverWait = new WebDriverWait(webDriver, 20);
    }

    protected static void WebApplicationClose(){
        webDriver.quit();
    }
}



