package com.github.marcosws.pages;

import com.github.marcosws.core.BasePage;
import com.github.marcosws.core.DriverFactory;

public class CadastroPage extends BasePage {
	
	public CadastroPage() {
		this.setDriver(DriverFactory.getDriver());
		this.setHighLight(true);
	}
	
	public String recuperarTitulo() {
		return this.getTitle();
	}
	
	public void digitarNome(String nome) {
		this.editElement(Attribute.id, "nome", nome);
	}
	
	public void digitarLogin(String login) {
		this.editElement(Attribute.id, "login", login);
	}
	
	public void digitarSenha(String senha) {
		this.editElement(Attribute.id, "senha", senha);
	}
	
	public void digitarConfirmarSenha(String confirmarSenha) {
		this.editElement(Attribute.id, "confsenha", confirmarSenha);
	}
	
	public void clicarCadastrar() {
		this.clickElement(Attribute.id, "cadastrar");
	}

	public String validarCadastro() {
		return this.getTextElement(Attribute.xpath, "/html/body/div/div[2]/div/p");
	}
	
	public void clicarLogar() {
		this.clickElement(Attribute.id, "logar");
	}
	
	public String validarMensagemCaixaDialogo() {
		return this.dialogBox(true);
	}
	
}
