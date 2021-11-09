package exercicios;

import java.util.Scanner;

//2- Faça um programa que entre com três números e coloque em ordem crescente.
public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite três numeros: ");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		numero3 = entrada.nextInt();
		
		if (numero1 <= numero2 && numero2 <= numero3) {
			System.out.println("A ordem crescente: \n" + numero1 + "|" + numero2 + "|" + numero3 );
		}
		
		else if(numero1 <= numero3 && numero3 <= numero2) {
			System.out.println("A ordem crescente: \n" + numero1 + "|" + numero3 + "|" + numero2);
		}
		else if(numero2 <= numero1 && numero1 <= numero3) {
			System.out.println("A ordem crescente: \n" + numero2 + "|" + numero1 + "|" + numero3 );
	}
		else if(numero2 <= numero3 && numero3 <= numero1) {
			System.out.println("A ordem crescente: \n" + numero2 + "|" + numero3 + "|" + numero1 );
}
		else if(numero3 <= numero1 && numero1 <= numero2) {
			System.out.println("A ordem crescente: \n" + numero3 + "|" + numero1 + "|" + numero2);
		}
			else {
				System.out.println("A ordem crescente: \n" + numero3 + "|" + numero2 + "|" + numero1);
		entrada.close();

	}

}
}