package exercicios;

import java.util.Scanner;

//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
public class exercicio02for {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeros, pares = 0, impares = 0;
		
		for (int i = 0; i < 10; i++) {
		    System.out.print("Digite 10 números de entrada: ");
		    numeros = leia.nextInt();
		    
		    if (numeros % 2 == 0) {
		    	pares++;
		    }
		    else {
		    	impares++;
		    }
		}
		System.out.println(pares + " são pares.");
		System.out.println(impares + " são impares.");
		leia.close();
	}

}
