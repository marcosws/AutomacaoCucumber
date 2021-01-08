#language: pt

@global @login
Funcionalidade: realizar o login na AgendaMS

	Contexto: possibilidade de acessar a agenda
		Dado que usuário possa acessar a tela de login da agenda

	@positivo
	Esquema do Cenário: realizar login na agenda informando usuário e senha válidos
		Quando informar o usuario <usuario>
		E inserir uma senha <senha>
		E clicar bo botão entrar
		Então permitir acesso validando o tipo de <conta> de usuario na tela home
	
	Exemplos:
		| usuario     | senha     | conta            |
		| "admin"     | "admin"   | "Administrativa" |
		| "nor"       | "nor"     | "Normal"         |
		
	@negativo
	Esquema do Cenário: realizar login na agenda omitindo usuário e senha.
		Quando informar o usuario <usuario>
		E inserir uma senha <senha>
		E clicar bo botão entrar
		Então negar acesso validando a mensagem <mensagem> apresentada
		
	Exemplos:
		| usuario     | senha     | mensagem                      |
		| ""          | "adm"     | "Digite o login de Usuário!"  |
		| "adm"       | ""        | "Digite a senha de Usuário!"  |
		
	@negativo
	Esquema do Cenário: realizar login na agenda informando usuário e senha inválidos.
		Quando informar o usuario <usuario>
		E inserir uma senha <senha>
		E clicar bo botão entrar
		Então negar acesso validando a mensagem <mensagem> na pagina
		
	Exemplos:
		| usuario     | senha     | mensagem                      |
		| "adm"       | "a123"    | "Senha inválida!"             |
		| "user"      | "user"    | "Usuário inesistente!"        |
		