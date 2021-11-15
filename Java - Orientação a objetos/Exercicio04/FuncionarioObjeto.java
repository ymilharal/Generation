package Exercicio04;

public class FuncionarioObjeto {

	public static void main(String[] args) {
		
		Funcionario contrato = new Funcionario();
		
		while (contrato.tentativa < 2) {
		contrato.contato();
		contrato.selecionar();
		contrato.salario();
		System.out.println(" ");
		
		contrato.tentativa++;
	}
	}
}
