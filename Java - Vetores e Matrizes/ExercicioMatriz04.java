package exercicios;

import java.util.Scanner;

/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
public class ExercicioMatriz04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] val = new int[3][3];
		int somaVal = 0, somaDiag = 0, soma = 0;
		
		for(int l =0; l < val.length; l++) {
			for (int c = 0; c < val[l].length; c++) {
				System.out.printf("Digite os valores para"
						+ " preencher a matriz na posição -->: [%d] [%d] --> ", l,c);
				val[l][c] = scan.nextInt();
				somaVal += val[l][c];
				if(l == c) {
					somaDiag += val[l][c];
				}
			}
		}
		soma = val[0][0] + val[1][1] + val[2][2];
		
		System.out.println("A soma da Matriz: " + somaVal);
		System.out.println("A soma da Diagonal: " + somaDiag);
		
		System.out.println("Verificação: " + soma);
		scan.close();
	}

}
