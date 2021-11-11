package exercicios;
//1- Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5. (FOR)

public class exercicio01for {

	public static void main(String[] args) {
		
		for(int n = 1000; n <= 1999; n++) { //n = numero
			if (n % 11 == 5) {
				System.out.println(n);
			}
		}

	}

}
