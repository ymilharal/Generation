package Exercicio02;

import java.util.Scanner;

/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class Avião {
	//ATRIBUTOS
	String modelo = "ATR 42-500", cor = "rosa purpura",cidades[] = {"Piranapiacaba", "Mairiporã", "Niteroi"};
	String cidadesEscolha, nome, horarios [] = {"7:30 am", "9:30 am", "10:30"};
	int passagem = 0;
	Scanner leia = new Scanner(System.in);
	
	public void destinos() {
		System.out.println("Guia de viagens: " + "[" + cidades[0] + "] " + "[" + cidades[1] + "] "+ "[" + cidades[2] + "]");
		System.out.println("Quero ir a: ");
		cidadesEscolha = leia.nextLine();
	}
	public void partida() {
		if (cidadesEscolha.equals(cidades[0])) {
			System.out.println("O voo para " + cidades[0] + " sairá: " + horarios[0]);
			String piloto = "Jorge Clonei";
			System.out.println("O piloto é: " + piloto);
		}
		else if (cidadesEscolha.equals(cidades[1])) {
			System.out.println("O voo para " + cidades[1] + " sairá: " + horarios[1]);
			String piloto = "Marai Kerei";
			System.out.println("O piloto é: " + piloto);
		}
		else if (cidadesEscolha.equals(cidades[2])) {
			System.out.println("O voo para " + cidades[2] + " sairá: " + horarios[2]);
			String piloto = "Justin Bieber";
			System.out.println("O piloto é: " + piloto);
		}
		else {
			System.out.println("Opção invalida, tente novamente...\n");
	}
	}
	public void informações() {
		System.out.println("O modelo do avião é: " + modelo + ", da Azul e tem capacidade para 48 passageiros.");
		System.out.println("A cor do avião é: " + cor + ".");
		System.out.println("Obrigada por nos escolher, faça uma boa viagem!\n");
}
}