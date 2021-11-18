package Exercicio03;

import java.util.Scanner;

public class LojaY extends Estoque implements IEstoque {
	
	private String maquiagem, funcionario;
	
	Scanner leia = new Scanner(System.in);

	public LojaY(String produtos, String validade, int quantidade, String maquiagem) {
		super(produtos, validade, quantidade);
		this.maquiagem = maquiagem;
	}

	public String getMaquiagem() {
		return maquiagem;
	}

	public void setMaquiagem(String maquiagem) {
		this.maquiagem = maquiagem;
	}
	public void apresentação() {
		System.out.println("Entre com seu nome: ");
		funcionario = leia.nextLine();
		System.out.println("Olá " + funcionario + ", seja muito bem vindo ao nosso novo sistema de controle de Estoque Billyrub,\n"
				+ "espero que desfrute de uma experiencia agradavel, se houver bugs favor mandar um email\n estamos sempre buscando pela melhoria!");
	}
	@Override
	public void contagem() {
		System.out.println("===Guia de produtos===");
		System.out.println("Avaliação do estoque referente ao mês atual: " + getQuantidade());
		
	}

	@Override
	public void venda() {
		// TODO Auto-generated method stub		
	}	
}