package Exercicio06;

import java.util.Scanner;

/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.*/
public class Conta {
	Scanner leia = new Scanner(System.in);
	double saldo = 680.00, saldoDevedor = -250.00, credito = 5.000;
	int usuario, visualização = 0;
	String nome;

	public void entrada() {
		System.out.print("===Banco BNB=== \nDigite seu nome: ");
		nome = leia.next();
		System.out.println("Olá " + nome + " em qual conta você gostaria de entrar? (1 ou 2)");
		usuario = leia.nextInt();
	}
	public void valores() {
		if (usuario == 1) {
		System.out.println("A conta possui saldo devedor de: R$" + saldoDevedor);
		System.out.println("Favor pagar pendencias ou seu cartão será cancelado.");
		System.out.println("\nObrigada por utilizar nossos sistemas, até mais!");
	}
	else if (usuario == 2) {
		System.out.println("A conta possui saldo de R$" + saldo);
		System.out.println("Seu limite de credito é de: R$" + credito);
		System.out.println("\nObrigada por utilizar nossos sistemas, até mais!");
	}
	else {
		System.out.println("Opção invalida tente novamente.");
	}
}
}
