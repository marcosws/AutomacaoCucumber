package com.github.marcosws.steps;

import org.junit.Assert;

import com.github.marcosws.context.Agenda;
import com.github.marcosws.pages.HomePage;
import com.github.marcosws.pages.LoginPage;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	
	Agenda agenda = null;
	LoginPage login = null;
	HomePage home = null;

	@Dado("que usuário possa acessar a tela de login da agenda")
	public void que_usuário_possa_acessar_a_tela_de_login_da_agenda() {
		agenda = new Agenda();
		agenda.iniciarAgenda();
		login = new LoginPage();
		Assert.assertEquals("Validando a tela Login (Inicio)", "Agenda MS :: Inicio", login.recuperarTitulo());
	}

	@Quando("informar o usuario {string}")
	public void informar_o_usuario(String usuario) {
		login.digitarLogin(usuario);
	}

	@E("inserir uma senha {string}")
	public void inserir_uma_senha(String senha) {
		login.digitarSenha(senha);
	}

	@E("clicar bo botão entrar")
	public void clicar_no_botao_entrar() {
		login.clicarEntrar();
	}

	@Então("permitir acesso validando o tipo de {string} de usuario na tela home")
	public void validar_o_tipo_de_de_usuario_na_tela_home(String tipoUsuario) {
		home = new HomePage();
		Assert.assertEquals("Validando a tela Home", "Agenda MS :: Home", home.recuperarTitulo());
		Assert.assertEquals("Validando o tipo de Usuario na Tela Home.", tipoUsuario, home.validarTipoUsuario());
		home.clicarLogout();
		agenda.finalizarAgenda();
	}

	@Então("negar acesso validando a mensagem {string} apresentada")
	public void validar_a_mensagem_apresentada(String mensagem) {
		Assert.assertEquals("Validando a caixa de dialogo na pagina.", mensagem, login.validarMensagemCaixaDialogo());
		agenda.finalizarAgenda();
	}
	
	@Então("negar acesso validando a mensagem {string} na pagina")
	public void negar_acesso_validando_a_mensagem_na_pagina(String mensagem) {
		Assert.assertEquals("Validando a caixa de dialogo na pagina.", mensagem, login.validarMensagemPagina());
		login.clicarVoltar();
	    agenda.finalizarAgenda();
	}
	
	@E("clicar em Criar uma conta")
	public void clicar_em_criar_uma_conta() {
		login.clicarCriarUmaConta();
	}

}
