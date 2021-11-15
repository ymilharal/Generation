package Exercicio03;

import java.util.Scanner;

public class ProdutoEletronico {
	//atributos
	Scanner leia = new Scanner(System.in);
	
	double preço[] = {150.00, 1550.00, 450.00}, preçoTotal;
	String nome;
	String produto[][]= {{"Balança de cozinha", "Notebook ultrafino", "GoPro Hero9"},{"Suporta até 10 kg Funciona com 2 pilhas e Display em led.", 
		"Possui tela full HD antirreflexo de 15,6", "Videos com resolução de até 5k, a prova d'agua e possui sitema de estabilização."}};
	int produtoEscolha, lugarEscolha, vezes = 0;

	
	public void produtos() {
		System.out.println("===Guia de produtos=== \n1)[" + produto[0][0] + "]: " + produto[1][0]);
		System.out.println("2)[" + produto[0][1] + "]: " + produto[1][1]);
		System.out.println("3)[" + produto[0][2] + "]: " + produto[1][2]);
		produtoEscolha = leia.nextInt();
	}
	public void frete() {
		System.out.println("===Escolha sua região=== \n1)[São paulo]= gratuito.");
		System.out.println("2)[Rio de Janeiro]= gratuito");
		System.out.println("3)[Demais regiões]= R$30,00]");
		lugarEscolha = leia.nextInt();
	}
	public void preços() {
		switch (produtoEscolha) {
	    case 1 :
	      System.out.println("O valor da " + produto[0][0] + " é de: R$" + preço[0]);
	      break;
	    case 2:
	      System.out.println("O valor do " + produto[0][1] + " é de: R$" + preço[1]);
	      break;
	    case 3:
	      System.out.println("O valor da " + produto[0][2] + " é de: R$" + preço[2]);
	      break;
	    default:
	      System.out.println("Opção invalida tente novamente...");
	  }
	}
	public void calculando() {
		if (produtoEscolha == 1 && lugarEscolha == 1) {
			preçoTotal = preço[0] + 0;
			System.out.println("O valor total com frete será de: R$" + preçoTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if (produtoEscolha == 1 && lugarEscolha == 2) {
			preçoTotal = preço[0] + 0;
			System.out.println("O valor total com frete será de: R$" + preçoTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if (produtoEscolha == 1 && lugarEscolha == 3) {
			preçoTotal = preço[0] + 30;
			System.out.println("O valor total com frete será de: R$" + preçoTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if(produtoEscolha == 2 && lugarEscolha == 1) {
			preçoTotal = preço[1] + 0;
			System.out.println("O valor total com frete será de: R$" + preçoTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if(produtoEscolha == 2 && lugarEscolha == 2) {
			preçoTotal = preço[1] + 0;
			System.out.println("O valor total com frete será de: R$" + preçoTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if (produtoEscolha == 2 && lugarEscolha == 3) {
			preçoTotal = preço[1] + 30;
			System.out.println("O valor total com frete será de: R$" + preçoTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if (produtoEscolha == 3 && lugarEscolha == 1) {
			preçoTotal = preço[2] + 0;
			System.out.println("O valor total com frete será de: R$" + preçoTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if(produtoEscolha == 3 && lugarEscolha == 2) {
			preçoTotal = preço[1] + 0;
			System.out.println("O valor total com frete será de: R$" + preçoTotal);
			System.out.println("Obrigada pela compra!");
		}
		else if (produtoEscolha == 3 && lugarEscolha == 3) {
			preçoTotal = preço[2] + 30;
			System.out.println("O valor total com frete será de: R$" + preçoTotal);
			System.out.println("Obrigada pela compra!");
		}
		else {
			System.out.println("Opção invalida, tente novamente...\n");
	}
		System.out.println("\n=== Tenha uma boa tarde ===\n");
	}
}
