package exercicios;

import java.util.Scanner;

/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
public class exercicio03while {

	public static void main(String[] args) {
		
		var leia = new Scanner(System.in);
		int idade = 0, totalMenos = 0, totalMais = 0;
		
		while (idade !=-99) {
			
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			
			if (idade < 21) {
				totalMenos++;
			}
			else if (idade > 50) {
				totalMais++;
			}
		}
		System.out.println("O total de pessoas menores de 21 anos é: " + totalMenos);
		System.out.println("O total de pessoas maiores de 50 anos é: " + totalMais);
		leia.close();
	}

}
