package exercicios;

import java.util.Scanner;

/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class exercicio06dowhile {

	public static void main(String[] args) {
		var leia = new Scanner(System.in);
		
		int numeros, soma = 0, media, contador = -1;
		
		do {
			System.out.println("Digite aqui um número inteiro de entrada: ");
			numeros = leia.nextInt();
			
			if (numeros % 3 == 0) {
				soma = soma + numeros;
				contador++; 
			}
		} while(numeros != 0);
		media = soma / contador;
		
		System.out.println("A média dos números multiplos de 3 é: " + media);
		leia.close();
	}			
}
