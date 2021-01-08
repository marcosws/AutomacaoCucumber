package com.github.marcosws.context;

import com.github.marcosws.core.DriverFactory;
import com.github.marcosws.core.DriverFactory.Browser;
import com.github.marcosws.core.LogTest;

public class Agenda {
	
	LogTest logTest = new LogTest();
	
	public void iniciarAgenda() {
		DriverFactory.setNavigator(Browser.IE);
		DriverFactory.getDriver().manage().window().maximize();
		DriverFactory.getDriver().get("http://localhost:8080/AgendaMS/");
		logTest.LogInfo("Iniciou a AgendaMS");
	}

	public void finalizarAgenda() {
		DriverFactory.killDriver();
		logTest.LogInfo("Finalizou a AgendaMS");
	}
	
	
	
}
