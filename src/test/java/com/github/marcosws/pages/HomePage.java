package com.github.marcosws.pages;

import com.github.marcosws.core.BasePage;
import com.github.marcosws.core.DriverFactory;

public class HomePage extends BasePage{
	
	public HomePage() {
		this.setDriver(DriverFactory.getDriver());
		this.setHighLight(true);
	}

	public String recuperarTitulo() {
		return this.getTitle();
	}
	
	public void clicarLogout() {
		this.clickElement(Attribute.xpath, "/html/body/div/div[1]/div/a[1]");
	}
	
	
	public String validarTipoUsuario() {
		return this.getTextElement(Attribute.xpath, "/html/body/div/div[2]/div/h4[4]").replace("Tipo de Conta: ", "");
	}
	
}
