#language: pt

@global @home
Funcionalidade: realizar o acesso a tela Home na AgendaMS

	Cenário: possibilidade de acessar a tela Home na agenda
		Dado que usuário possa acessar a tela de login da agenda
		Quando informar o usuario "admin"
		E inserir uma senha "admin"
		E clicar bo botão entrar
		Então verificar o acesso a tela home
		E validar os textos na tela
