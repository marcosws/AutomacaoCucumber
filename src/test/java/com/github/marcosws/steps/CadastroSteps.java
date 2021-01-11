package com.github.marcosws.steps;

import org.junit.Assert;

import com.github.marcosws.context.Agenda;
import com.github.marcosws.pages.CadastroPage;
import com.github.marcosws.pages.HomePage;
import com.github.marcosws.pages.LoginPage;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CadastroSteps {
	
	CadastroPage cadastro = new CadastroPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	Agenda agenda = new Agenda();

	@E("acessar a tela de cadastro")
	public void acessar_a_ela_de_cadastro() {
		Assert.assertEquals("Agenda MS :: Nova Conta", cadastro.recuperarTitulo());
	}
	
	@Quando("quando eu digitar o nome {string}")
	public void quando_eu_digitar_o_nome(String nome) {
		cadastro.digitarNome(nome);
	}

	@Quando("digitar o login {string}")
	public void digitar_o_login(String login) {
		cadastro.digitarLogin(login);
	}

	@Quando("digitar a senha {string}")
	public void digitar_a_senha(String senha) {
		cadastro.digitarSenha(senha);
	}

	@Quando("confirmar a senha {string}")
	public void confirmar_a_senha(String confirmarSenha) {
		cadastro.digitarConfirmarSenha(confirmarSenha);
	}

	@Quando("clicar em Cadastrar")
	public void clicar_em_cadastrar() {
		cadastro.clicarCadastrar();
	}

	@Então("permitir o cadastro validando a mensagem {string}")
	public void permitir_o_cadastro_validando_a_mensagem(String mensagem) {
		Assert.assertEquals("Validando a mensagem do cadastro", mensagem, cadastro.validarCadastro());
	}
	
	@E("acessando a tela de login atraves do botão logar")
	public void acessando_a_tela_de_login_atraves_do_botao_logar() {
		cadastro.clicarLogar();
	}

	@E("realizando o login informando o login {string} e senha {string} cadastrados")
	public void realizando_o_login_informando_o_login_e_senha_cadastrados(String login, String senha){
		Assert.assertEquals("Validando a tela Inicio", "Agenda MS :: Inicio", loginPage.recuperarTitulo());
		loginPage.digitarLogin(login);
		loginPage.digitarSenha(senha);
		loginPage.clicarEntrar();
		Assert.assertEquals("Validando a tela Home", "Agenda MS :: Home", homePage.recuperarTitulo());
		agenda.finalizarAgenda();
	}

	@Então("negar o cadastro validando a mensagem {string}")
	public void negar_o_cadastro_validando_a_mensagem(String mensagem) {
		Assert.assertEquals("Validando a mensagem do cadastro", mensagem, cadastro.validarMensagemCaixaDialogo());
		agenda.finalizarAgenda();
	}


	
	

}
