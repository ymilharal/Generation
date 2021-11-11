package exercicios;

import java.util.Scanner;

/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
public class exercicio05dowhile {

	public static void main(String[] args) {
		
		var leia = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite aqui o número: ");
			numero = leia.nextInt();
			
			soma = soma + numero;
		} while(numero != 0);
		System.out.println("A soma dos números é: " + soma);
		leia.close();
	}

}
