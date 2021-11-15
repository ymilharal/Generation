package Exercicio05;
/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

import java.util.Scanner;

public class Patinete {
	Scanner leia = new Scanner(System.in);
	
	String nome;
	String modelo[][] = {{"Xiaomi M365", "Two Dogs TD-Monster", "Atrio(infantil)"},{"Patinete Eletrico que atinge a velocidade de até 30km/h.",
		"Patinete Eletrico e com assento que atinge a velocidade de até 45km/h.", "Patine não eletrico com duas rodas que suporta até 50kg."}};
	int tentativa = 0;
	
	public void boasvindas() {
		System.out.println("Qual o seu nome usuario? ");
		nome = leia.nextLine();
		System.out.println("Olá " + nome + ", seja bem vindo ao mundo dos patinetes!");
	}
	public void introdução() {
		System.out.println("Trotineta ou Patinete é um meio de transporte, que é constituído por duas rodas em série, "
		+ "\nque sustentam uma base onde o usuário apoia os pés, guiando-o através de um guidão que se eleva até a altura da cintura.");
	}
	public void modelos() {
		System.out.println("\n===Conheça alguns modelos===");
		System.out.println("[" + modelo[0][0] + "] " + " = " + modelo [1][0]);
		System.out.println("[" + modelo[0][1] + " ] " + " = " + modelo [1][1]);
		System.out.println("[" + modelo[0][2] + "] " + " = " + modelo [1][2]);
	}
	public void valores() {
		System.out.println("O " + modelo[0][0] + " custa cerca de : R$2.500,00");
		System.out.println("O " + modelo[0][1] + " custa cerca de : R$8.000,00");
		System.out.println("O " + modelo[0][2] + " custa cerca de : R$209,90");
	}
	public void despedida() {
		System.out.println("\n\nObrigada por acessar nossa pagina " + nome + " espero que tenhamos ajudado na sua pesquisa!\n");
	}
}
