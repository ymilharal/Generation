package Exercicio04;

import java.util.Scanner;

/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/
public class Funcionario {
	//atributo
		String nome;
		String horario[][] = {{"6:00am ás 14:20pm", "7:00am ás 15:20pm", "14:00pm ás 22:20pm"},{"Gerente", "Subgerente", "Atendente"}};
		double pagamento [] = {2350.00, 1600.00, 980.00}, cargo;
		int tentativa=0;
		Scanner leia = new Scanner(System.in);
		
		public void contato() {
			System.out.print("Digite seu nome: ");
			nome = leia.next();
			System.out.println("Bem vindo(a) " + nome + " a sorrindo pra valer, a Agencia de empregos mais requisitada do Brasil!");
		}
		public void selecionar() {
			System.out.println("\n===Guia de cargos e horarios===");
			System.out.println(" 1) " + horario[1][0] + " = " + horario[0][0]);
			System.out.println(" 2) " + horario[1][1] + " = " + horario[0][1]);
			System.out.println(" 3) " + horario[1][2] + " = " + horario[0][2]);
			System.out.println("Escolha o cargo desejado:");
			cargo = leia.nextDouble();
		}
		public void salario() {
			if (cargo == 1) {
				System.out.println("O salario será de: R$" + pagamento[0]);
				System.out.println("Por favor envie-nos seu curriculo para avaliação da vaga!");
			}
			else if (cargo == 2) {
				System.out.println("O salario será de: R$" + pagamento[1]);
				System.out.println("Por favor envie-nos seu curriculo para avaliação da vaga!");
			}
			else if (cargo == 3) {
				System.out.println("O salario será de: R$" + pagamento[2]);
				System.out.println("Por favor envie-nos seu curriculo para avaliação da vaga!");
			}
			else {
				System.out.println("Opção invalida, tente novamente...");
			}
		}
}
