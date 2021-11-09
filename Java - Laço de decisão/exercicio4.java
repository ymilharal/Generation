package exercicios;

import java.util.Scanner;

/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		

			if (numero % 2 == 0){
					System.out.println("O numero é par");
					double numeroRaiz = Math.sqrt(numero);
					System.out.println("A raiz quadrada será: " + numeroRaiz);
				}
			else {
					System.out.println("O numero é impar");
					double numeroPot = Math.pow(numero, 2);
					System.out.println("O resultado de " + numero + " elevado ao quadrado será: " + numeroPot);			
	}
			entrada.close();
}
}