package com.github.marcosws.steps;

import com.github.marcosws.base.Agenda;
import com.github.marcosws.pages.LoginPage;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	
	
	Agenda agenda = new Agenda();
	LoginPage loginPage = new LoginPage();
	
	@Dado("que usuário possa acessar a tela de login da agenda")
	public void que_usuario_possa_acessar_a_tela_de_login_da_agenda() {
		agenda.iniciarAgenda();
	}
	
	@Quando("informar um {string} válido")
	public void informar_um_usuario_valido(String usuario) {
		loginPage.digitarLogin(usuario);
	}
	
	@Quando("inserir uma {string} válida") 
	public void inserir_uma_leandro_válida(String senha) {
		loginPage.digitarSenha(senha);
	}
	
	@Então("o sistema deve permitir acesso a agenda")
	public void o_sistema_deve_permitir_acesso_a_agenda() {
		loginPage.clicarEntrar();
	}
	
	@E("validar o tipo de {string} de usuario na tela home")
	public void validar_o_tipo_de_conta_de_usuario_na_tela_home(String conta) {

		System.out.println("Step 5 - OK [ " + conta + " ] ");
		
	}

	
	@Quando("informar um {string}")
	public void informar_um(String string) {
	    
		System.out.println("Arg 1 [ " + string + " ] ");
		
	}

	@Quando("inserir uma {string}")
	public void inserir_uma(String string) {
	    
		System.out.println("Arg 2 [ " + string + " ] ");
		
	}

	@Então("o sistema deve negar acesso a agenda")
	public void o_sistema_deve_negar_acesso_a_agenda() {
	 

		
	}

	@Então("validar a {string} apresentada")
	public void validar_a_apresentada(String string) {
	
		System.out.println("Arg 3 [ " + string + " ] ");
	}
	

}
