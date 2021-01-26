package Web.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormularioPage {
    public FormularioPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id='user_name']")
    private WebElement inputNome;

    @FindBy(xpath = "//input[@id='user_lastname']")
    private WebElement inputSobrenome;

    @FindBy(xpath = "//input[@id='user_email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='user_address']")
    private WebElement inputEndereco;

    @FindBy(xpath = "//input[@id='user_university']")
    private WebElement inputUniversidade;

    @FindBy(xpath = "//input[@id='user_profile']")
    private WebElement inputProfissao;

    @FindBy(xpath = "//input[@id='user_gender']")
    private WebElement inputGenero;

    @FindBy(xpath = "//input[@id='user_age']")
    private WebElement inputIdade;

    @FindBy(xpath = "//input[@value=\"Criar\"]")
    private WebElement inputCriar;

    @FindBy(xpath = "//a[contains(text(),'Voltar')]")
    private WebElement btnVoltar;

    public WebElement getInputNome() {
        return inputNome;
    }

    public WebElement getInputSobrenome() {
        return inputSobrenome;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputEndereco() {
        return inputEndereco;
    }

    public WebElement getInputUniversidade() {
        return inputUniversidade;
    }

    public WebElement getInputProfissao() {
        return inputProfissao;
    }

    public WebElement getInputGenero() {
        return inputGenero;
    }

    public WebElement getInputIdade() {
        return inputIdade;
    }

    public WebElement getInputCriar() {
        return inputCriar;
    }

    public WebElement getBtnVoltar() {
        return btnVoltar;
    }
}
