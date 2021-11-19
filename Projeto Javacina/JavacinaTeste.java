package JavacinaProjeto;

import java.util.Scanner;

public class JavacinaTeste extends JavacinaMetodos {

	public JavacinaTeste(int idade, int doses, int comorbidade, String[] postos, String[] vacinas) {
		super(idade, doses, comorbidade, postos, vacinas);
	}

	public static void main(String[] args) {
		
		var cad = new Login();
		
		
		JavacinaMetodos vac = new JavacinaMetodos(comorbidade, doses, idade, postos, vacinas);
		
		while (vac.vezes < 2) {
			
		
		vac.atendimento();
		vac.encaminhamento();
		
		vac.vezes++;

	}
	}
}
