package exercicios;

import java.util.Scanner;

//Construa um programa em c que, tendo como dados de entrada dois pontos
//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
//que efetua tal cálculo é:

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
	double x1, x2, y1, y2;
	double p1, p2; //dois pontos
	double d;

	System.out.println("Digite o valor de X do primeiro ponto: ");
	x1 = leia.nextDouble();
	
	System.out.println("Digite o valor de Y do primeiro ponto: ");
	y1 = leia.nextDouble();
	
	System.out.println("Digite o valor de X do segundo ponto: ");
	x2 = leia.nextDouble();
	
	System.out.println("Digite o valor de Y do segundo ponto: ");
	y2 = leia.nextDouble();

	p1 = Math.pow((x2-x1), 2.0);
	p2 = Math.pow((y2-y1), 2.0);
	d = Math.sqrt(p1 + p2);

	System.out.println("A distancia entre os dois pontos é: " + d);
	leia.close();
}
}
