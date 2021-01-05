package com.github.marcosws.base;

import com.github.marcosws.core.DriverFactory;
import com.github.marcosws.core.DriverFactory.Browser;

public class Agenda {
	
	public void iniciarAgenda() {
		
		DriverFactory.setNavigator(Browser.FIREFOX);
		DriverFactory.getDriver().manage().window().maximize();
		DriverFactory.getDriver().get("");
		
	}

	public void finalizarAgenda() {
		
		DriverFactory.killDriver();
	}
	
	
	
}
