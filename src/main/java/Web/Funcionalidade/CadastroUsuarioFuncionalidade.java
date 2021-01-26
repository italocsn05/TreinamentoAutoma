package Web.Funcionalidade;

import Common.BaseTest;
import Web.Page.FormularioPage;
import Web.Page.HomePage;
import Web.Page.ListadeFuncionalidadePage;
import Web.Page.UsuarioPage;
import com.github.javafaker.Faker;
import com.github.javafaker.Internet;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class CadastroUsuarioFuncionalidade extends BaseTest {
    private HomePage homePage;
    private ListadeFuncionalidadePage listadeFuncionalidadePage;
    private FormularioPage formularioPage;
    private UsuarioPage usuarioPage;

    public CadastroUsuarioFuncionalidade() {
        this.homePage = new HomePage(webDriver);
        this.listadeFuncionalidadePage = new ListadeFuncionalidadePage(webDriver);
        this.formularioPage = new FormularioPage(webDriver);
        this.usuarioPage = new UsuarioPage(webDriver);
    }

    public void acessaListaFuncionalidades(){
        webDriverWait.until(ExpectedConditions.visibilityOf(this.homePage.getBtnComecar()));
        this.homePage.getBtnComecar().click();
    }

    public void acessaFormulario(){
        webDriverWait.until(ExpectedConditions.visibilityOf(this.listadeFuncionalidadePage.getBtnFormulario()));
        this.listadeFuncionalidadePage.getBtnFormulario().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(this.listadeFuncionalidadePage.getBtnCriarUsuario()));
        this.listadeFuncionalidadePage.getBtnCriarUsuario().click();
    }

    public void preencheFormulario(){
        this.formularioPage.getInputNome().sendKeys(dataFaker.getFirstName());
        this.formularioPage.getInputSobrenome().sendKeys(dataFaker.getLastName());
        this.formularioPage.getInputEmail().sendKeys(dataFaker.getEmail());
        this.formularioPage.getInputEndereco().sendKeys(dataFaker.getAdress());
        this.formularioPage.getInputProfissao().sendKeys(dataFaker.getJob());
        this.formularioPage.getInputGenero().sendKeys("Masculino");
        this.formularioPage.getInputIdade().sendKeys("22");
        this.formularioPage.getInputCriar().click();
    }

    public void validaCriacaoUsuario(){
        webDriverWait.until(ExpectedConditions.visibilityOf(this.usuarioPage.getNotice()));
        this.usuarioPage.getNotice().isDisplayed();
    }
}
