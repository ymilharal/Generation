package exercicios;

import java.util.Scanner;
/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)*/
public class exercicio04while {

	public static void main(String[] args) {
		var leia = new Scanner(System.in);
		
		int pessoas = 0, idade, sexo, sentimento, calmo=0, agressivoF = 0, calmoF = 0, nervosoF = 0,
			agressivoM = 0, calmoM = 0, nervosoM = 0, agressivoO = 0, calmoO = 0, nervosoO = 0,
			nervosoQ = 0, calmoJ = 0; //f=feminino, m= masculino, o = outros, q = quarenta, j= jovens.
		
		while (pessoas < 4) {
			System.out.println("Infome sua idade:  ");
			idade = leia.nextInt();
			
			System.out.println("Infome seu sexo: (1- Feminino, 2- Masculino, 3- Outros)  ");
			sexo = leia.nextInt();
			
			System.out.println("Escolha: 1- Se for uma pessoa calma. 2- Se for uma pessoa nervosa. "
					+ "3- Se for uma pessoa agressiva.");
			sentimento = leia.nextInt();
			
			if (sentimento == 1) {
				calmo++;
			}
			if (sexo == 1 && sentimento == 2) {
				nervosoF++;
			}
			if (sexo == 2 && sentimento == 3) {
				agressivoM++;
			}
			if (sexo == 3 && sentimento == 1) {
				calmoO++;
			}
			if (idade > 40 && sentimento == 2) {
				nervosoQ++;
			}
			if (idade < 18 && sentimento == 1) {
				calmoJ++;
			}
			pessoas++;
			
		}
		System.out.println("O número de pessoas calmas é: " + calmo);
		System.out.println("O número de mulheres nervosas é: " + nervosoF);
		System.out.println("O número de homens agressivos é: " + agressivoM);
		System.out.println("O número de outros calmos é: " + calmoO);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + nervosoQ);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: " + calmoJ);
		
		leia.close();
	}

}
