package JavacinaProjeto;

import java.util.Scanner;

public class Login {

		private String nome, user;
		private int senha;
		String aNome, aUser;
		int aSenha;
		
		Scanner leia = new Scanner(System.in);
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public int getSenha() {
			return senha;
		}
		public void setSenha(int senha) {
			this.senha = senha;
		}
		
		public void cadastro () {
			
			System.out.println("\t\t\t\t\t===Cadastre-se===\n");
			
			System.out.print("Entre com seu nome completo: ");
			 aNome = leia.nextLine();
			setNome(aNome);
			
			System.out.print("Crie um nome de usuario: ");
			 aUser = leia.next();
			setUser(aUser);
			
			System.out.print("Crie uma senha(Somente números): ");
			 aSenha = leia.nextInt();
			setSenha(aSenha);
			
			System.out.println("\nOba " + aNome + "! Seu cadastro foi efetuada com sucesso, faça login para começar.\n");
		}
		public void login () {
			for ( int i = 0; i <3; i++ ) {
			System.out.println("\t\t\t\t\t===Efetue o Login===\n");
			System.out.print("Digite seu nome de usuario: ");
			aUser = leia.next();
			
			System.out.print("Digite sua senha: ");
			aSenha = leia.nextInt();
			
			if (getUser().equals(aUser) && getSenha() == (aSenha)) {
				System.out.println("\n\t\t\t\t\t===Acesso autorizado===\n");
				System.out.println(aNome + " você já pode começar a usar o Javacina. Seja Bem vindo(a)!");
				break;
			}
			else {
				System.out.println("\t\t\t\t\t===Acesso Negado===\n");
				System.out.println("Login ou senha invalidos, você tem mais " + (2-i) + " tentativas.\n");
			}
		}
	}

	}