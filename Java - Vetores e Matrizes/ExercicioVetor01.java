package exercicios;

import java.util.Scanner;

//1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
public class ExercicioVetor01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double maiorPontuacao = 0.0;
		double [] pontuacao = new double [5]; //vetor com 5 posições
		int i;
		System.out.println("===PONTUAÇÃO===");
		//Adicionando valores ao vetor
		for (i = 0; i <= 4; i++) {
			System.out.print("Insira a " + (i + 1) + " pontuação: ");
			pontuacao[i] = entrada.nextDouble();
			
			if (pontuacao[i] > maiorPontuacao) {
				maiorPontuacao = pontuacao[i];
			}
		}
		//Imprimindo valores do vetor
		for (i = 0; i <= 4; i++) {
			System.out.print(pontuacao [i] + " | ");
		}
		System.out.println("\nA maior pontuação é de: " + maiorPontuacao);
		
		entrada.close();
	}
	}