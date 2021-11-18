package Exercicio03;

public class LojaX extends Estoque implements IEstoque {
	
	private String Docearia;

	public LojaX(String produtos, String validade, int quantidade, String docearia) {
		super(produtos, validade, quantidade);
		Docearia = docearia;
	}

	public String getDocearia() {
		return Docearia;
	}

	public void setDocearia(String docearia) {
		Docearia = docearia;
	}

	@Override
	public void contagem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void venda() {
		// TODO Auto-generated method stub		
	}	
}