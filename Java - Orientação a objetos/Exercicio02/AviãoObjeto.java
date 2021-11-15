package Exercicio02;

import java.util.Scanner;

public class AviãoObjeto {

	public static void main(String[] args) {
		Avião viagem = new Avião();
		Scanner leia = new Scanner(System.in);

		while (viagem.passagem < 2) {
			System.out.println("Digite seu nome: ");
			viagem.nome = leia.nextLine();
			System.out.println("Bem vindo(a) " + viagem.nome + " a Companhia Aerobrasileirissimo! ");

			viagem.destinos();
			viagem.partida();
			viagem.informações();

			viagem.passagem++;
		}
		leia.close();
	}
}