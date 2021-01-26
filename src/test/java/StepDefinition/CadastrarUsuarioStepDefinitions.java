package StepDefinition;

import Web.Funcionalidade.CadastroUsuarioFuncionalidade;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CadastrarUsuarioStepDefinitions {
    private CadastroUsuarioFuncionalidade cadastroUsuarioFuncionalidade;

    public CadastrarUsuarioStepDefinitions() {
        this.cadastroUsuarioFuncionalidade = new CadastroUsuarioFuncionalidade();
    }

    @Dado("eu tenha acessado a página inicial do produto")
    public void euTenhaAcessadoAPáginaInicialDoProduto() {
        this.cadastroUsuarioFuncionalidade.acessaListaFuncionalidades();
    }

    @E("navegado até a página de criar um novo usuário")
    public void navegadoAtéAPáginaDeCriarUmNovoUsuário() {
        this.cadastroUsuarioFuncionalidade.acessaFormulario();
    }

    @Quando("eu preencher todo o formulário confirmar a criação do usuário")
    public void euPreencherTodoOFormulárioConfirmarACriaçãoDoUsuário() {
        this.cadastroUsuarioFuncionalidade.preencheFormulario();
    }

    @Então("visualizo a mensagem de sucesso e as informações do usuário")
    public void visualizoAMensagemDeSucessoEAsInformaçõesDoUsuário() {
        this.cadastroUsuarioFuncionalidade.validaCriacaoUsuario();
    }
}
