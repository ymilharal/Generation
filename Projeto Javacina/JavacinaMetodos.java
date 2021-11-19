package JavacinaProjeto;

import java.util.Scanner;

public class JavacinaMetodos extends JavacinaEstrutura implements IJavacina { 

	public JavacinaMetodos(int idade, int doses, int comorbidade, String[] postos, String[] vacinas) {
		super(idade, doses, comorbidade, postos, vacinas);
	}

	Scanner leia = new Scanner(System.in);
	
	JavacinaEstrutura vac = new JavacinaEstrutura (idade, comorbidade, doses, postos, vacinas);
	
	int vezes  = 0;
	Login log = new Login();
		
	
@Override
public void atendimento() {
	System.out.println("\n\t\t\t***Plataforma JAVACINA efetue o cadastro para continuar**\n ");
	log.cadastro();
	log.login();
	System.out.println("\n\t\t\t\t\t===JAVACINA===\n");
	System.out.println("Olá " + log.aNome + ",  parabéns pela escolha de se vacinar e salvar não só a sua vida como a do proximo também! \n");
	System.out.print("Entre com a sua idade: ");
	idade = leia.nextInt(); 
		
}

@Override
public void encaminhamento() {
	
	if (idade >= 12) {
		
		System.out.println("Apresenta alguma comorbidade: ");
		System.out.println("0) Não apresenta.\n1) Apresenta");
		comorbidade = leia.nextInt();

		
		System.out.println("\t\t\t\t\t===Acesso liberado===\n");
	
		System.out.println("Qual dose você está procurando?(1º, 2º ou 3°[dose reforço]) ");
		doses = leia.nextInt();
	
	if (doses == 1) {
		System.out.println("\t\t\t\t\t===Guia de postos===\n");
		System.out.println(vac.postos[0] + "\n" + vac.postos[2] + "\n" + vac.postos[3]);
		
	}
	else if (doses == 2) {
		System.out.println("\t\t\t\t\t===Guia de postos/vacinas===\n");
		System.out.println(vac.postos[1] + "= " + vac.vacinas[1] + " | " + vac.vacinas[0]);
		System.out.println(vac.postos[3] + "= " + vac.vacinas[3] + " | " + vac.vacinas[0]);
		System.out.println(vac.postos[2] + "= " + vac.vacinas[0] + " | " + vac.vacinas[1] + " | " + vac.vacinas[3]);
		
	}
	else if (doses == 3 && idade >= 60 || comorbidade == 1 ) {
		
		System.out.println("\t\t\t\t\t===Guia de postos/vacinas===\n");
		System.out.println(vac.postos[2] + "= " + vac.vacinas[0] + " | " + vac.vacinas[1]);
		System.out.println(vac.postos[0] + "= " + vac.vacinas[2] + " | " + vac.vacinas[0]);
		
	}
	else if (doses == 3 && idade > 12 && idade < 60 || comorbidade == 0) {
		System.out.println("Dose de reforço liberada apenas para idosos maiores de 60 e pessoas com comorbidade.");
	}
	}
	else if (idade < 12) {
		System.out.println("Ainda não chegou sua hora.");
		System.out.println("Leia mais sobre o COVID-19 na página oficial do COVID-19 da Organização" 
		+ " Mundial da Saúde. Sintomas, prevenção, \nconselhos para viagens, e perguntas.");
	}
	
	else {
		System.out.println("Opção invalida, tente novamente...");
	}
	System.out.println("\nObrigada por utilizar nossa plataforma JAVACINA, nos envie um feedback estamos sempre abertos a melhorias!");
	System.out.println("_  _\r\n"
			+ "               ( \\/ )\r\n"
			+ "        .---.   \\j /   .-\"-.\r\n"
			+ "       /   6_6   \\/   / 4 4 \\\r\n"
			+ "       \\_  (__\\       \\_ v _/\r\n"
			+ "       //   \\\\        //   \\\\\r\n"
			+ "      ((     ))      ((     ))\r\n"
			+ "=======\"\"===\"\"========\"\"===\"\"=======\r\n"
			+ "         |||            |||\r\n"
			+ "          |              |");
}
}
