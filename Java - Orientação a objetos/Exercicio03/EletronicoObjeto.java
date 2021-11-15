package Exercicio03;

import java.util.Scanner;

public class EletronicoObjeto {

	public static void main(String[] args) {
		ProdutoEletronico eletro = new ProdutoEletronico();
		Scanner leia = new Scanner (System.in);
		
		while (eletro.vezes < 2) {
			System.out.print("Digite seu nome: ");
			eletro.nome = leia.nextLine();
			System.out.print("Bem vindo(a) " + eletro.nome + " a Eletromultimarcas! \n");
			
		eletro.produtos();
		eletro.preços();
		System.out.print("\n");
		eletro.frete();
		eletro.calculando();
		eletro.vezes++;

	}
		leia.close();
	}
}
