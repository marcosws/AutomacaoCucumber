#language: pt

@global @cadastro
Funcionalidade: realizar o cadastro de usuário na AgendaMS

	Contexto: possibilidade de acessar a agenda
		Dado que usuário possa acessar a tela de login da agenda
		E clicar em Criar uma conta
		E acessar a tela de cadastro
		
	@positivo
	Esquema do Cenário: realizar o cadastro do usuário na agenda com sucesso
		Quando quando eu digitar o nome <nome>
		E digitar o login <login>
		E digitar a senha <senha>
		E confirmar a senha <confirmarSenha>
		E clicar em Cadastrar
		Então permitir o cadastro validando a mensagem <mensagem>
		E acessando a tela de login atraves do botão logar
		E realizando o login informando o login <login> e senha <senha> cadastrados

	Exemplos:
		| nome                | login      | senha      | confirmarSenha | mensagem                          |
		| "Nigel Mansell"     | "mansell"  | "mansell"  | "mansell"      | "Cadastro realizado com Sucesso!" |
		
	
	@negativo
	Esquema do Cenário: realizar o cadastro do usuário na agenda omitindo os campos obrigatórios
		Quando quando eu digitar o nome <nome>
		E digitar o login <login>
		E digitar a senha <senha>
		E confirmar a senha <confirmarSenha>
		E clicar em Cadastrar
		Então negar o cadastro validando a mensagem <mensagem>

	Exemplos:
		| nome                | login      | senha      | confirmarSenha | mensagem                          |
		| ""                  | "prost"    | "prost"    | "prost"        | "Nome de usuário é Obrigatório!"  |
		| "Alan Prost"        | ""         | "prost"    | "prost"        | "Login de usuário é Obrigatório!" |
		| "Alan Prost"        | "prost"    | ""         | "prost"        | "Senha de usuário é Obrigatório!" |
		| "Alan Prost"        | "prost"    | "prost"    | ""             | "Confirme sua Senha!"             |
		| "Alan Prost"        | "prost"    | "prost"    | "prsss"        | "Senha não Confere!"              |
		
		
		
		
		
		