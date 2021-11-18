package Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueTeste {

	public static void main(String[] args) {

		int tipo;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Quantas maquiagens você tem? ");
		tipo = leia.nextInt();
		
		ArrayList<LojaY> Loja1 = new ArrayList();
		for(int i = 0; i < tipo; i++) {
		
		String produtos, validade, maquiagem;
		int quantidade;
		
		System.out.println("\t\t\t\t\t===Entrada de produtos=== ");
		
		System.out.println("Qual a marca da maquiagem? ");
		maquiagem = leia.next();
		
		System.out.println("Qual o tipo de produto? ");
		produtos = leia.next();
		
		System.out.println("Qual a validade do produto? ");
		validade = leia.next();
		
		System.out.println("Qual a quantidade? ");
		quantidade = leia.nextInt();
		
		Loja1.add(new LojaY(produtos, validade, quantidade, maquiagem));
		}
		
		for(LojaY al : Loja1) {
			System.out.println(al);
		}
	}
}