package Web.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Começar Automação Web')]")
    private WebElement btnComecar;

    public WebElement getBtnComecar() {
        return btnComecar;
    }
}
