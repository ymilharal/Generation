package Exercicio07;

import java.util.Scanner;

/*7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class Paciente {

	Scanner leia = new Scanner(System.in);

		String nome;
		int idade,saude;

		public void atendimento() {
			System.out.println("Digite seu nome:  " );
			nome=leia.nextLine();
			System.out.println("Bem vindo(a) " + nome + " ao hospital Viva Bem, Viva Feliz!");
			System.out.println("Digite sua idade: ");
			idade=leia.nextInt();
			System.out.println("Apresenta sintomas de gripe?(1=sim e 2=não )");
			saude=leia.nextInt();

}

		public void encaminhamento() {
			if(idade >= 18 && saude ==1) {
				System.out.println("Não se preocupe pode ser uma infecção viral comum, mantenha \nrepouso, beba bastante água"
						+"e faça uso de analgésicos, caso não apresente melhora, volte para uma consulta. ");
}
			else if(idade >=18 && saude ==2) {
				System.out.println("Você não precisa de consulta!");

    }
			else if ( idade < 18 && saude ==1) {
				System.out.println("Você precisa estar acompanhado de"+
						"alguém maior de \n 18 anos para prosseguir com seu atendimento.");
    }
			else if ( idade < 18 && saude ==2) {
				System.out.println("Você precisa estar acompanhado de "+
            		" alguém maior de \n 18 anos para que possa seguir com o seu atendimento ");
    }
			else {
				System.out.println(" Opção invalida, tente novamente. " );
        }
}
		public void encerramento() {
			System.out.println("Obrigada por vir!");
		}
}