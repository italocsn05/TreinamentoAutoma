#author: Italo Cabral
#language: pt

  Funcionalidade: Cadastrar usuários
    @web
    Cenário: Cadastrar um usuário com sucesso e validar a criação
      Dado eu tenha acessado a página inicial do produto
      E navegado até a página de criar um novo usuário
      Quando eu preencher todo o formulário confirmar a criação do usuário
      Então visualizo a mensagem de sucesso e as informações do usuário