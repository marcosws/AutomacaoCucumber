#language: pt

@global @login
Funcionalidade: realizar o login na AgendaMS

	Contexto: possibilidade de acessar a agenda
		Dado que usuário possa acessar a tela de login da agenda

		
	Esquema do Cenário: realizar login no sistema com usuários válidos
		Quando informar um <usuario> válido
		E inserir uma <senha> válida
		Então o sistema deve permitir acesso a agenda
		E validar o tipo de <conta> de usuario na tela home
	
	Exemplos:
		| usuario     | senha     | conta            |
		| "admin"     | "admin"   | "Adminstrativa"  |
		| "leandro"   | "leandro" | "Normal"         |
		
	
	Esquema do Cenário: realizar login no sistema com usuários inválidos
		Quando informar um <usuario>
		E inserir uma <senha>
		Então o sistema deve negar acesso a agenda
		E validar a <mensagem> apresentada
		
	Exemplos:
		| usuario     | senha     | mensagem                      |
		| ""          | "admin"   | "Digite o login de Usuário!"  |
		| "admin"     | ""        | "Digite a senha de Usuário!"  |
		| "admin"     | "a123"    | "Senha inválida!"             |

		