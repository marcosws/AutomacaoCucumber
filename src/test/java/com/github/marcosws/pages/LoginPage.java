package com.github.marcosws.pages;

import com.github.marcosws.core.BasePage;

public class LoginPage extends BasePage{
	
	public void digitarLogin(String login) {
		this.editElement(Attribute.id, "login", login);
	}
	
	public void digitarSenha(String senha) {
		this.editElement(Attribute.id, "senha", senha);
	}
	
	public void clicarEntrar() {
		this.clickElement(Attribute.id, "entrar");
	}
	
	public String validarTipoUsuario() {
		return this.getTextElement(Attribute.xpath, "");
	}

}
