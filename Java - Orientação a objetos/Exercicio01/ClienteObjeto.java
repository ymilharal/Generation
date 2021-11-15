package Exercicio01;

import java.util.Scanner;

public class ClienteObjeto {
	public static void main(String[] args) {
		Cliente numero1 = new Cliente();
		Scanner leia = new Scanner(System.in);
		
		int comanda = 0;
		
		while (comanda < 2) {
		
		System.out.print("Olá, qual o seu nome? ");
		numero1.nome = leia.nextLine();
		
		numero1.atendimento();
		numero1.verProdutos();
		numero1.comprar();
		numero1.pagar();
		
		
		comanda++;
	}
	}
}