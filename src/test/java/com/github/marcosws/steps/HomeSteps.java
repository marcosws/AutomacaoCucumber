package com.github.marcosws.steps;

import org.junit.Assert;

import com.github.marcosws.pages.HomePage;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class HomeSteps {
	
	HomePage homePage = new HomePage();

	@Então("verificar o acesso a tela home")
	public void verificar_o_acesso_a_tela_home() {
		Assert.assertEquals("Validando a tela Home", "Agenda MS :: Home", homePage.recuperarTitulo());
	}
	
	@E("validar os textos na tela")
	public void validar_os_textos_na_tela() {
	
	}

}
