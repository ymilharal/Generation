package exercicios;
/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

public class ExerciciosVetor02 {

	public static void main(String[] args) {
		int [] dado = new int [10];
		int lancamento = 10, maiorPontuacao = 0, totalMp = 0;
		double media = 0.0, soma = 0.0;
		
		System.out.println("===Sorteando Valores===");
		
		for (int i = 0; i < lancamento; i++) {
		dado[i] = ((int)(1 + Math.random()*6));
		}
		for (int i = 0; i < lancamento; i++) {
			soma = soma + dado[i];
			
			System.out.println("O " + (i+1) + "º lançamento foi: " + dado[i]);
			
			if (dado[i] > maiorPontuacao) {
				maiorPontuacao = dado[i];
				totalMp++;
		}
		}
			media = soma / lancamento;
			System.out.println("\nO maior valor apareceu: " + totalMp + "x");
			System.out.println("A média dos lançamentos foi de: " + media);
			System.out.println("O maior valor foi de: " + maiorPontuacao);
	}
}