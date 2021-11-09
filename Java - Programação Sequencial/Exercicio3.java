package exercicios;

import java.util.Scanner;

//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
				
		int tempo, horas, minutos, segundos;

		System.out.println("Digite o tempo do evento na fábrica em segundos: ");
		tempo = leia.nextInt();

		horas = tempo / 3600;
		minutos = (tempo % 3600) /60;
		segundos = (tempo % 3600) %60;

		System.out.println("\nO tempo será de " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos. ");
	
		leia.close();
	}

}
