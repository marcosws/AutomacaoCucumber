package com.github.marcosws.pages;

import com.github.marcosws.core.BasePage;
import com.github.marcosws.core.DriverFactory;

public class LoginPage extends BasePage{
	
	public LoginPage() {
		this.setDriver(DriverFactory.getDriver());
		this.setHighLight(true);
	}
	
	public void digitarLogin(String login) {
		this.editElement(Attribute.id, "login", login);
	}
	
	public void digitarSenha(String senha) {
		this.editElement(Attribute.id, "senha", senha);
	}
	
	public void clicarEntrar() {
		this.clickElement(Attribute.id, "entrar");
	}
	
	public void clicarCriarUmaConta() {
		this.clickElement(Attribute.xpath, "/html/body/div/div[1]/div/a");
	}
	
	public void clicarVoltar() { //erro de acesso
		this.ckeckedElement(Attribute.id, "voltar");
	}
	
	public String validarMensagemCaixaDialogo() {
		return this.dialogBox(true);
	}

	public String validarMensagemPagina() { //erro de acesso
		return this.getTextElement(Attribute.xpath, "/html/body/div/div[2]/div/p");
	}
	
}
