package exercicios;

import java.util.Scanner;

//3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
public class ExerciciosMatriz03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double [][] n1 = new double [4][6];
		double [][] n2 = new double [4][6];
		double [][] m1 = new double [4][6];
		double [][] m2 = new double [4][6];
		
		//Conseguindo os valores das matrizes
		for(int l = 0; l <4; l++){
			for(int c = 0; c < 6; c++){
				System.out.print("Insira os números de n1: ");
				n1[l][c] = entrada.nextDouble(); 
				System.out.print("Insira os números de n2: ");
				n2[l][c] = entrada.nextDouble();

				m1[l][c] = n1 [l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
	}

}			//Imprimindo valores
		System.out.println("Matriz M1: ");
		for(int l = 0; l< 4; l++){
			for(int c= 0; c <6; c++){
				System.out.print(m1[l][c] + " | ");
}		
			System.out.println(" ");
	}
		System.out.println("\nMatriz M2: ");
		for(int l = 0; l< 4; l++){
			for(int c= 0; c <6; c++){
				System.out.print(m2[l][c] + " | ");
			}
		}
	}
}
