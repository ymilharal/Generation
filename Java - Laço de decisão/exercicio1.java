package exercicios;

import java.util.Scanner;

//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
public class exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Insira o primeiro numero: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Insira o segundo numero: ");
		numero2 = entrada.nextInt();
		
		System.out.println("Insira o terceiro numero: ");
		numero3 = entrada.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println(numero1 + " É o maior numero.");
		}
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println(numero2 + " É o maior numero.");
		}
		else {
			System.out.println(numero3 + " É o maior numero.");
		}
		
		entrada.close();
		

	}

}
