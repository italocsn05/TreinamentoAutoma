package Web.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListadeFuncionalidadePage {
    public ListadeFuncionalidadePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'Formulário')]")
    private WebElement btnFormulario;

    @FindBy(xpath = "//a[contains(text(),'Criar Usuários')]")
    private WebElement btnCriarUsuario;

    public WebElement getBtnFormulario() {
        return btnFormulario;
    }

    public WebElement getBtnCriarUsuario() {
        return btnCriarUsuario;
    }
}
