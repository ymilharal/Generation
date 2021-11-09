package exercicios;

import java.util.Scanner;

/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor*/
public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		double custoFabrica, distribuidor, custoConsumidor, imposto;

		System.out.println("Digite o valor de fabrica do veículo: ");
	     custoFabrica = leia.nextDouble();
		//percentual sempre divide por 100
		distribuidor = custoFabrica + (custoFabrica*28/100);
		imposto = custoFabrica + (custoFabrica*45/100);
		custoConsumidor = custoFabrica + distribuidor + imposto;

		System.out.println("O valor do veículo final será de: " + custoConsumidor);
		leia.close();
	}
}
